package chapter1.binaryfresentationfile2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/1/13
 * Time: 1:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerToBinaryConverter2Test {

    private IntegerToBinaryConverter2 integerToBinaryConverter2;

    @Before
    public void setUp() throws Exception {
        integerToBinaryConverter2 = new IntegerToBinaryConverter2();
    }

    @Test
    public void testConvert1Return1() throws Exception {
        assertEquals("1",integerToBinaryConverter2.convert(1));

    }
    @Test
    public void testConvert2Return10() throws Exception {
        assertEquals("10",integerToBinaryConverter2.convert(2));
    }
    @Test
    public void testConvert3Return11() throws Exception {
        assertEquals("11",integerToBinaryConverter2.convert(3));
    }
    @Test
    public void testConvert4Return100() throws Exception {
        assertEquals("100",integerToBinaryConverter2.convert(4));
    }
    /*@Test
    public void testConvert100Return1100100() throws Exception {
        assertEquals("1100100",integerToBinaryConverter2.convert(100));

    }*/
}



