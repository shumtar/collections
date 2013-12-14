package chapter1.rectanglecomparator;

import java.util.Comparator;
import chapter1.rectanglecomparator.Rectangle;
/**
 * Created by taras on 12/10/13.
 */
public class RectangleComparator<T extends Rectangle> {

    public T findMax(T[] arr, Comparator<Rectangle> cmp) {
        T temp = null;
        for (int i = 0; i < arr.length; i++) {
            T elementArray = arr[i];
            if (elementArray != null) {
                if (temp == null) {
                    temp = elementArray;
                } else {
                    if (cmp.compare(temp, elementArray) < 0) {
                        temp = elementArray;
                    }
                }
            }
        }
        return temp;
    }



}
