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

public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point(1, 1);
        Point pointTwo = new Point(4,4);
        System.out.println("Point one(" + pointOne.getCoordinatX() + ", " + pointOne.getCoordinatY() + ")");
        System.out.println("Point two(" + pointTwo.getCoordinatX() + ", " + pointTwo.getCoordinatY() + ")");
        System.out.printf("Distance = %.4f\n",  pointOne.distance(pointTwo));
        Rectangle rectangleOne = new Rectangle(pointOne, pointTwo);
        Rectangle rectangleTwo = new Rectangle(pointOne);

        System.out.println("Rectangle one:");
        System.out.printf("Square = %.4f\n", rectangleOne.square());
        System.out.printf("Perimeter = %.4f\n", rectangleOne.perimeter());
        System.out.printf("Diagonal lenght = %.4f\n", rectangleOne.diagonalLenght());

        System.out.println("Rectangle two:");
        System.out.printf("Square = %.4f\n", rectangleTwo.square());
        System.out.printf("Perimeter = %.4f\n", rectangleTwo.perimeter());
        System.out.printf("Diagonal lenght = %.4f\n", rectangleTwo.diagonalLenght());
    }
}
