package chapter1.binaryfresentationfile2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/1/13
 * Time: 1:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class BooleanSimulatorTest {

    private BooleanSimulator booleanSimulator;

    @Before
    public void before(){
        booleanSimulator = new BooleanSimulator();
    }

    @Test
    public void shouldReturn1() throws Exception {
             assertEquals("1",booleanSimulator.getNumber());
    }
    @Test
    public void shouldReturn10() throws Exception {
        booleanSimulator.addOne();
        assertEquals("10",booleanSimulator.getNumber());
    }

    @Test
    public void shouldReturn11() throws Exception {
        booleanSimulator.addOne();
        booleanSimulator.addOne();
        assertEquals("11",booleanSimulator.getNumber());
    }


}
