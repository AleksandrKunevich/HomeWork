package by.tms.lesson6_home_work;

import com.sun.tools.attach.AttachNotSupportedException;

import java.util.Random;

public class RandomException extends Exception {

    public RandomException() {
        System.out.println("Run constructor RandomException()");
    }

    // 6.Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
    // Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
    public void runRandomException() throws AttachNotSupportedException
            , CloneNotSupportedException
            , ClassNotFoundException
            , ArrayIndexOutOfBoundsException
            , NullPointerException {
        Random random = new Random();
        int numberException = random.nextInt(5);
        switch (numberException) {
            case 0:
                throw new AttachNotSupportedException("Random 0 - AttachNotSupportedException");
            case 1:
                throw new CloneNotSupportedException("Random 1 - CloneNotSupportedException");
            case 2:
                throw new ClassNotFoundException("Random 2 - ClassNotFoundException");
            case 3:
                throw new ArrayIndexOutOfBoundsException("Random 3 - ArrayIndexOutOfBoundsException");
            case 4:
                throw new NullPointerException("Random 4 - NullPointerException");
        }
    }

    // 7.Написать метод, который в 50% случаев бросает исключение.
    // Вызвать этот метод в конструкции try-catch-finally. Протестировать работу блока finally.
    // runRandomException5050
    public void runRandomException5050() throws MyPersonalException {
        Random random = new Random();
        int numberException = random.nextInt(2);
        switch (numberException) {
            case 0:
                System.out.println("Sorry... This is throw...");
                throw new MyPersonalException();
            case 1:
                System.out.println("You are lucky! Run without THROW!");
                break;
        }

    }
}