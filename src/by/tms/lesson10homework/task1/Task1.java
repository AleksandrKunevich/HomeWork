/*
 * Создать абстрактный класс Animal со своими методами  и минимум два его наследника,
 * которые имеют собственные специфические методы. Создать спискок из животных и список только
 * из наследников определённого типа. Написать утилитный класс, у которого будет метод,
 * принимающий на вход список только тех объектов, которые являются животными и выводит этот список на консоль.
 * Передать в этот метод список животных и список наследников для проверки правильной работы метода.
 */

package by.tms.lesson10homework.task1;

import by.tms.lesson10homework.task1.animals.Animal;
import by.tms.lesson10homework.task1.animals.AnimalUtils;
import by.tms.lesson10homework.task1.animals.Kangaroo;
import by.tms.lesson10homework.task1.animals.Tiger;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        List<Tiger> tigerList = new ArrayList<>();
        List<Kangaroo> kangarooList = new ArrayList<>();

        animalList.add(new Tiger("Tigra", 900.0, 4));
        animalList.add(new Tiger("Tigrunya", 300.0, -4));
        animalList.add(new Kangaroo("Kango", 400.0, 9));
        animalList.add(new Kangaroo("Kangoose", 900.0, 3));
        animalList.add(new Tiger("Tigrosso", 1300.0, 3));
        tigerList.add((Tiger) animalList.get(0));
        tigerList.add((Tiger) animalList.get(1));
        tigerList.add(new Tiger("Superius", 700.0, 4));
        for (Animal animal : animalList) {
            if (animal instanceof Kangaroo) {
                kangarooList.add((Kangaroo) animal);
            }
        }

        AnimalUtils.printAnimals(kangarooList);
        AnimalUtils.printAnimals(tigerList);
        AnimalUtils.printAnimals(animalList);

        tigerList.get(0).attackPrey(kangarooList.get(0));
        tigerList.get(0).eat();
    }
}
