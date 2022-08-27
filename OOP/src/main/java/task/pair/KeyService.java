package task.pair;

import java.math.BigInteger;
import java.util.Objects;

public class KeyService {
    private final char[] numbers = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * Метод берет два ключа, отбирает из этих ключей только цифры, образуя из них значение
     * объединяет 1-ый ключ с 2-ым в огромное число и возвращает его.
     *
     * @param pair пара ключей
     * @return значение
     */
    public BigInteger getHash(Pair pair) {
        if (Objects.isNull(pair)) {
            throw new IllegalArgumentException("Incorrect parameter: pair is null.");
        }

        String firstKey = pair.getFirstKey();
        String secondKey = pair.getSecondKey();
        String analyzedString = firstKey + secondKey;

        StringBuilder hashString = new StringBuilder();

        for (int i = 0; i < analyzedString.length(); i++) {
            char chr = analyzedString.charAt(i);

            if (contains(chr)) {
                hashString.append(chr);
            }
        }

        return hashString.length() > 0 ? new BigInteger(hashString.toString()) : BigInteger.ZERO;
    }

    private boolean contains(char element) {
        for (char number : numbers) {
            if (number == element) {
                return true;
            }
        }

        return false;
    }
}