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

 package by.tms.lesson3.details;

 import java.util.Objects;

 public class Engine {

     private int powerEngine;
     public String manufacturEngine;

     public Engine(int powerEngine, String manufacturEngine) {
         this.powerEngine = powerEngine;
         this.manufacturEngine = manufacturEngine;
     }

     public int getPowerEngine() {
         return powerEngine;
     }

     public void setPowerEngine(int powerEngine) {
         this.powerEngine = powerEngine;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Engine engine = (Engine) o;
         return powerEngine == engine.powerEngine && Objects.equals(manufacturEngine, engine.manufacturEngine);
     }

     @Override
     public int hashCode() {
         return Objects.hash(powerEngine, manufacturEngine);
     }

     @Override
     public String toString() {
         return "\nEngine:" +
                 "\n\tpowerEngine=" + powerEngine +
                 "\n\tmanufacturEngine='" + manufacturEngine + '\'';
     }
 }
