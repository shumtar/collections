package chapter1.maxsubsum;

/**
 * Created by taras on 12/12/13.
 */
public class SubSumDataUnit {
    int start;

    public SubSumDataUnit() {
    }

    public SubSumDataUnit(int start, int end, int sum) {
        this.start = start;
        this.end = end;
        this.sum = sum;
    }

    int end;
    int sum;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubSumDataUnit)) return false;

        SubSumDataUnit that = (SubSumDataUnit) o;

        if (end != that.end) return false;
        if (start != that.start) return false;
        if (sum != that.sum) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = start;
        result = 31 * result + end;
        result = 31 * result + sum;
        return result;
    }

    @Override
    public String toString() {
        return "SubSumDataUnit{" +
                "start=" + start +
                ", end=" + end +
                ", sum=" + sum +
                '}';
    }
}
