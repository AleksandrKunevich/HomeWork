package by.tms.lesson12;

public class ScientistTest {

    public static void main(String[] args) {
        Dump dump = new Dump();

        DumpFabric dumpFabric = new DumpFabric(dump);

        Scientists scientists1 = new Scientists(dump);
        Scientists scientists2 = new Scientists(dump);

        Thread thread1 = new Thread(scientists1);
        Thread thread2 = new Thread(scientists2);
        Thread thread3 = new Thread(dumpFabric);

        thread1.setName("Учёный 1");
        thread2.setName("Учёный 2");
        thread3.setName("Фабрика");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PrintWinner.printWhoWin(scientists1, scientists2, thread1, thread2, dump);
    }
}