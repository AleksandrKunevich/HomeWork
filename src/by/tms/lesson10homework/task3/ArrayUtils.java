package by.tms.lesson10homework.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ArrayUtils<T> {

    private ArrayUtils() {
    }

    public static <T> void printCombine(List<T> list1, List<T> list2) {
        if (!isPrintEmptyNull(list1, list2)) {
            String classArray = list1.getClass().getSimpleName();
            if (classArray.equals("ArrayList")) {
                List<T> arrRes = new ArrayList<>(list1);
                arrRes.addAll(list2);
                System.out.println(arrRes);
            } else {
                List<T> arrRes = new LinkedList<>(list1);
                arrRes.addAll(list2);
                System.out.println(arrRes);
            }
        }
    }

    public static <T> List<T> crossOverArrays(List<T> list1, List<T> list2) throws NullPointerException {
        if (isNullArrays(list1) || isNullArrays(list2)) {
            throw new NullPointerException("Null exception!");
        }
        if (list1.isEmpty()) {
            return list1;
        }
        if (list2.isEmpty()) {
            return list2;
        }
        String classArray = list1.getClass().getSimpleName();
        switch (classArray) {
            case "ArrayList":
                List<T> arrayResult = new ArrayList<>();
                crossOver(list1, list2, arrayResult);
                return arrayResult;
            default: {
                List<T> linkedResult = new LinkedList<>();
                crossOver(list1, list2, linkedResult);
                return linkedResult;
            }
        }

    }

    private static <T> void crossOver(List<T> list1, List<T> list2, List<T> arrRes) {
        for (T arr1 : list1) {
            if (list2.contains(arr1)) {
                arrRes.add(arr1);
            }
        }
    }

    private static <T> boolean isNullArrays(List<T> arrays) {
        if (arrays == null) {
            return true;
        } else {
            return false;
        }
    }

    private static <T> boolean isPrintEmptyNull(List<T> arr1, List<T> arr2) {
        if (isNullArrays(arr1) && isNullArrays(arr2)) {
            System.out.println("arr1 and arr2: Null");
            return true;
        }
        if (isNullArrays(arr1)) {
            System.out.println("arr1: Null");
            System.out.println("arr2: " + arr2);
            return true;
        }
        if (isNullArrays(arr2)) {
            System.out.println("arr2: Null");
            System.out.println("arr1: " + arr1);
            return true;
        }
        if (arr1.isEmpty() && arr2.isEmpty()) {
            System.out.println("arr1 and arr2: Empty");
            return true;

        }
        if (arr1.isEmpty()) {
            System.out.println("arr1: Empty");
            System.out.println("arr2: " + arr2);
            return true;
        }
        if (arr2.isEmpty()) {
            System.out.println("arr2: Empty");
            System.out.println("arr1: " + arr1);
            return true;
        }
        return false;
    }
}