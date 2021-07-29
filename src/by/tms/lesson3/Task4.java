/*
 * Задание 3_4
 *
 * Автомобили.
 * Создать класс Car в пакете by.tms.vehicles, Engine в пакете by.tms.details и
 * Driver в пакете by.tms.professions.
 * Класс Driver содержит поля - ФИО, стаж вождения.
 * Класс Engine содержит поля - мощность, производитель.
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver,
 * мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
 * "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
 * Добавить методы set* и get* для работы с полями. Переопределить методы equals() и hashCode().
 * Метод equals должен сравнивать автомобили по марке автомобиля, классу автомобиля и мотору.
 * А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 *
 * Куневич Александр
 */

package by.tms.lesson3;

import by.tms.lesson3.details.Engine;
import by.tms.lesson3.professions.Driver;
import by.tms.lesson3.vehicles.Car;

public class Task4 {
    public static void main(String[] args) {

        Car carOne = new Car("R&R", "Luxe", 2657.7,
                new Driver("Kunevich A.V.", 17),
                new Engine(850, "Turov"));
        Car carTwo = new Car("Mercedes", "Classic", 1846.2,
                new Driver("Timurov D.T.", 7),
                new Engine(150, "Zaporojye"));
        Car carTree = new Car("Renault", "Econom", 1123,
                new Driver("Kravec F.E.", 37),
                new Engine(90, "Novgorod"));
        Car carFour = new Car("R&R", "Luxe", 1999.9,
                new Driver("Smirnov S. S.", 19),
                new Engine(850, "Turov"));

        System.out.println(carOne);

        System.out.println(carOne.equals(carTwo));
        System.out.println(carOne.equals(carFour));
    }
}
