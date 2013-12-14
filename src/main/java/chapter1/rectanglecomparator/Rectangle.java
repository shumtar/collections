package chapter1.rectanglecomparator;

/**
 * Created by taras on 12/10/13.
 */
public class Rectangle {
    int weight;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (height != rectangle.height) return false;
        if (weight != rectangle.weight) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + height;
        return result;
    }

    int height;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}