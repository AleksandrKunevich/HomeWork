package by.tms.lesson7;

import java.io.File;

public class MainLesson7 {

    public static void main(String[] args) {
        FindAllRusLetters.printNumberEachLetter(new File("resources/PushkinStih.txt"));
        SortedRandomNumber.createFileSortedNumber(20);
    }
}
