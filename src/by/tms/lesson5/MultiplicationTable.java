/*
 * Напишите программу, которая выводит на консоль таблицу умножения.
 */

package by.tms.lesson5;

import java.util.Scanner;

public final class MultiplicationTable {

    private MultiplicationTable() {
    }

    public static void showMultiplicationTable(int enterNumber) {
        if ((enterNumber > 0) && (enterNumber <= 10)) {
            for (int i = 0; i <= 10; i++) {
                for (int j = 1; j <= enterNumber; j++) {
                    if (i == 10) {
                        System.out.print(i + " * " + j + " = " + (i * j) + "   ");
                    } else if ((i * j >= 10) && (i * j) < 100) {
                        System.out.print(i + " * " + j + " = " + (i * j) + "    ");
                    } else if (i * j == 100) {
                        System.out.print(i + " * " + j + " = " + (i * j) + "   ");
                    } else {
                        System.out.print(i + " * " + j + " = " + (i * j) + "     ");
                    }
                }
                System.out.println(" ");
            }
        } else {
            System.out.print("\nIncorrect diapason entered number. Please, enter 1 to 10: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            showMultiplicationTable(number);
        }
    }
}
