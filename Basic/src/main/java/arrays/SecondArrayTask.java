package arrays;

public class SecondArrayTask {
    /**
     * Данный метод должен вернуть размер нового массива, который образуется путем слияния двух других массивов
     *
     * @param firstArray  - первый массив
     * @param secondArray - второй массив
     * @return общий размер нового массива
     */
    public static int fullSize(int[] firstArray, int[] secondArray) {
        return firstArray.length + secondArray.length;
    }
}