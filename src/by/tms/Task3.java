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

        int lenght = 7;
        int Hight = 8;
        System.out.println("Square = " + lenght * Hight
                + "\nL = " + 2 * (lenght + Hight));
    }
}
