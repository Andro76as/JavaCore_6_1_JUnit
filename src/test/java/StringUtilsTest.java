import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsEmpty() {
        assertFalse(StringUtils.isEmpty("TEST"));
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty(" "));
    }

    @Test
    public void testToDouble() {
        assertEquals(3.14, StringUtils.toDouble("3.14"), 0.01);
        assertEquals(Double.NaN, StringUtils.toDouble(null), 0.01);
    }

    @Test
    public void testFromDouble() {
        double source = 3.14;
        String expected="3.14";
        String actual = StringUtils.fromDouble(source);
        assertEquals(expected, actual);
    }
}
