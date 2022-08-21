package task.point;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PointServiceTest {

    @Test
    public void firstTestCreatePoint() {
        Point expected = new Point("A", 10.5, 45.3);
        Point result = PointService.createPoint("A", 10.5, 45.3);

        assertEquals(expected, result);
    }

    @Test
    public void secondTestCreatePoint() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> PointService.createPoint("", 2.5, 3.5));

        assertEquals("Incorrect parameter: name is null or empty.", thrown.getMessage());
    }

    @Test
    public void thirdTestCreatePoint() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> PointService.createPoint(null, 2.5, 3.5));

        assertEquals("Incorrect parameter: name is null or empty.", thrown.getMessage());
    }

    @Test
    public void whenPointNull() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new Point(null, 3.4, 6.15));

        assertEquals("Incorrect parameter: name is null or empty.", thrown.getMessage());
    }

    @Test
    public void whenPointEmpty() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new Point("", 3.4, 6.15));

        assertEquals("Incorrect parameter: name is null or empty.", thrown.getMessage());
    }

    @Test
    public void firstGetDistanceBetweenTwoPoints() {
        Point firstPoint = new Point("a", 2.0, 2.0);
        Point secondPoint = new Point("b", 4.0, 4.0);

        double expected = 2.82843;
        double result = PointService.getDistanceBetweenTwoPoints(firstPoint, secondPoint);

        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void secondGetDistanceBetweenTwoPoints() {
        Point firstPoint = new Point("a", 2.8, 2.89);
        Point secondPoint = new Point("b", 5.67, 4.9);

        double expected = 3.50386;
        double result = PointService.getDistanceBetweenTwoPoints(firstPoint, secondPoint);

        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void thirdGetDistanceBetweenTwoPoints() {
        Point firstPoint = new Point("a", 7.43455, 2.89452);
        Point secondPoint = new Point("b", 15.23467, 21.85549);

        double expected = 20.50269;
        double result = PointService.getDistanceBetweenTwoPoints(firstPoint, secondPoint);

        assertEquals(expected, result, 0.00001);
    }
}