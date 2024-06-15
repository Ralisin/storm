import org.apache.storm.utils.ObjectReader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectReaderTest {
    @ParameterizedTest
    @MethodSource("argsError")
    public void testObjectReaderError(Object o, Integer defaultValue, Class<? extends Throwable> expectedException) {
        try {
            ObjectReader.getInt(o, defaultValue);
        } catch (Exception e) {
            assertEquals(expectedException, e.getClass());

            return;
        }

        assertNull(expectedException);
    }

    static Stream<Arguments> argsError() {
        return Stream.of(
                Arguments.of(null, null, null), //T1
                Arguments.of((long) (Integer.MAX_VALUE) + 1, 1, IllegalArgumentException.class), // T11
                Arguments.of((long) (Integer.MIN_VALUE) - 1, 1, IllegalArgumentException.class), // T12
                Arguments.of((double) (Integer.MAX_VALUE) + 1, 1, IllegalArgumentException.class), // T16
                Arguments.of((double) (Integer.MIN_VALUE) - 1, 1, IllegalArgumentException.class), // T17
                Arguments.of(2.3F, 1, IllegalArgumentException.class), // T18
                Arguments.of(1.1, 1, IllegalArgumentException.class), //T19
                Arguments.of("2147483648", 1, NumberFormatException.class), //T19
                Arguments.of("-2147483649", 1, NumberFormatException.class), //T19
                Arguments.of("1.2", 1, NumberFormatException.class), //T19
                Arguments.of("Stringa", 1, NumberFormatException.class) //T19
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    public void testObjectReader(Object o, Integer defaultValue, Integer expectedValue) {
        try {
            Integer result = ObjectReader.getInt(o, defaultValue);

            assertEquals(expectedValue, result);
            assertEquals(Integer.class, result.getClass());
        } catch (Exception e) {
            assertNull(e.getClass());
        }
    }

    static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(null, -1, -1), // T2
                Arguments.of(null, 0, 0), // T3
                Arguments.of(null, 1, 1), // T4
                Arguments.of(1, 0, 1), // T5
                Arguments.of((short) 1, 0, 1), // T6
                Arguments.of((byte) 1, 0, 1), // T7
                Arguments.of((long) 1, 0, 1), // T8
                Arguments.of((long) Integer.MAX_VALUE, 1, 2147483647), // T9
                Arguments.of((long) Integer.MIN_VALUE, 1, -2147483648), // T10
//                Arguments.of((double) 1, 0, 1), // T13 - IllegalArgumentException
//                Arguments.of((double) Integer.MAX_VALUE, 1, 2147483647), // T14 - IllegalArgumentException
//                Arguments.of((double) Integer.MIN_VALUE, 1, -2147483648), // T15 - IllegalArgumentException
                Arguments.of("1", 0, 1), // T20
                Arguments.of("2147483647", 0, 2147483647), // T21
                Arguments.of("-2147483648", 0, -2147483648) // T22
        );
    }
}
