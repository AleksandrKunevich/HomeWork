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

        int numberIn = 375;
        int number3 = numberIn % 10;
        int number2 = numberIn / 10 % 10;
        int number1 = numberIn / 100;
        var res = number1 * number2 * number3;
        System.out.println("Number = " + numberIn
                + "\nResult: " + number1 + " * " + number2 + " * " + number3 + " = " + res);
    }
}
