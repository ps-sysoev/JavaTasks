package arrayfunction;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFunctionallyServiceTest {
    @Test
    public void whenArrayNull() {
        int[] testArray = null;
        ArrayFunctionallyService arrayFunctionallyService = new ArrayFunctionallyService();

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> arrayFunctionallyService.getArrayByCriteria(testArray));

        assertEquals("Incorrect parameter: number[] not be null or empty.", thrown.getMessage());
    }

    @Test
    public void whenArrayEmpty() {
        int[] testArray = new int[0];
        ArrayFunctionallyService arrayFunctionallyService = new ArrayFunctionallyService();

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> arrayFunctionallyService.getArrayByCriteria(testArray));

        assertEquals("Incorrect parameter: number[] not be null or empty.", thrown.getMessage());
    }

    @Test
    public void testGetSumNumbersBetweenIndex() {
        int[] testArray = {56, 45, 145, 24, -48, -45, 96, 1, 78};
        ArrayFunctionallyService arrayFunctionallyService = new ArrayFunctionallyService();

        int expected = 173;
        int result = arrayFunctionallyService.getSumNumbersBetweenIndex(testArray, 2, 7);

        assertEquals(expected, result);
    }

    @Test
    public void testGetArrayByCriteria() {
        int[] testArray = {56, 45, 145, 24, -48, -45, 96, 1, 78};
        ArrayFunctionallyService arrayFunctionallyService = new ArrayFunctionallyService();

        ArrayDetail expected = new ArrayDetail();

        expected.setFirstElement(56);
        expected.setLastElement(78);
        expected.setSumBetweenFirstAndLast(352);

        ArrayDetail result = arrayFunctionallyService.getArrayByCriteria(testArray);

        assertEquals(expected, result);
    }
}