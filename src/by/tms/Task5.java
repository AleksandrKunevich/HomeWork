/*
 * Задание 2_4
 *
 * Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже
 * ("рубль", "рублей", "рубля")  (if-else)
 *
 * Куневич Александр
 */

package by.tms;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n = Math.abs(n);
        if (n % 10 == 1 && n % 100 != 11) System.out.println(n + " рубль.");
        else if ((n % 10 == 2 && n % 100 != 12) ||
                 (n % 10 == 3 && n % 100 != 13) ||
                 (n % 10 == 4 && n % 100 != 14)) System.out.println(n + " рубля.");
        else System.out.println(n + " рублей.");

//        1 21 31       рубль
//        0 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 25 26 27 28 29 30         рублей
//        2 3 4 22 23 24         рубля
    }
}
