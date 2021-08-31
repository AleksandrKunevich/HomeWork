package by.tms.lesson12;

import java.util.*;

public class Scientists implements Runnable {

    private Dump dump;
    private Random random = new Random();
    private Map<String, Integer> details;
    private Map<String, Integer> getDetails;
    private int maxRobots;

    public Scientists(Dump dump) {
        this.dump = dump;
        details = new HashMap<>();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " начал работу.");
        for (int i = 0; i < 100; i++) {
            try {
                runRun();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " завершил работу.");
        Set<Map.Entry<String, Integer>> entries = details.entrySet();
        int i = 0;
        for (Map.Entry<String, Integer> item : entries) {
            if (i == 0) {
                i++;
                maxRobots = item.getValue();
            } else {
                if (maxRobots > item.getValue()) {
                    maxRobots = item.getValue();
                }
            }
        }
    }

    private void runRun() {
        int ran = random.nextInt(4) + 1;
        System.out.println("Робот " + Thread.currentThread().getName() + " ушёл на свалку за " + ran + " деталями.");
        getDetails = dump.getDetailsFromDump(ran);
        if (getDetails != null) {
            System.out.println("Робот " + Thread.currentThread().getName() + " принёс детали: " + getDetails);
            Set<Map.Entry<String, Integer>> entries = getDetails.entrySet();
            for (Map.Entry<String, Integer> item : entries) {
                if (details.get(item.getKey()) != null) {
                    if (details.get(item.getKey()) == 0) {
                        details.put(item.getKey(), 1);
                    } else {
                        details.put(item.getKey(), details.get(item.getKey()) + 1);
                    }
                } else {
                    details.put(item.getKey(), 1);
                }
            }
        }
    }

    public Map<String, Integer> getDetails() {
        return details;
    }

    public int getMaxRobots() {
        return maxRobots;
    }
}
