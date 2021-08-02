/*
 * Написать функцию, принимающую в качестве параметров имя, фамилию и отчество, и возвращающую инициалы в
 * формате "Ф.И.О." Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */

package by.tms.lesson4_home_work;

import java.util.Scanner;

public class Task4_3 {

    public static void main(String[] args) {

        System.out.print("Enter your family, name and last name (FIO): ");
        Scanner scanner = new Scanner(System.in);
        String enterFIO = scanner.nextLine();
        enterFIO = enterFIO.trim();
        String[] arrayFIO = enterFIO.split(" ");

        int count = 0;
        for (int i = 0; i < arrayFIO.length; i++) {
            if (arrayFIO[i] != null && !arrayFIO[i].equals("")) {
                arrayFIO[count] = arrayFIO[i].toUpperCase();
                count++;
                if (count == 3) i = arrayFIO.length;
            }
        }

        if (arrayFIO.length < 3) {
            System.out.println("Incorrect enter FIO!");
        } else {
            char family = arrayFIO[0].charAt(0);
            char name = arrayFIO[1].charAt(0);
            char lastName = arrayFIO[2].charAt(0);
            System.out.println("" + family + "." + name + "." + lastName + ".");
        }
    }
}
