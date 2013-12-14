package chapter1.permutter;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/4/13
 * Time: 12:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class CharPermutterTest {

    private CharPermutter charPermutter;

    @BeforeClass
    public static void beforeTest(){

    }

    @Before
    public void setUp() throws Exception {
        charPermutter = new CharPermutter();
    }

    @Test
    public void testPermute() throws Exception {
        String s="";
        for(int i=1;i<10;i++){
          s+="q";
          System.out.println(i+"= "+charPermutter.count(s));
        }
    }
}
