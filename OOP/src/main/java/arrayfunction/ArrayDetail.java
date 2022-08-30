package arrayfunction;

import java.util.Objects;

public class ArrayDetail {
    private int firstElement;
    private int lastElement;
    private int sumBetweenFirstAndLast;

    public int getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(int firstElement) {
        this.firstElement = firstElement;
    }

    public int getLastElement() {
        return lastElement;
    }

    public void setLastElement(int lastElement) {
        this.lastElement = lastElement;
    }

    public int getSumBetweenFirstAndLast() {
        return sumBetweenFirstAndLast;
    }

    public void setSumBetweenFirstAndLast(int sumBetweenFirstAndLast) {
        this.sumBetweenFirstAndLast = sumBetweenFirstAndLast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ArrayDetail that = (ArrayDetail) o;

        return firstElement == that.firstElement
                && lastElement == that.lastElement
                && sumBetweenFirstAndLast == that.sumBetweenFirstAndLast;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstElement, lastElement, sumBetweenFirstAndLast);
    }

    @Override
    public String toString() {
        return "ArrayDetail{" +
                "firstElement=" + firstElement +
                ", lastElement=" + lastElement +
                ", sumBetweenFirstAndLast=" + sumBetweenFirstAndLast +
                '}';
    }
}