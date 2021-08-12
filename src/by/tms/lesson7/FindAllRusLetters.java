/*
 Создать (можно вручную) файл со стихотворением(к примеру Александра Пушкина).
 Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
          Вывести результат в файл в виде:
          а - 15
          б - 7
          и т.д.
 */

package by.tms.lesson7;

import java.io.*;

public final class FindAllRusLetters {

    private static final String RUS_LETTERS = "йцукенгшщзхъфывапролджэячсмитьбю";

    private FindAllRusLetters() {
    }

    public static void printNumberEachLetter(File file) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] bytes = bufferedInputStream.readAllBytes();
            StringBuilder text = new StringBuilder((new String(bytes)).toLowerCase());
            numberEachLetter(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void numberEachLetter(StringBuilder text) {
        int[] countLetter = new int[32];
        for (int i = 0; i < text.length(); i++) {
            if (RUS_LETTERS.indexOf(text.charAt(i)) != -1) {
                countLetter[RUS_LETTERS.indexOf(text.charAt(i))]++;
            }
        }
        for (int i = 0; i < 32; i++) {
            System.out.println("Letter " + RUS_LETTERS.charAt(i) + " each: "
                    + countLetter[i]);
        }
    }
}
