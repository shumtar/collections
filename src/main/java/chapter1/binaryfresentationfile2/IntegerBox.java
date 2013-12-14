package chapter1.binaryfresentationfile2;

/**
 * Created with IntelliJ IDEA.
 * User: taras
 * Date: 12/1/13
 * Time: 12:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerBox {
    public enum State {
        Modifed, NotModifed, StartState;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "" + i;
    }

    int i = 1;
    State state = State.StartState;
}
