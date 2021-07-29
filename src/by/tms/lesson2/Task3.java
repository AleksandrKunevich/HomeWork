/*
 * Задание 2_3
 *
 * Длина прямоугольника 7, а ширина 8. Вывести в консоль его площадь и периметр.
 *
 * Куневич Александр
 */

package by.tms.lesson2;

public class Task3 {

    public static void main(String[] args) {

        int lenght = 7;
        int hight = 8;
        System.out.println("Square = " + lenght * hight
                + "\nL = " + 2 * (lenght + hight));
    }
}
