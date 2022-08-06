package arrays;

import org.junit.Assert;
import org.junit.Test;

public class FirstArrayTaskTest {

    @Test
    public void firstTest() {
        int[] numbers = {71, 62, 35, 44, 55, 96};

        int expected = 3;
        int result = FirstArrayTask.getCountEvenNumbers(numbers);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondTest() {
        int[] numbers = {1, 22, 31, 51, 83, 24};

        int expected = 2;
        int result = FirstArrayTask.getCountEvenNumbers(numbers);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdTest() {
        int[] numbers = {6, 15, 45};

        int expected = 1;
        int result = FirstArrayTask.getCountEvenNumbers(numbers);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void fourthTest() {
        int[] numbers = {};

        int expected = 0;
        int result = FirstArrayTask.getCountEvenNumbers(numbers);

        Assert.assertEquals(expected, result);
    }
}