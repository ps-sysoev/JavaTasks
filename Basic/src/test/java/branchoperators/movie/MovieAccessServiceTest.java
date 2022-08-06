package branchoperators.movie;

import org.junit.Assert;
import org.junit.Test;

public class MovieAccessServiceTest {

    @Test
    public void firstAgeValidityTest() {
        int age = 0;

        String expected = "Incorrect age, check the user with this age.";
        String result = MovieAccessService.accessMovie(age);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondAgeValidityTest() {
        int age = -1;

        String expected = "Incorrect age, check the user with this age.";
        String result = MovieAccessService.accessMovie(age);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void firstAccessLevelTest() {
        int age = 19;

        String expected = "Rating R. Access is allowed.";
        String result = MovieAccessService.accessMovie(age);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondAccessLevelTest() {
        int age = 21;

        String expected = "Rating R. Access is allowed.";
        String result = MovieAccessService.accessMovie(age);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdAccessLevelTest() {
        int age = 100;

        String expected = "Rating F. Access is allowed.";
        String result = MovieAccessService.accessMovie(age);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void fourthAccessLevelTest() {
        int age = 7;

        String expected = "Access is denied";
        String result = MovieAccessService.accessMovie(age);

        Assert.assertEquals(expected, result);
    }
}