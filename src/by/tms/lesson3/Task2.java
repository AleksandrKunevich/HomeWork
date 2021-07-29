/*
 * Задание 3_2
 *
 * Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами:
 * секундами, минутами и часами. Создать метод для получения полного количества секунд в объекте.
 * Создать два конструктора: первый принимает общее количество секунд, второй - часы, минуты и секунды
 * по отдельности. Создать метод для вывода данных. Написать программу для тестирования возможностей класса.
 *
 * Куневич Александр
 */

package by.tms.lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Choise time period: 1 - seconds or 2 - H:M:S");
        Scanner scanner = new Scanner(System.in);
        int numberChoise = scanner.nextInt();

        if (numberChoise == 1) {
            int seconds = scanner.nextInt();
            if (seconds >= 0) {
                TimePeriod period = new TimePeriod(seconds);
            } else System.out.println("Error!");
        } else if (numberChoise == 2) {
            System.out.println("Enter HOURS: ");
            int hours = scanner.nextInt();
            if (hours >= 0) {
                System.out.println("Enter MINUTS: ");
                int minutes = scanner.nextInt();
                if (minutes >= 0) {
                    System.out.println("Enter SECONDS: ");
                    int seconds = scanner.nextInt();
                    if (seconds >= 0) {
                        TimePeriod period = new TimePeriod(hours, minutes, seconds);
                    } else System.out.println("Error!");
                } else System.out.println("Error!");
            } else System.out.println("Error!");
        }
    }
}

class TimePeriod {
    int fullSecondsIn;
    int hours;
    int minutes;
    int seconds;

    public TimePeriod(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        System.out.println("Full seconds =  " + (seconds + minutes * 60 + hours * 3600));
    }

    public TimePeriod(int fullSecondsIn) {
        this.fullSecondsIn = fullSecondsIn;
        System.out.println(fullSecondsIn / 3600 + " hour(s) " +
                (fullSecondsIn / 60) + " minute(s) " +
                fullSecondsIn % 60 + " second(s)");
    }
}