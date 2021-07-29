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

package by.tms.lesson3.vehicles;

import by.tms.lesson3.details.Engine;

import by.tms.lesson3.professions.Driver;
import java.util.Objects;

public class Car {

    public String brandCar;
    public String classCar;
    public double weightCar;
    private Driver driverCar;
    private Engine engineCar;

    public Car(String brandCar, String classCar, double weightCar, Driver driverCar, Engine engineCar) {
        this.brandCar = brandCar;
        this.classCar = classCar;
        this.weightCar = weightCar;
        this.driverCar = driverCar;
        this.engineCar = engineCar;
    }
    public Driver getDriverCar() {
        return driverCar;
    }

    public void setDriverCar(Driver driverCar) {
        this.driverCar = driverCar;
    }

    public Engine getEngineCar() {
        return engineCar;
    }

    public void setEngineCar(Engine engineCar) {
        this.engineCar = engineCar;
    }

    public void start() {
        System.out.println("Start.");
    }

    public void stop() {
        System.out.println("Stop.");
    }

    public void turnRight() {
        System.out.println("Turn right.");
    }

    public void turnLeft() {
        System.out.println("Turn left.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brandCar, car.brandCar) && Objects.equals(classCar, car.classCar) && engineCar.equals(car.engineCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandCar, classCar, engineCar);
    }

    @Override
    public String toString() {
        return "Car:" +
                "\n\tbrandCar='" + brandCar + '\'' +
                "\n\tclassCar='" + classCar + '\'' +
                "\n\tweightCar=" + weightCar +
                "\n" + driverCar +
                "\n" + engineCar;
    }
}
