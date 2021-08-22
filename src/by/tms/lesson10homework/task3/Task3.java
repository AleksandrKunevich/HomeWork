package by.tms.lesson10homework.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<Integer> listInt1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listInt1.add(i);
        }
        List<Integer> listInt2 = new LinkedList<>();
        for (int i = 5; i < 8; i++) {
            listInt2.add(i);
        }
        List<Integer> listInt3 = new ArrayList<>();
        listInt3 = null;
        List<Integer> listInt4 = new ArrayList<>();
        List<String> listInt5 = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            listInt5.add("A" + i);
        }
        List<String> listInt6 = new ArrayList<>();
        for (int i = 14; i < 18; i++) {
            listInt6.add("A" + i);
        }

        ArrayUtils.printCombine(listInt1, listInt2);
        try {
            ArrayUtils.crossOverArrays(listInt3, listInt1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(ArrayUtils.crossOverArrays(listInt1, listInt4));
        System.out.println(ArrayUtils.crossOverArrays(listInt1, listInt2));
        listInt1 = ArrayUtils.crossOverArrays(listInt1, listInt2);
        System.out.println("Cross over: " + listInt1 + " Return class: " + listInt1.getClass().getSimpleName());
        List<String> listArrays = new LinkedList<>();
        listArrays = ArrayUtils.crossOverArrays(listInt5, listInt6);
        System.out.println("Cross over: " + listArrays + " Return class: " + listArrays.getClass().getSimpleName());
//        LinkedList<String> listx = new LinkedList<>();
//        listx = ArrayUtils.crossOverArrays(listInt5, listInt6);
    }
}