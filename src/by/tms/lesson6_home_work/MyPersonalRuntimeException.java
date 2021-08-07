/*
 * 3.Создать собственный класс-исключение - наследник класса Exception.
 * Создать метод, выбрасывающий это исключение.
 * Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
 * 4.Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
 * Добавить в конструктор своего класса возможность указания сообщения.
 */

package by.tms.lesson6_home_work;

public class MyPersonalRuntimeException extends RuntimeException {
    public MyPersonalRuntimeException() {
        System.out.println("Print text from MyPersonalRuntimeException() constructor.");
    }

    public MyPersonalRuntimeException(String message) {
        super(message);
        System.out.println("Print text from constructor MyPersonalRuntimeException(String message).");
    }

    public void throwMyPersonalRuntimeException() {
        System.out.println("Print text from throw method.");
        throw new MyPersonalRuntimeException("This message add to constructor in exception class");
    }
}
