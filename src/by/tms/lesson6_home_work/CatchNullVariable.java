/*
 * Объявите переменную со значением null. Вызовите метод у этой переменной.
 * Отловите возникшее исключение.
 */

package by.tms.lesson6_home_work;

public final class CatchNullVariable {

    private CatchNullVariable() {
    }

    public static boolean isCatchNull() {
        Integer intNull = null;
        return intNull.equals(123);
    }
}
