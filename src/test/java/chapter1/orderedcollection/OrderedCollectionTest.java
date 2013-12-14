package chapter1.orderedcollection;

import chapter1.collection.Collection;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * Created by taras on 12/9/13.
 */
@SuppressWarnings("unchecked")
public class OrderedCollectionTest {
    public static final Integer SOME_VALUE_CONSTANT = 10;
    public static final Integer ANOTHER_VALUE_CONSTANT = 11;
    public static final Integer MINIMUM_ELEMENT = 1;
    public static final Integer MAXIMUM_ELEMENT = 15;

    private OrderedCollection<Integer> integerCollection;

    @Before
    public void setUp() throws Exception {
        integerCollection = new OrderedCollection<>(3);
    }

    @Test
    public void testFindMaxOneElement() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        assertEquals(SOME_VALUE_CONSTANT,integerCollection.findMax());
    }
    @Test
    public void testFindMaxNoElements() throws Exception {
        assertNull(integerCollection.findMax());
    }
	@Test
    public void testFindMaxEqualElements() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(SOME_VALUE_CONSTANT);
        assertEquals(SOME_VALUE_CONSTANT, integerCollection.findMax());
    }
	@Test
    public void testFindMaxNotEqualElements() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(MINIMUM_ELEMENT);
        assertEquals(SOME_VALUE_CONSTANT, integerCollection.findMax());
    }
    @Test
    public void testFindMaxNotEqualElements2() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(MINIMUM_ELEMENT);
        integerCollection.insert(MAXIMUM_ELEMENT);
        assertEquals(MAXIMUM_ELEMENT, integerCollection.findMax());
    }
    //
    @Test
    public void testFindMinOneElement() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        assertEquals(SOME_VALUE_CONSTANT,integerCollection.findMin());
    }
    @Test
    public void testFindMinNoElements() throws Exception {
        assertNull(integerCollection.findMin());
    }
    @Test
    public void testFindMinEqualElements() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(SOME_VALUE_CONSTANT);
        assertEquals(SOME_VALUE_CONSTANT, integerCollection.findMin());
    }
    @Test
    public void testFindMinNotEqualElements() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(MINIMUM_ELEMENT);
        assertEquals(MINIMUM_ELEMENT, integerCollection.findMin());
    }
    @Test
    public void testFindMinNotEqualElements2() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(MINIMUM_ELEMENT);
        integerCollection.insert(MAXIMUM_ELEMENT);
        assertEquals(MINIMUM_ELEMENT, integerCollection.findMin());
    }
}