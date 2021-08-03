/*
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого
 * пользователем целого числа. Решить двумя способами: с помощью цикла и с помощью рекурсии.
 *
 * Чи́сла Фибона́ччи - последовательность в которой первые два числа равны 0 и 1,
 * а каждое последующее число равно сумме двух предыдущих чисел
 */

package by.tms.lesson5;

public final class Fibonachi {

    private Fibonachi() {
    }

    public static void showFiboBeforeByLoop(int enterNumber) {
        if (isFibo(enterNumber)) {
            int iteratorFiboFirst = 0;
            int iteratorFiboSecond = 1;
            int findFibo;
            do {
                findFibo = iteratorFiboFirst + iteratorFiboSecond;
                iteratorFiboFirst = iteratorFiboSecond;
                iteratorFiboSecond = findFibo;
                if (findFibo < enterNumber) System.out.print(findFibo + " ");
            } while (findFibo < enterNumber);
        }
    }

    public static void showFiboBeforeByRecursion(int enterNumber) {
        if (isFibo(enterNumber)) fiboBeforByRecursion(0, 1, enterNumber);
    }

    private static void fiboBeforByRecursion(int iteratorFiboFirst, int iteratorFiboSecond, int enterNumber) {
        int findFibo = iteratorFiboFirst + iteratorFiboSecond;
        iteratorFiboFirst = iteratorFiboSecond;
        iteratorFiboSecond = findFibo;
        if (findFibo < enterNumber) {
            System.out.print(findFibo + " ");
            fiboBeforByRecursion(iteratorFiboFirst, iteratorFiboSecond, enterNumber);
        }
    }

    private static boolean isFibo(int enterNumber) {
        switch (enterNumber) {
            case 0:
                System.out.print(" No Fibonachi befor 0");
                return false;
            case 1:
                System.out.print(" just 0");
                return false;
            default:
                System.out.print(" 0 ");
                return true;
        }
    }
}
