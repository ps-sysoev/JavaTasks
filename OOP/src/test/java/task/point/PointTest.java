package task.point;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

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
        double result = firstPoint.distance(secondPoint);

        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void secondGetDistanceBetweenTwoPoints() {
        Point firstPoint = new Point("a", 2.8, 2.89);
        Point secondPoint = new Point("b", 5.67, 4.9);

        double expected = 3.50386;
        double result = firstPoint.distance(secondPoint);

        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void thirdGetDistanceBetweenTwoPoints() {
        Point firstPoint = new Point("a", 7.43455, 2.89452);
        Point secondPoint = new Point("b", 15.23467, 21.85549);

        double expected = 20.50269;
        double result = firstPoint.distance(secondPoint);

        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void fourthGetDistanceBetweenTwoPoints() {
        Point firstPoint = new Point("a", 0.00, 2.89452);
        Point secondPoint = new Point("b", 15.23467, 0.00);

        double expected = 15.50721;
        double result = firstPoint.distance(secondPoint);

        assertEquals(expected, result, 0.00001);
    }

    @Test
    public void fifthGetDistanceBetweenTwoPoints() {
        Point firstPoint = new Point("a", 21.85, 40.15);

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> firstPoint.distance(null));

        assertEquals("Incorrect parameter: point is null.", thrown.getMessage());
    }
}