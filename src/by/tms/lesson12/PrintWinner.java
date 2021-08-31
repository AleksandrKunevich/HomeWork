package by.tms.lesson12;

public final class PrintWinner {

    private PrintWinner() {
    }

    public static void printWhoWin(Scientists sc1, Scientists sc2, Thread thread1, Thread thread2, Dump dump) {
        System.out.println("Детали у учёного 1 :" + sc1.getDetails());
        System.out.println("Детали у учёного 2 :" + sc2.getDetails());
        System.out.println("Детали свалки: " + dump.getDetails());

        if (sc1.getMaxRobots() > sc2.getMaxRobots()) {
            System.out.println("Победил учёный " + thread1.getName() + " сделав "
                    + sc1.getMaxRobots() + " роботов.");
            System.out.println("Проиграл учёный " + thread2.getName() + " сделав "
                    + sc2.getMaxRobots() + " роботов.");
        } else {
            if (sc1.getMaxRobots() < sc2.getMaxRobots()) {
                System.out.println("Победил учёный " + thread2.getName() + " сделав "
                        + sc2.getMaxRobots() + " роботов.");
                System.out.println("Проиграл учёный " + thread1.getName() + " сделав "
                        + sc1.getMaxRobots() + " роботов.");
            } else {
                System.out.println("Победила дружба. Оба учёных сделали по "
                        + sc1.getMaxRobots() + " роботов.");
            }
        }
    }
}
