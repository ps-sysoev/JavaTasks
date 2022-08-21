package task.pair;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import java.math.BigInteger;

public class KeyServiceTest {

    @Test
    public void firstGetHash() {
        String generateKeyFirst = "efb70671-9b0d-4763-a9cf-dd6165a873ee";
        String generateKeySecond = "88e44e41-176f-4caf-94d3-f618caf6147c";
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);

        KeyService keyService = new KeyService();

        BigInteger expected = new BigInteger("706719047639616587388444117649436186147");
        BigInteger result = keyService.getHash(pair);

        assertEquals(expected, result);
    }

    @Test
    public void secondGetHash() {
        String generateKeyFirst = "efbabefa-abbd-ccdd-aace-ddeeffafccee";
        String generateKeySecond = "88e44e41-176f-4caf-94d3-f618caf6147c";
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);

        KeyService keyService = new KeyService();

        BigInteger expected = new BigInteger("88444117649436186147");
        BigInteger result = keyService.getHash(pair);

        assertEquals(expected, result);
    }

    @Test
    public void thirdGetHash() {
        KeyService keyService = new KeyService();

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> keyService.getHash(null));

        assertEquals("Incorrect parameter: pair is null.", thrown.getMessage());
    }

    @Test
    public void getHashWithoutNumbers() {
        String generateKeyFirst = "asfasffassf";
        String generateKeySecond = "asfasdf";
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);

        KeyService keyService = new KeyService();
        BigInteger result = keyService.getHash(pair);

        assertEquals(BigInteger.ZERO, result);
    }

    @Test
    public void getHashOneNumber() {
        String generateKeyFirst = "asfasffassf";
        String generateKeySecond = "5asfasdf";
        Pair pair = Pair.of(generateKeyFirst, generateKeySecond);

        KeyService keyService = new KeyService();

        BigInteger expected = new BigInteger("5");
        BigInteger result = keyService.getHash(pair);

        assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void whenNull() {
        Pair pair = Pair.of(null, "sdfsdf");
    }

    @Test
    public void whenFirstParameterIsEmpty() {
        String generateKey = "88e44e41-176f-4caf-94d3-f618caf6147c";

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> Pair.of("", generateKey));

        assertEquals("Incorrect parameter: firstKey or secondKey is empty.", thrown.getMessage());
    }

    @Test
    public void whenSecondParameterIsEmpty() {
        String generateKey = "88e44e41-176f-4caf-94d3-f618caf6147c";

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> Pair.of(generateKey, ""));

        assertEquals("Incorrect parameter: firstKey or secondKey is empty.", thrown.getMessage());
    }

    @Test
    public void whenTwoParametersAreEmpty() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> Pair.of("", ""));

        assertEquals("Incorrect parameter: firstKey or secondKey is empty.", thrown.getMessage());
    }
}