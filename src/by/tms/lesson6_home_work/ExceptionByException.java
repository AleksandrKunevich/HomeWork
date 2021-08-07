/*
 * Бросить одно из существующих в JDK исключений, отловить его и выбросить своё собственное,
 * указав в качестве причины отловленное.
 */

package by.tms.lesson6_home_work;

public class ExceptionByException extends Exception {

    public ExceptionByException(String message) {
        super(message);
        System.out.println("Text from constructor \"ExceptionByException(String message)\"");
    }
}
