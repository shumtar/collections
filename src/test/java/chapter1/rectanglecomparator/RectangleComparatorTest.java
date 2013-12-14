package chapter1.rectanglecomparator;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by taras on 12/10/13.
 */
public class RectangleComparatorTest {

    public static final Rectangle EQUAL_RECTANGLE = new Rectangle(1, 1);
    public static final Rectangle SMALL_RECTANGLE = new Rectangle(1, 0);
    public static final Rectangle LARGE_RECTANGLE = new Rectangle(2, 2);
    private RectangleComparator rectangleComparator;

    @Before
    public void setUp() throws Exception {
        rectangleComparator = new RectangleComparator();
    }

    @Test
    public void testFindMax() throws Exception {
        Rectangle[] rectangleArray={EQUAL_RECTANGLE,EQUAL_RECTANGLE};
        DefaultRectangleComparator defaultRectangleComparator = new DefaultRectangleComparator();
        assertEquals(EQUAL_RECTANGLE,rectangleComparator.findMax(rectangleArray,defaultRectangleComparator));
    }
    @Test
    public void testFindMaxLargeSmall() throws Exception {
        Rectangle[] rectangleArray={EQUAL_RECTANGLE,LARGE_RECTANGLE};
        DefaultRectangleComparator defaultRectangleComparator = new DefaultRectangleComparator();
        assertEquals(LARGE_RECTANGLE,rectangleComparator.findMax(rectangleArray,defaultRectangleComparator));
    }
    @Test
    public void testFindMaxLargeSmall2() throws Exception {
        Rectangle[] rectangleArray={LARGE_RECTANGLE,EQUAL_RECTANGLE};
        DefaultRectangleComparator defaultRectangleComparator = new DefaultRectangleComparator();
        assertEquals(LARGE_RECTANGLE,rectangleComparator.findMax(rectangleArray,defaultRectangleComparator));
    }
}
