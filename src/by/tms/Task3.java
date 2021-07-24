/*
 * Задание 2_3
 *
 * Длина прямоугольника 7, а ширина 8. Вывести в консоль его площадь и периметр.
 *
 * Куневич Александр
 */

package by.tms;

public class Task3 {

    public static void main(String[] args) {

        int l = 7;
        int h = 8;
        System.out.println("S = " + l * h
                + "\nL = " + 2 * (l + h));
    }
}
