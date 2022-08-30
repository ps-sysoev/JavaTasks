package arrayfunction;

import java.util.Objects;

public class ArrayFunctionallyService {
    public ArrayDetail getArrayByCriteria(int[] numbers) {
        if (Objects.isNull(numbers) || numbers.length == 0) {
            throw new IllegalArgumentException("Incorrect parameter: number[] not be null or empty.");
        }

        ArrayDetail arrayDetail = new ArrayDetail();

        arrayDetail.setFirstElement(numbers[0]);
        arrayDetail.setLastElement(numbers[numbers.length - 1]);

        int sumBetweenFirstAndLast = getSumNumbersBetweenIndex(
                numbers,
                arrayDetail.getFirstElement(),
                arrayDetail.getLastElement()
        );

        arrayDetail.setSumBetweenFirstAndLast(sumBetweenFirstAndLast);

        return arrayDetail;
    }

    public int getSumNumbersBetweenIndex(int[] numbers, int start, int end) {
        if (Objects.isNull(numbers) || numbers.length == 0) {
            throw new IllegalArgumentException("Incorrect parameter: number[] not be null or empty.");
        }

        if (start > end) {
            throw new IllegalArgumentException("Incorrect parameters: start cannot be greater than end.");
        }

        int sum = 0;

        for (int item : numbers) {
            sum += item;
        }

        return sum;
    }
}