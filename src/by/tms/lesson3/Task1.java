/*
 * Задание 3_1
 *
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит" (идёт).
 * в) Добавьте два конструктора - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой -
 * Person(fullName, age).
 *
 * Куневич Александр
 */

package by.tms.lesson3;

public class Task1 {

    public static void main(String[] args) {

        Person personFirst = new Person();
        Person personSecond = new Person("Tom", 80);
        personFirst.move();
        personSecond.tals();
    }
}

class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        checkCorrectInformation();
        System.out.println("Такой-то " + fullName + " идёт. " + age + " years");
    }

    public void tals() {
        checkCorrectInformation();
        System.out.println("Такой-то " + fullName + " говорит. " + age + " years");
    }

    public void checkCorrectInformation() {
        if (fullName == null) fullName = "Jhon";
        if (age <= 0 || age > 150) age = 18;
    }
}

