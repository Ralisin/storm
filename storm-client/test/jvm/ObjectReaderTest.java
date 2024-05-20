import org.apache.storm.utils.ObjectReader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectReaderTest {
    @Test
    public void testGetStrings_Null() {
        List<String> result = ObjectReader.getStrings(null);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetStrings_String() {
        List<String> result = ObjectReader.getStrings("test");
        assertEquals(Collections.singletonList("test"), result);
    }

    @Test
    public void testGetStrings_Collection() {
        List<String> result = ObjectReader.getStrings(Arrays.asList("a", "b", "c"));
        assertEquals(Arrays.asList("a", "b", "c"), result);
    }

    @Test
    public void testGetStrings_CollectionWithNulls() {
        List<String> result = ObjectReader.getStrings(Arrays.asList("a", null, "c"));
        assertEquals(Arrays.asList("a", "c"), result);
    }

    @Test
    public void testGetStrings_InvalidObject() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getStrings(123);
            }
        });
    }

    @Test
    public void testGetString_Null() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getString(null);
            }
        });
    }

    @Test
    public void testGetString_Object() {
        assertEquals("test", ObjectReader.getString("test"));
    }

    @Test
    public void testGetStringWithDefault_Null() {
        assertEquals("default", ObjectReader.getString(null, "default"));
    }

    @Test
    public void testGetStringWithDefault_Object() {
        assertEquals("test", ObjectReader.getString("test", "default"));
    }

    @Test
    public void testGetStringWithDefault_InvalidObject() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getString(123, "default");
            }
        });
    }

    @Test
    public void testGetInt_ValidInteger() {
        assertEquals(42, ObjectReader.getInt(42));
    }

    @Test
    public void testGetInt_ValidString() {
        assertEquals(42, ObjectReader.getInt("42"));
    }

    @Test
    public void testGetInt_Null() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getInt(null);
            }
        });
    }

    @Test
    public void testGetIntWithDefault_Null() {
        assertEquals(10, ObjectReader.getInt(null, 10));
    }

    @Test
    public void testGetIntWithDefault_ValidString() {
        assertEquals(42, ObjectReader.getInt("42", 10));
    }

    @Test
    public void testGetIntWithDefault_InvalidString() {
        assertThrows(NumberFormatException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getInt("abc", 10);
            }
        });
    }

    @Test
    public void testGetLong_ValidLong() {
        assertEquals(42L, ObjectReader.getLong(42L));
    }

    @Test
    public void testGetLong_ValidString() {
        assertEquals(42L, ObjectReader.getLong("42"));
    }

    @Test
    public void testGetLong_Null() {
        assertNull(ObjectReader.getLong(null, null));
    }

    @Test
    public void testGetLongWithDefault_Null() {
        assertEquals(10L, ObjectReader.getLong(null, 10L));
    }

    @Test
    public void testGetLongWithDefault_ValidString() {
        assertEquals(42L, ObjectReader.getLong("42", 10L));
    }

    @Test
    public void testGetLongWithDefault_InvalidString() {
        assertThrows(NumberFormatException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getLong("abc", 10L);
            }
        });
    }

    @Test
    public void testGetDouble_ValidDouble() {
        assertEquals(42.0, ObjectReader.getDouble(42.0));
    }

    @Test
    public void testGetDouble_Null() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getDouble(null);
            }
        });
    }

    @Test
    public void testGetDoubleWithDefault_Null() {
        assertEquals(10.0, ObjectReader.getDouble(null, 10.0));
    }

    @Test
    public void testGetDoubleWithDefault_ValidDouble() {
        assertEquals(42.0, ObjectReader.getDouble(42.0, 10.0));
    }

    @Test
    public void testGetBoolean_ValidBoolean() {
        assertTrue(ObjectReader.getBoolean(true, false));
    }

    @Test
    public void testGetBoolean_Null() {
        assertFalse(ObjectReader.getBoolean(null, false));
    }

    @Test
    public void testGetBoolean_InvalidObject() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                ObjectReader.getBoolean(123, false);
            }
        });
    }
}
