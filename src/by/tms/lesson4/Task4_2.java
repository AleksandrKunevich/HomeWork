/*
 * Задание 4_1
 *
 * Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
 * Например CM == 900.
 * Соответствие:
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 *
 * Куневич Александр
 */

package by.tms.lesson4;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {

        System.out.print("Enter Rims number: ");
        Scanner scanner = new Scanner(System.in);
        String rimNumber = scanner.nextLine();
        rimNumber = rimNumber.toUpperCase();
        char[] charsLetterNumber = new char[rimNumber.length()];
        rimNumber.getChars(0, rimNumber.length(), charsLetterNumber, 0);

        int arabNumber = 0;
        int count = 0;
        char charLetterBefor = 0;
        for (char charsLetter : charsLetterNumber) {
            if (count == 0) {
                arabNumber += convertRimToArab(charsLetter);
                charLetterBefor = charsLetter;
                count++;
            } else {
                int numNow = convertRimToArab(charsLetter);
                int numBefore = convertRimToArab(charLetterBefor);
                if (numNow > numBefore) {
                    arabNumber += numNow - 2 * numBefore;
                } else {
                    arabNumber += numNow;
                }
                charLetterBefor = charsLetter;
            }
        }
        if (arabNumber < 1) {
            System.out.println("Arab number incorrect");
        } else if (arabNumber > 3999) {
            System.out.println("Arab number > 3999");
        } else {
            System.out.println("Rim = " + rimNumber + " = " + arabNumber + " Arab");
        }
    }

    public static int convertRimToArab(char charRim) {
        int arabInt = 0;
        if (charRim == 'M') {
            arabInt = 1000;
        } else {
            if (charRim == 'D') {
                arabInt = 500;
            } else {
                if (charRim == 'C') {
                    arabInt = 100;
                } else {
                    if (charRim == 'L') {
                        arabInt = 50;
                    } else {
                        if (charRim == 'X') {
                            arabInt = 10;
                        } else {
                            if (charRim == 'V') {
                                arabInt = 5;
                            } else {
                                if (charRim == 'I') {
                                    arabInt = 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arabInt;
    }
}
