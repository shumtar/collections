package chapter1.rectanglecomparator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by taras on 12/10/13.
 */
public class DefaultRectangleComparatorTest {

    public static final Rectangle EQUAL_RECTANGLE = new Rectangle(1, 1);
    public static final Rectangle SMALL_RECTANGLE = new Rectangle(1, 0);
    public static final Rectangle LARGE_RECTANGLE = new Rectangle(2, 2);
    private DefaultRectangleComparator defaultRectangleComparator;

    @Before
    public void setUp() throws Exception {
        defaultRectangleComparator = new DefaultRectangleComparator();
    }

    @Test
    public void testCompareEqualObjects() throws Exception {
        int compareResult = defaultRectangleComparator.compare(EQUAL_RECTANGLE, EQUAL_RECTANGLE);
        assertEquals(0,compareResult);
    }
    @Test
    public void testCompareSmallLargeObjects() throws Exception {
        int compareResult = defaultRectangleComparator.compare(SMALL_RECTANGLE, LARGE_RECTANGLE);
        assertEquals(-1,compareResult);
    }
}
