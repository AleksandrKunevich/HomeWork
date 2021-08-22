package by.tms.lesson10homework.task2;

public class Task2 {

    public static void main(String[] args) {
        String name = "Alexandr";
        String[] names = {"Pete", "Nikolas", "Alexandr", "Nikita"};
        Integer[] ints = {1, 2, 3, 4, 5, 6};
        Boolean boolNull = null;
        System.out.println("Alexandr in names: " + ObjectContainedUtils.isContainedObject(name, names));
        System.out.println("Alexandr in ints: " + ObjectContainedUtils.isContainedObject(name, ints));
        System.out.println("Null in ints: " + ObjectContainedUtils.isContainedObject(boolNull, ints));
    }
}
