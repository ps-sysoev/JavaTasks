package arrays;

import org.junit.Assert;
import org.junit.Test;

public class SecondArrayTaskTest {

    @Test
    public void firstTest() {
        int expected = 16;
        int result = SecondArrayTask.fullSize(new int[5], new int[11]);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondTest() {
        int expected = 11;
        int result = SecondArrayTask.fullSize(new int[0], new int[11]);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdTest() {
        int expected = 0;
        int result = SecondArrayTask.fullSize(new int[0], new int[0]);

        Assert.assertEquals(expected, result);
    }
}