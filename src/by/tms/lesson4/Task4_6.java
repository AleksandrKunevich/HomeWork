/*
Дана строка "Versions: Java 5, Java 6, Java 7, Java 8, Java 12." Найдите все подстроки "Java X" и распечатать их.
*/

package by.tms.lesson4;

public class Task4_6 {

    public static void main(String[] args) {

        String text = "Versions: java 5, JavA X, JaVa 7, Javaa, Java 8, Java 12. JavA,Java 999";
        StringBuilder javaX = new CreateJavaX().findJavaX(text);
        System.out.println(javaX == null ? "No Java X in text" : javaX.toString());
    }
}

class CreateJavaX {

    public CreateJavaX() {
    }

    public StringBuilder createJavaX(char[] letters, int index) {
        StringBuilder javaXSB = new StringBuilder();
        javaXSB.append(letters[index - 5]).append(letters[index - 4]).
                append(letters[index - 3]).append(letters[index - 2]).
                append(letters[index - 1]).append(letters[index]);
        return javaXSB;
    }

    public StringBuilder findJavaX(String text) {

        int count = 0;
        StringBuilder textJava = new StringBuilder();
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (String.valueOf(letters[i]).equalsIgnoreCase("J") && (i + 1 < letters.length)) {
                i++;
                if (String.valueOf(letters[i]).equalsIgnoreCase("A") && (i + 1 < letters.length)) {
                    i++;
                    if (String.valueOf(letters[i]).equalsIgnoreCase("V") && (i + 1 < letters.length)) {
                        i++;
                        if (String.valueOf(letters[i]).equalsIgnoreCase("A") && (i + 1 < letters.length)) {
                            i++;
                            if (String.valueOf(letters[i]).equalsIgnoreCase(" ") && (i + 1 < letters.length)) {
                                i++;
                                int countNumber = 0;
                                for (int j = i; j < letters.length; j++, i++) {
                                    if ((letters[i] == '1' || letters[i] == '2' || letters[i] == '3' ||
                                            letters[i] == '4' || letters[i] == '5' || letters[i] == '6' ||
                                            letters[i] == '7' || letters[i] == '8' ||
                                            letters[i] == '9' || letters[i] == '0')) {
                                        if (countNumber == 0) {
                                            textJava.append(new CreateJavaX().createJavaX(letters, i));
                                            countNumber++;
                                        } else {
                                            textJava.append(letters[i]);
                                        }
                                    } else {
                                        j = letters.length;
                                        textJava.append(' ');
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return textJava;
    }
}