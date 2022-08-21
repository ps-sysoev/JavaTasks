package task.pair;

import java.util.Objects;

public class Pair {
    private final String firstKey;
    private final String secondKey;

    private Pair(String firstKey, String secondKey) {
        this.firstKey = firstKey;
        this.secondKey = secondKey;
    }

    public static Pair of(String firstKey, String secondKey) {
        if (Objects.isNull(firstKey) || Objects.isNull(secondKey)) {
            throw new NullPointerException();
        }

        if (firstKey.isEmpty() || secondKey.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter: firstKey or secondKey is empty.");
        }

        return new Pair(firstKey, secondKey);
    }

    public String getFirstKey() {
        return firstKey;
    }

    public String getSecondKey() {
        return secondKey;
    }
}