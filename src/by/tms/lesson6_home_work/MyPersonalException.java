/*
 * 3.Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
 */

package by.tms.lesson6_home_work;

public class MyPersonalException extends Exception {

    public MyPersonalException() {
        System.out.println("Print message from MyPersonalException() constructor.");
    }

    public void throwMyPersonalException() throws MyPersonalException {
        System.out.println("Print message from throwMyPersonalException.");
        throw new MyPersonalException();
    }
}
