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

package by.tms.lesson3.professions;

public class Driver {

    private String fullName;
    private int driveExp;

    public Driver(String fullName, int driveExp) {
        this.fullName = fullName;
        this.driveExp = driveExp;
    }

    public int getDriveExp(){
        return driveExp;
    }

    public void setDriveExp(int driveExp){
        this.driveExp = driveExp;
    }

    @Override
    public String toString() {
        return "\nDriver:" +
                "\n\tfullName='" + fullName + '\'' +
                "\n\tdriveExp=" + driveExp;
    }
}
