package task.point;

import java.util.Objects;

/**
 * Точка на плоскости
 * name - наименование, x - координата по оси Ox (вещ-е число), y - координата оси Oy (вещ-е число)
 */
public class Point {
    private String name;
    private final double x;
    private final double y;

    public Point(String name, double x, double y) {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter: name is null or empty.");
        }

        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter: name is null or empty.");
        }

        this.name = name;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * Метод вычисляет расстояние между двумя точками на плоскости.
     *
     * @param point вторая точка
     * @return расстояние между точками (вещественное число)
     */
    public double distance(Point point) {
        if (Objects.isNull(point)) {
            throw new IllegalArgumentException("Incorrect parameter: point is null.");
        }

        return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Point point = (Point) o;

        return Double.compare(point.x, x) == 0
                && Double.compare(point.y, y) == 0
                && name.equals(point.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, x, y);
    }
}