package by.tms.lesson10homework.task1.animals;

import java.util.List;

public final class AnimalUtils {

    public AnimalUtils() {
    }

    public static <T extends Animal> void printAnimals(List<T> animal) {
        if ((animal != null) && (!animal.isEmpty())) {
            System.out.println(animal);
        }
    }
}
