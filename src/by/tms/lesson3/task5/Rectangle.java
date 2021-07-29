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

public class Rectangle {

    static int count = 0;
    private Point pointUpLeft;
    private Point pointDownRight;
    private Point pointUpRight;
    private Point pointDownLeft;
    private double sideAB;
    private double sideBC;

    public Rectangle(Point pointUpLeft, Point pointDownRight) {
        // a(x1 y1)          b (x2  y1)
        // d(x1 y2)          c (x2  y2)

        this.pointUpLeft = pointUpLeft;
        this.pointDownRight = pointDownRight;
        this.pointUpRight = new Point(this.pointDownRight.getCoordinatX(), this.pointUpLeft.getCoordinatY());
        this.pointDownLeft = new Point(this.pointUpLeft.getCoordinatX(), this.pointDownRight.getCoordinatY());
        this.sideAB = this.pointUpLeft.distance(this.pointUpRight);
        this.sideBC = this.pointUpRight.distance(this.pointDownRight);
        count++;
        System.out.println("Create rectangle. " + count);
    }

    public Rectangle(Point point) {
        this(point, point);
        System.out.print("This is just one POINT!\n");
    }

    public double square() {
        return this.sideAB * this.sideBC;
    }

    public double perimeter() {
        return 2 * (this.sideAB + this.sideBC);
    }

    public double diagonalLenght() {
        double sideAB = this.pointUpLeft.distance(this.pointUpRight);
        double sideBC = this.pointUpRight.distance(this.pointDownRight);

        // L = sqrt (  a^2 + b^2  )
        return Math.sqrt(sideAB * sideAB + sideBC * sideBC);
    }

}
