import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.storm.spout.SpoutOutputCollector;
import org.apache.storm.task.TopologyContext;
import org.apache.storm.testing.TestGlobalCount;
import org.apache.storm.testing.TestWordCounter;
import org.apache.storm.testing.TestWordSpout;
import org.apache.storm.topology.*;
import org.apache.storm.tuple.Tuple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class TopologyBuilderTest {
    public enum BuilderEnum {
        NO_BOLT,
        PUT_BOLT,
        NO_SPOUT,
        PUT_SPOUT
    }

    static final Map<String, Object> customConfig = new HashMap<>();

    static {
        customConfig.put("key1", "value1");
        customConfig.put("key2", "value2");
    }

    TopologyBuilder builder;

    @BeforeEach
    public void setUp() {
        builder = new TopologyBuilder();
    }

    @ParameterizedTest
    @MethodSource("argsSetBoltError")
    public void testObjectReaderSetBoltError(BuilderEnum builderEnum, String id, IBasicBolt bolt, Number parallelismHint, Class<? extends Throwable> expectedException) {
        switch (builderEnum) {
            case PUT_BOLT:
                builder.setBolt("bolt2", new TestGlobalCount());
                break;
            case NO_BOLT:
            default:
                break;
        }

        try {
            builder.setBolt(id, bolt, parallelismHint);
        } catch (Exception e) {
            assertEquals(expectedException, e.getClass());

            return;
        }

        assertNull(expectedException);
    }

    static Stream<Arguments> argsSetBoltError() {
        return Stream.of(
                Arguments.of(BuilderEnum.NO_BOLT, null, new TestWordCounter(), 0, IllegalArgumentException.class), // T1
                Arguments.of(BuilderEnum.NO_BOLT, "bolt1", null, 0, IllegalArgumentException.class), // T2
                Arguments.of(BuilderEnum.NO_BOLT, "bolt1", new TestWordCounter(), -1, IllegalArgumentException.class), // T3
                Arguments.of(BuilderEnum.NO_BOLT, "bolt1", new TestWordCounter(), 0, IllegalArgumentException.class), // T4
//                Arguments.of(BuilderEnum.NO_BOLT, "", new TestWordCounter(), 1, IllegalArgumentException.class), // T5
//                Arguments.of(BuilderEnum.NO_BOLT, " ", new TestWordCounter(), 1, IllegalArgumentException.class), // T6
//                Arguments.of(BuilderEnum.NO_BOLT, "bolt1", invalidBasicBolt(), 1, IllegalArgumentException.class), // T7
                Arguments.of(BuilderEnum.PUT_BOLT, "bolt2", new TestWordCounter(), 1, IllegalArgumentException.class) // T10
        );
    }

    @ParameterizedTest
    @MethodSource("argsSetBolt")
    public void testObjectReaderSetBolt(BuilderEnum builderEnum, String id, TestWordCounter bolt, Number parallelismHint, Map<String, Object> checkConfigMap) {
        BoltDeclarer boltDeclarer = null;

        switch (builderEnum) {
            case PUT_BOLT:
                builder.setBolt("bolt2", new TestGlobalCount());
                break;
            case NO_BOLT:
            default:
                break;
        }

        try {
            boltDeclarer = builder.setBolt(id, bolt, parallelismHint);
        } catch (Exception e) {
            assertNull(e);
        }

        assertNotNull(boltDeclarer);

        Map<String, Object> boltConfigMap = boltDeclarer.getComponentConfiguration();
        assertEquals(checkConfigMap.size(), boltConfigMap.size());
        for (Map.Entry<String, Object> entry : checkConfigMap.entrySet()) {
            assertEquals(entry.getValue(), boltConfigMap.get(entry.getKey()));
        }
    }

    static Stream<Arguments> argsSetBolt() {
        return Stream.of(
//                Arguments.of(BuilderEnum.NO_BOLT, "bolt1", new TestWordCounter(), 0), // T8
                Arguments.of(BuilderEnum.NO_BOLT, "bolt1", new TestWordCounter(), 1, new HashMap<String, Object>()), // T9
                Arguments.of(BuilderEnum.PUT_BOLT, "bolt3", new TestWordCounter(), 1, new HashMap<String, Object>()), // T11
                Arguments.of(BuilderEnum.PUT_BOLT, "bolt3", new TestWordCounter(), null, new HashMap<String, Object>()), // T12
                Arguments.of(BuilderEnum.PUT_BOLT, "bolt3", notNullConfigBasicBolt(), 1, customConfig) // T13
        );
    }

    @ParameterizedTest
    @MethodSource("argsSetSpoutError")
    public void testObjectReaderSetSpoutError(BuilderEnum builderEnum, String id, IRichSpout bolt, Number parallelismHint, Class<? extends Throwable> expectedException) {
        switch (builderEnum) {
            case PUT_SPOUT:
                builder.setSpout("spout2", new TestWordSpout());
                break;
            case NO_SPOUT:
            default:
                break;
        }

        try {
            builder.setSpout(id, bolt, parallelismHint);
        } catch (Exception e) {
            assertEquals(expectedException, e.getClass());

            return;
        }

        assertNull(expectedException);
    }

    static Stream<Arguments> argsSetSpoutError() {
        return Stream.of(
                Arguments.of(BuilderEnum.NO_SPOUT, null, new TestWordSpout(), 0, IllegalArgumentException.class), // T1
                Arguments.of(BuilderEnum.NO_SPOUT, "spout1", null, 0, IllegalArgumentException.class), // T2
                Arguments.of(BuilderEnum.NO_SPOUT, "spout1", new TestWordSpout(), -1, IllegalArgumentException.class), // T3
                Arguments.of(BuilderEnum.NO_SPOUT, "spout1", new TestWordSpout(), 0, IllegalArgumentException.class), // T4
//                Arguments.of(BuilderEnum.NO_SPOUT, "", new TestWordSpout(), 1, IllegalArgumentException.class), // T6
//                Arguments.of(BuilderEnum.NO_SPOUT, " ", new TestWordSpout(), 1, IllegalArgumentException.class), // T7
//                Arguments.of(BuilderEnum.NO_SPOUT, "spout1", invalidSpout(), 1, IllegalArgumentException.class), // T8
                Arguments.of(BuilderEnum.PUT_SPOUT, "spout2", new TestWordSpout(), 1, IllegalArgumentException.class) // T10
        );
    }

    @ParameterizedTest
    @MethodSource("argsSetSpout")
    public void testObjectReaderSetSpout(BuilderEnum builderEnum, String id, IRichSpout spout, Number parallelismHint, Map<String, Object> checkConfigMap) {
        SpoutDeclarer boltDeclarer = null;

        switch (builderEnum) {
            case PUT_BOLT:
                builder.setSpout("spout2", new TestWordSpout());
                break;
            case NO_BOLT:
            default:
                break;
        }

        try {
            boltDeclarer = builder.setSpout(id, spout, parallelismHint);
        } catch (Exception e) {
            assertNull(e);
        }

        assertNotNull(boltDeclarer);

        Map<String, Object> boltConfigMap = boltDeclarer.getComponentConfiguration();
        assertEquals(checkConfigMap.size(), boltConfigMap.size());
        for (Map.Entry<String, Object> entry : checkConfigMap.entrySet()) {
            assertEquals(entry.getValue(), boltConfigMap.get(entry.getKey()));
        }
    }

    static Stream<Arguments> argsSetSpout() {
        return Stream.of(
                Arguments.of(BuilderEnum.NO_SPOUT, "spout1", new TestWordSpout(), null, new HashMap<String, Object>()), // T5
                Arguments.of(BuilderEnum.NO_SPOUT, "spout1", new TestWordSpout(), 1, new HashMap<String, Object>()), // T9
                Arguments.of(BuilderEnum.PUT_BOLT, "spout1", notNullConfigBasicSpout(), 1, customConfig) // T13
        );
    }

//    @Test
//    public void test() {
//        TopologyBuilder builder = new TopologyBuilder();
//
//        builder.setSpout("1", new TestWordSpout(true), 5); // Group
//        builder.setSpout("2", new TestWordSpout(true), 3); // Group
//        builder.setBolt("3", new TestWordCounter(), 3) // Set bolt on both groups
//                .fieldsGrouping("1", new Fields("word"))
//                .fieldsGrouping("2", new Fields("word"));
//        builder.setBolt("4", new TestGlobalCount()).globalGrouping("1"); // Set bold only on first group
//
//
//        StormTopology topology = builder.createTopology();
//
//        Map<String, SpoutSpec> mapSpouts = topology.get_spouts();
//        System.out.println(mapSpouts.get("1").toString());
//    }

    private static IBasicBolt invalidBasicBolt() {
        IBasicBolt invalidBasicBolt = Mockito.mock(IBasicBolt.class);

        // Simulate a runtime exception when execute method is called
        doThrow(new RuntimeException("Errore intenzionale nel bolt")).when(invalidBasicBolt).execute(Mockito.any(Tuple.class), Mockito.any(BasicOutputCollector.class));

        // Define other methods to do nothing or return null as needed
        Mockito.doNothing().when(invalidBasicBolt).prepare(Mockito.anyMap(), Mockito.any(TopologyContext.class));
        Mockito.doNothing().when(invalidBasicBolt).cleanup();
        Mockito.doNothing().when(invalidBasicBolt).declareOutputFields(Mockito.any(OutputFieldsDeclarer.class));
        Mockito.when(invalidBasicBolt.getComponentConfiguration()).thenReturn(null);


        return invalidBasicBolt;
    }

    private static IBasicBolt notNullConfigBasicBolt() {
        TestWordCounter spyTestWordCounter = spy(new TestWordCounter());

        doReturn(customConfig).when(spyTestWordCounter).getComponentConfiguration();


        return spyTestWordCounter;
    }

    private static IRichSpout invalidSpout() {
        IRichSpout invalidSpout = Mockito.mock(IRichSpout.class);

        // Simulate a runtime exception when nextTuple method is called
        doThrow(new RuntimeException("Errore intenzionale nello spout")).when(invalidSpout).nextTuple();

        // Define other methods to do nothing or return null as needed
        doNothing().when(invalidSpout).open(Mockito.anyMap(), Mockito.any(TopologyContext.class), Mockito.any(SpoutOutputCollector.class));
        doNothing().when(invalidSpout).close();
        doNothing().when(invalidSpout).activate();
        doNothing().when(invalidSpout).deactivate();
        doNothing().when(invalidSpout).ack(Mockito.any(Object.class));
        doNothing().when(invalidSpout).fail(Mockito.any(Object.class));
        when(invalidSpout.getComponentConfiguration()).thenReturn(null);
        Mockito.doNothing().when(invalidSpout).declareOutputFields(Mockito.any(OutputFieldsDeclarer.class));

        return invalidSpout;
    }

    private static IRichSpout notNullConfigBasicSpout() {
        TestWordSpout spyTestWordSpout = spy(new TestWordSpout());

        Map<String, Object> customConfig = new HashMap<>();
        customConfig.put("key1", "value1");
        customConfig.put("key2", "value2");
        doReturn(customConfig).when(spyTestWordSpout).getComponentConfiguration();

        return spyTestWordSpout;
    }
}
