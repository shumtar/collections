package chapter1.binaryfresentationfile2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/1/13
 * Time: 12:24 AM
 * To change this template use File | Settings | File Templates.
 */
class BooleanSimulator {
    public static final int ONE_VALUE = 1;
    public static final int ZERO_VALUE = 0;
    public static final int FIRST_ELEMEN_OF_ARRAY = 0;
    ArrayList<IntegerBox> myBooleanPresentation = new ArrayList<IntegerBox>();

    BooleanSimulator() {
        IntegerBox integerBox = new IntegerBox();
        myBooleanPresentation.add(integerBox);
    }

    public BooleanSimulator addOne() {
        addOneAndNotReturnThis();
        return this;
    }

    private void addOneAndNotReturnThis() {
        changeArray(myBooleanPresentation.size() - 1);
    }

    private void changeArray(int elementOfArray) {
        if (!addOneToZero(myBooleanPresentation.get(elementOfArray))) {
            if (elementOfArray == FIRST_ELEMEN_OF_ARRAY) {
                changeArrayElementsToNull();
                Collections.reverse(myBooleanPresentation);
                myBooleanPresentation.add(new IntegerBox());
                Collections.reverse(myBooleanPresentation);
            }else {
                changeArray(elementOfArray-1);
            }
        }

    }

    private void changeArrayElementsToNull() {
        for (IntegerBox element : myBooleanPresentation) {
            element.setI(ZERO_VALUE);
        }
    }

    private boolean addOneToZero(IntegerBox integerBox) {
        if (integerBox.getI() == ONE_VALUE) {
            return false;
        }
        integerBox.setI(ONE_VALUE);
        return true;
    }

    public String getNumber() {
        StringBuilder sb = new StringBuilder();
        for(IntegerBox i:myBooleanPresentation){
            sb.append(i.toString());
        }
        return sb.toString();

    }
}
