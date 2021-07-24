/*
 * Задание 2_4
 *
 * Задать трёхзначную целочисленную переменную и найти произведение всех цифр заданного числа
 *
 * Куневич Александр
 */

package by.tms;

public class Task6 {

    public static void main(String[] args) {

        int number = 375;
        int n3 = number % 10;
        int n2 = (number % 100 - n3) / 10;
        int n1 = (number % 1000 - n3 - n2) / 100;
        var res = n1 * n2 * n3;
        System.out.println("Number = "+ number
                + "\nResult: " + n1 + " * " + n2 + " * " + n3 + " = " + res);
    }
}
