package chapter1.orderedcollection;

import chapter1.collection.Collection;

public class OrderedCollection<AnyType extends Comparable<? super AnyType>> extends Collection {

    public OrderedCollection(int size) {
        super(size);
    }

    private AnyType findExtr(boolean isMax) {
        AnyType a = null;
        if (isEmpty()) {
            return a;
        }
        

        for (int i = 0; i < elementsCollection.length; i++) {

            if (isNotNull(elementsCollection[i])) {
            	if(a==null){
            		a=(AnyType) elementsCollection[i];
            	}else {
            		AnyType elementArray = (AnyType) elementsCollection[i];
                    if (isMax) {
                        if (elementArray.compareTo(a) > 0) {
                            a = elementArray;
                        }
                    } else {
                        if (elementArray.compareTo(a) < 0) {
                            a = elementArray;
                        }
                    }
				}
            }
        }
        return a;
    }


    public AnyType findMax() {
        return findExtr(true);
    }
    public AnyType findMin() {
        return findExtr(false);
    }
}
