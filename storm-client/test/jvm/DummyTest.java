import org.apache.storm.utils.ObjectReader;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DummyTest {
    @Test
    public void testGetStrings_Null() {
        List<String> result = ObjectReader.getStrings(null);
        assertTrue(result.isEmpty());
    }

}
