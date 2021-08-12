/*
Создать программно и заполнить файл случайными целыми числами.
Отсортировать содержимое файла по возрастанию (в новый файл).
 */

package by.tms.lesson7;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public final class SortedRandomNumber {

    public static final String RESOURCES_RANDOM_TXT = "resources/Random.txt";
    public static final String RESOURCES_SORTED_TXT = "resources/Sorted.txt";

    private SortedRandomNumber() {
    }

    public static void createFileSortedNumber(int countRandomNumber) {
        createRandom(countRandomNumber);
        sortedRandomScanner(countRandomNumber);
    }

    private static void sortedRandomScanner(int countRandomNumber) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(RESOURCES_RANDOM_TXT));
             BufferedWriter fileWriterSorted = new BufferedWriter(new FileWriter(RESOURCES_SORTED_TXT))) {
            Scanner scanner = new Scanner(bufferedInputStream);
            int[] numbers = new int[countRandomNumber];
            while (scanner.hasNextInt()) {
                for (int i = 0; i < countRandomNumber; i++) {
                    numbers[i] = scanner.nextInt();
                }
            }
            Arrays.sort(numbers);
            for (int num : numbers) {
                fileWriterSorted.write(num + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createRandom(int countRandomNumber) {
        try (BufferedWriter fileWriterRandom = new BufferedWriter(new FileWriter(RESOURCES_RANDOM_TXT))) {
            Random random = new Random();
            for (int i = 0; i < countRandomNumber; i++) {
                fileWriterRandom.write(random.nextInt(999) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
