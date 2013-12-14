package chapter1.maxsubsum;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MaxSubSumTest {

    private MaxSubSum maxSubSum;

    @Before
    public void setUp() throws Exception {
        maxSubSum = new MaxSubSum();
    }
    @Test
    public void testTakeSumInt1() throws Exception {
        int[] arr = {1, 2, 3, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(0,4,8);
        assertEquals(8,maxSubSum.takeSumInt(arr));
    }
    @Test
    public void testTakeSumInt2() throws Exception {
        int[] arr = {-1, 2, 3, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,4,7);
        assertEquals(7,maxSubSum.takeSumInt(arr));
    }
    @Test
    public void testTakeSumInt3() throws Exception {
        int[] arr = {-1, 2, -1, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,4,3);
        assertEquals(3,maxSubSum.takeSumInt(arr));
    }
    @Test
    public void testTakeSumInt4() throws Exception {
        int[] arr = {-1, 2, -100, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,1,2);
        assertEquals(2,maxSubSum.takeSumInt(arr));
    }


    @Test
    public void testTakeSumInt21() throws Exception {
        int[] arr = {1, 2, 3, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(0,4,8);
        assertEquals(8,maxSubSum.takeSumInt2(arr));
    }
    @Test
    public void testTakeSumInt22() throws Exception {
        int[] arr = {-1, 2, 3, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,4,7);
        assertEquals(7,maxSubSum.takeSumInt2(arr));
    }
    @Test
    public void testTakeSumInt23() throws Exception {
        int[] arr = {-1, 2, -1, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,4,3);
        assertEquals(3,maxSubSum.takeSumInt2(arr));
    }
    @Test
    public void testTakeSumInt24() throws Exception {
        int[] arr = {-1, 2, -100, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,1,2);
        assertEquals(2,maxSubSum.takeSumInt2(arr));
    }



    @Test
    public void testTakeSum1() throws Exception {
        int[] arr = {1, 2, 3, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(0,4,8);
        assertEquals(subSumDataUnit,maxSubSum.takeSum(arr));
    }
    @Test
    public void testTakeSum2() throws Exception {
        int[] arr = {-1, 2, 3, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,4,7);
        assertEquals(subSumDataUnit,maxSubSum.takeSum(arr));
    }
    @Test
    public void testTakeSum3() throws Exception {
        int[] arr = {-1, 2, -1, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,4,3);
        assertEquals(subSumDataUnit,maxSubSum.takeSum(arr));
    }
    @Test
    public void testTakeSum4() throws Exception {
        int[] arr = {-1, 2, -100, 1, 1, 0};
        SubSumDataUnit subSumDataUnit = new SubSumDataUnit(1,1,2);
        assertEquals(subSumDataUnit,maxSubSum.takeSum(arr));
    }
}
