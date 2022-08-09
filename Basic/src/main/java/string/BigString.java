package string;

import java.util.Objects;

public class BigString {
    private int length;
    private String value;

    public BigString(int length, String value) {
        if (length < 0) {
            throw new IllegalArgumentException("Incorrect parameter: length <= 0");
        }

        if (value == null) {
            throw new IllegalArgumentException("Incorrect parameter: value is null or is empty");
        }

        this.length = length;
        this.value = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Incorrect parameter: length <= 0");
        }

        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Incorrect parameter: value is null or is empty");
        }

        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BigString bigString = (BigString) o;

        return length == bigString.length && value.equals(bigString.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, value);
    }

    @Override
    public String toString() {
        return "BigString{" +
                "length=" + length +
                ", value='" + value + '\'' +
                '}';
    }
}