package by.tms.lesson12;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dump {

    private Map<String, Integer> details;
    Map<String, Integer> getDetail;
    private Lock lock = new ReentrantLock(true);
    private Random random = new Random();
    private Condition condition = lock.newCondition();

    public Dump() {
        details = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            int ran = random.nextInt(9);
            if (details.get(EnumDetails.values()[ran].getNameDetail(ran)) == null) {
                details.put(EnumDetails.values()[ran].getNameDetail(ran), 1);
            } else {
                details.put(EnumDetails.values()[ran].getNameDetail(ran)
                        , details.get(EnumDetails.values()[ran].getNameDetail(ran)) + 1);
            }
        }
        System.out.println("Свалка изначально заполнена 20 деталями: " + details);
    }

    public void putDetails(Map<String, Integer> inputDetails) {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " прибыл на свалку.");
            Set<Map.Entry<String, Integer>> entries = inputDetails.entrySet();
            for (Map.Entry<String, Integer> item : entries) {
                if (details.get(item.getKey()) != null) {
                    if (details.get(item.getKey()) == 0) {
                        details.put(item.getKey(), 1);
                    } else {
                        details.put(item.getKey(), details.get(item.getKey()) + 1);
                    }
                }
            }
        } finally {
            System.out.println(Thread.currentThread().getName() + " выгрузился и покинул свалку.");
            lock.unlock();
        }
    }

    public Map<String, Integer> getDetailsFromDump(int countGetDetails) {
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " прибыл на свалку.");
        getDetail = new HashMap<>();
        try {
            for (int count = 0; count < countGetDetails; count++) {
                boolean isGetDetail = false;
                if (isHaveDetail(details)) {
                    // Получаем рандомную деталь и записываем в getDetail
                    while (!isGetDetail) {
                        int ran = random.nextInt(9);
                        if (details.get(EnumDetails.values()[ran].getNameDetail(ran)) != null) {
                            if (details.get(EnumDetails.values()[ran].getNameDetail(ran)) != 0) {
                                if (getDetail.get(EnumDetails.values()[ran].getNameDetail(ran)) == null) {
                                    getDetail.put(EnumDetails.values()[ran].getNameDetail(ran), 1);
                                } else {
                                    getDetail.put(EnumDetails.values()[ran].getNameDetail(ran)
                                            , getDetail.get(EnumDetails.values()[ran].getNameDetail(ran)) + 1);
                                }
                                isGetDetail = true;
                                details.replace(EnumDetails.values()[ran].getNameDetail(ran)
                                        , details.get(EnumDetails.values()[ran].getNameDetail(ran)) - 1);
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            return getDetail;
        } finally {
            System.out.println(Thread.currentThread().getName() + " покинул свалку.");
            lock.unlock();
        }
    }

    private boolean isHaveDetail(Map<String, Integer> checkDetails) {

        Set<Map.Entry<String, Integer>> entries = checkDetails.entrySet();
        for (Map.Entry<String, Integer> item : entries) {
            if (item.getValue() > 0)
                return true;
        }
        return false;
    }

    public Map<String, Integer> getDetails() {
        return details;
    }
}