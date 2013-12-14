package chapter1.rectanglecomparator;

import java.util.Comparator;

/**
 * Created by taras on 12/10/13.
 */
public class DefaultRectangleComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        int o1Square = o1.getHeight() * o1.getWeight();
        int o2Square = o2.getHeight() * o2.getWeight();
        if(o1Square<o2Square)return -1;
        else if(o1Square==o2Square)return 0;
        else return 1;
    }
}
