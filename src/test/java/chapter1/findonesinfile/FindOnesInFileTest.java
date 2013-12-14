package chapter1.findonesinfile;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/4/13
 * Time: 12:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindOnesInFileTest {
    FindOnesInFile findOnesInFile;
    @Before
    public void setUp() throws Exception {
        findOnesInFile=new FindOnesInFile();
    }

    @Test
    public void shouldTestCountOnesInNumber1ActualResult1() throws Exception {
        assertEquals(1,findOnesInFile.count(1));
    }
    @Test
    public void shouldTestCountOnesInNumber2ActualResult1() throws Exception {
        assertEquals(1,findOnesInFile.count(2));
    }
    @Test
    public void shouldTestCountOnesInNumber3ActualResult2() throws Exception {
        assertEquals(2,findOnesInFile.count(3));
    }
    @Test
    public void shouldTestCountOnesInNumber100ActualResult3() throws Exception {
        assertEquals(3,findOnesInFile.count(100));
    }
}
