package string;

public class StringUtils {

    /**
     * Данный метод находит саммую длинную строку в массиве и возвращает объект представленный из
     * размера данной строки и её значении. Если с наибольшей длиной несколько строк, то возвращается первая найденная.
     * Если в массиве одна строка, то независимо от ее длины метод вернет объект с параметрами единственной строки.
     *
     * @param strings массив строк
     * @return самая большая строка в верхнем регистре
     */
    public static BigString getTheBiggestStringFromArray(String[] strings) {
        if (strings == null || strings.length == 0 || strings[0] == null) {
            return new BigString(0, "");
        }

        int maxStringLength = 0;
        String maxStringValue = "";

        for (String s : strings) {
            int stringLength = s.length();

            if (stringLength > maxStringLength) {
                maxStringLength = stringLength;
                maxStringValue = s;
            }
        }

        return new BigString(maxStringLength, maxStringValue);
    }
}