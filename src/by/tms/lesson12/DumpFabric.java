package by.tms.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DumpFabric implements Runnable {

    private Dump dump;
    private Random random = new Random();
    private Map<String, Integer> details;

    public DumpFabric(Dump dump) {
        this.dump = dump;
        details = new HashMap<>();
    }

    @Override
    public void run() {
        System.out.println("Фабрика " + Thread.currentThread().getName() + " начала работу.");
        for (int i = 0; i < 100; i++) {
            try {
                runRun();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Фабрика " + Thread.currentThread().getName() + " завершила работу.");
    }

    private void runRun() {
        int randomDetails = random.nextInt(4) + 1;
        for (int i = 0; i < randomDetails; i++) {
            int ran = random.nextInt(9);
            if (details.get(EnumDetails.values()[ran].getNameDetail(ran)) == null
                    || details.get(EnumDetails.values()[ran].getNameDetail(ran)) == 0) {
                details.put(EnumDetails.values()[ran].getNameDetail(ran), 1);
            } else {
                details.put(EnumDetails.values()[ran].getNameDetail(ran)
                        , details.get(EnumDetails.values()[ran].getNameDetail(ran)) + 1);
            }
        }
        System.out.println("Фабрика " + Thread.currentThread().getName() + " отдаёт на свалку "
                + randomDetails + " деталей: " + details);
        dump.putDetails(details);
        details.clear();
    }
}