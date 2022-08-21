package task.point;

/**
 * Сервис по работе с точками на плоскости
 */
public class PointService {
    /**
     * Метод создает точку на плоскости
     *
     * @param name наименование
     * @param x    координата по оси Оx (вещ-е число)
     * @param y    координата по оси Оy (вещ-е число)
     * @return созданный объект Point
     */
    public static Point createPoint(String name, double x, double y) {
        return new Point(name, x, y);
    }

    /**
     * Метод вычисляет расстояние между двумя точками на плоскости
     *
     * @param firstPoint  первая точка
     * @param secondPoint вторая точка
     * @return расстояние между 1-й и 2-й точками (вещ-е число)
     */
    public static double getDistanceBetweenTwoPoints(Point firstPoint, Point secondPoint) {
        double firstPointX = firstPoint.getX();
        double firstPointY = firstPoint.getY();

        double secondPointX = secondPoint.getX();
        double secondPointY = secondPoint.getY();

        return Math.sqrt(Math.pow(secondPointX - firstPointX, 2) + Math.pow(secondPointY - firstPointY, 2));
    }
}