package chapter1.collection;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CollectionTest {
    public static final Integer SOME_VALUE_CONSTANT = new Integer(10);
    public static final Integer ANOTHER_VALUE_CONSTANT = new Integer(11);
    private Collection<Integer> integerCollection;

    @Before
    public void setUp() throws Exception {
        integerCollection = new Collection<>(3);
    }

    @Test
    public void shouldTestCollectionIsEmptyWhenItIsEmpty() throws Exception {
        assertTrue(integerCollection.isEmpty());
    }

    @Test
    public void shouldTestCollectionIsNotEmptyWhenItIsNotEmpty() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        System.out.println(integerCollection.isEmpty());
        assertFalse(integerCollection.isEmpty());
    }

    @Test
    public void shouldTestMakeEmptyCollectionMustBeEmpty() throws Exception {
        integerCollection.makeEmpty();
        assertTrue(integerCollection.isEmpty());
    }

    @Test
    public void shouldTestMakeEmptyWhenInitialCollectionNotEmptyCollectionMustBeEmpty() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.makeEmpty();
        assertTrue(integerCollection.isEmpty());
    }

    @Test
    public void shouldNotSaveCrowdedCollection() throws Exception {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(SOME_VALUE_CONSTANT);
        assertTrue(integerCollection.insert(SOME_VALUE_CONSTANT));
        assertFalse(integerCollection.insert(SOME_VALUE_CONSTANT));
    }

    @Test
    public void testRemoveEmptyCollection() {
        assertFalse(integerCollection.remove(SOME_VALUE_CONSTANT));
    }

    @Test
    public void testRemoveNotEmptyCollection() {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(SOME_VALUE_CONSTANT);
        assertTrue(integerCollection.remove(SOME_VALUE_CONSTANT));
        assertTrue(integerCollection.isEmpty());
    }

    @Test
    public void testRemoveNotEmptyCollectionWithAnotherConstant() {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(SOME_VALUE_CONSTANT);
        integerCollection.insert(ANOTHER_VALUE_CONSTANT);
        assertTrue(integerCollection.remove(SOME_VALUE_CONSTANT));
        assertFalse(integerCollection.isEmpty());
    }

    @Test
    public void testRemoveCollectionWithOneAnotherConstant() {
        integerCollection.insert(ANOTHER_VALUE_CONSTANT);
        assertFalse(integerCollection.remove(SOME_VALUE_CONSTANT));
        assertFalse(integerCollection.isEmpty());
    }

    @Test
    public void testIsPresentEmptyCollection() {
        assertFalse(integerCollection.isPresent(SOME_VALUE_CONSTANT));
    }

    @Test
    public void testIsPresentOneValueCollection() {
        integerCollection.insert(SOME_VALUE_CONSTANT);
        assertTrue(integerCollection.isPresent(SOME_VALUE_CONSTANT));
    }

}