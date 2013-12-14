package chapter1.binaryfresentationfile;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 11/30/13
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerToBinaryConverter1Test {
    IntegerToBinaryConverter1 integerToBinaryConverter1;
    @Before
    public void setUp() throws Exception {
        integerToBinaryConverter1 =new IntegerToBinaryConverter1();
    }
    @Test
    public void shouldConvertValue1ToBynary() throws Exception {
        assertEquals("1", integerToBinaryConverter1.convert(1));
    }
    @Test
    public void shouldConvertValue2ToBynary() throws Exception {
        assertEquals("10", integerToBinaryConverter1.convert(2));
    }
    @Test
    public void shouldConvertValue3ToBynary() throws Exception {
        assertEquals("11", integerToBinaryConverter1.convert(3));
    }
    @Test
    public void shouldConvertValue4ToBynary() throws Exception {
        assertEquals("100", integerToBinaryConverter1.convert(4));
    }
}
