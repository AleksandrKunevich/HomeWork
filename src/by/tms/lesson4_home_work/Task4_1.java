/*
 * Задание 4_1
 *
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 *
 * Куневич Александр
 */

package by.tms.lesson4_home_work;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {

        System.out.print("Enter word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String reverseWord = new StringBuilder(word).reverse().toString();
        boolean answer = isPalindrom(word, reverseWord);
        if (answer) {
            System.out.println("\"" + word + "\"" + " is palindrom of \"" + reverseWord + "\"");
        } else {
            System.out.println("\"" + word + "\"" + " is NOT palindrom of \"" + reverseWord + "\"");
        }
    }

    private static boolean isPalindrom(String word, String reverseWord) {
        return word.equals(reverseWord);
    }
}
