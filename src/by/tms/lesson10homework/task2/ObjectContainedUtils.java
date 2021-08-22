/*
 * Написать утилитный класс с методом, который принимает объект одного типа и массив другого типа,
 * и проверяет, содержится ли этот объект в массиве.
 */

package by.tms.lesson10homework.task2;

public final class ObjectContainedUtils {

    private ObjectContainedUtils() {
    }

    public static <T, E> boolean isContainedObject(T obj, E... arrays) {
        if (!checkNull(obj, arrays)) {
            for (E array : arrays) {
                if (obj.equals(array)) {
                    return true;
                }
            }
            return false;
        } else {
            System.err.println("Have null. Return false");
            return false;
        }
    }

    private static <T, E> boolean checkNull(T obj, E... array) {
        if (obj != null && array != null) {
            return false;
        } else {
            return true;
        }
    }
}
