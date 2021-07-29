/*
 * Задание 3_5
 *
 * Создать класс Point, описывающий точку в двумерных координатах.
 * Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y.
 * Сделайте информацию о координатах скрытой, а получить её можно только с помощью методов доступа (get/set).
 * Создать в классе Point метод distance, принимающий другой объект Point и определяющий
 *    расстояние до неё (можно использовать класс Math).
 *
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник
 *    (у Rectangle должно быть минимум два конструктора).
 * В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
 * Создать следующие методы в классе Rectangle:
 * - Высчитывающий площадь прямоугольника
 * - Высчитывающий периметр прямоугольника
 * - Высчитывающий длину диагонали
 *
 * Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle и
 *    применение вышеперечисленных методов.
 *
 * Куневич Александр
 */

package by.tms.lesson3.task5;

public class Point {

    private int coordinatX;
    private int coordinatY;

    public Point(int coordinatX, int coordinatY) {
        this.coordinatX = coordinatX;
        this.coordinatY = coordinatY;
    }

    public double distance(Point point) {
        // AB = SQRT (  (x2-x1)^2 + (y2-y1)^2  )
        return Math.sqrt((point.getCoordinatX() - this.getCoordinatX()) * (point.getCoordinatX() - this.getCoordinatX()) +
                (point.getCoordinatY() - this.getCoordinatY()) * (point.getCoordinatY() - this.getCoordinatY()));
    }

    public int getCoordinatX() {
        return coordinatX;
    }

    public void setCoordinatX(int coordinatX) {
        this.coordinatX = coordinatX;
    }

    public int getCoordinatY() {
        return coordinatY;
    }

    public void setCoordinatY(int coordinatY) {
        this.coordinatY = coordinatY;
    }
}
