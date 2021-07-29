/*
 * Задание 2_2
 *
 * Написать программу, которая определяет, является ли последняя цифра заданного целого  числа – цифрой 3
 *
 * Куневич Александр
 */

package by.tms.lesson2;

public class Task2 {

    public static void main(String[] args) {

        int n1 = 1023;
        System.out.println(n1 % 10 == 3 ? "Number " + n1 + " Last number = 3"
                : "Number " + n1 + " No last number 3");

        int n2 = 1024;
        System.out.println(n2 % 10 == 3 ? "Number " + n2 + " Last number = 3"
                : "Number " + n2 + " No last number 3");

        System.out.println(result(1035));
        System.out.println(result(1031) + "\n" + result(3));
    }

    public static String result(int number) {
        String textRes = number % 10 == 3 ? "Number " + number + " Last number = 3"
                : "Number " + number + " No last number 3";
        return textRes;
    }
}
