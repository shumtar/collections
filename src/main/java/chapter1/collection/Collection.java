package chapter1.collection;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/6/13
 * Time: 1:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class Collection<T> {
    private int size;
    protected Object[] elementsCollection;

    public Collection(int size) {

        this.size = size;
        elementsCollection = new Object[size];
    }

    public boolean isEmpty() {
        for (Object t1 : elementsCollection) {
            if (t1 != null) return false;
        }
        return true;
    }

    public boolean isPresent(T t) {
        for (int i = 0; i < elementsCollection.length; i++) {
            if (checkElementIsEqualsWithParameter(t, i)) {
                return true;
            }
        }
        return false;
    }

    public void makeEmpty() {
        elementsCollection = new Object[size];
    }

    public boolean insert(T t) {
        if (t == null) throw new IllegalArgumentException();
        for (int i = 0; i < elementsCollection.length; i++) {
            if (elementsCollection[i] == null) {
                elementsCollection[i] = t;
                return true;
            }
        }
        return false;

    }

    public boolean remove(T t) {
        int intexToMove = -1;
        boolean removeOperationWas = false;
        for (int i = 0; i < elementsCollection.length; i++) {

            if (checkElementIsEqualsWithParameter(t, i)) {

                if (!removeOperationWas) {
                    intexToMove = i;
                    removeOperationWas = true;
                }
                elementsCollection[i] = null;

            } else {
                if (removeOperationWas) {
                    elementsCollection[intexToMove] = elementsCollection[i];
                    elementsCollection[i] = null;
                    intexToMove++;
                }
            }
        }
        return removeOperationWas;
    }

    private boolean checkElementIsEqualsWithParameter(T t, int i) {
        return (elementsCollection[i] != null) && (elementsCollection[i].equals(t));
    }

    protected boolean isNotNull(T t){
        if(t==null)return false;
        return true;
    }
}
