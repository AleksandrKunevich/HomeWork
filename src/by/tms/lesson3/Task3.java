 /*
  * Задание 3_3
  *
  * Класс Phone.
  * а) Создайте класс Phone, который содержит переменные number, model и weight.
  * б) Создайте три экземпляра этого класса.
  * в) Выведите на консоль значения их переменных.
  * г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль
  *    сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы
  *    для каждого из объектов.
  * д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных
  *    класса - number, model и weight.
  * е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных
  *    класса - number,model.
  * ж) Добавить конструктор без параметров.
  * з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
  * и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и
  *    номер телефона звонящего. Вызвать этот метод.
  *
  * Куневич Александр
  */

 package by.tms.lesson3;

 public class Task3 {
     public static void main(String[] args) {

         Phone phoneOne = new Phone("+375-29-123-45-67", "Samsung", 139.3);
         Phone phoneTwo = new Phone("+375-29-123-45-68", "LG", 241.5);
         Phone phoneTree = new Phone("+375-29-123-46-77", "Xiaomi");

         System.out.println(phoneOne.getNumber() + " " + phoneOne.model + " " + phoneOne.weight);
         System.out.println(phoneTwo.getNumber() + " " + phoneTwo.model + " " + phoneTwo.weight);
         System.out.println(phoneTree.getNumber() + " " + phoneTree.model + " " + phoneTree.weight);

         phoneOne.receiveCall("Inna");
         phoneOne.receiveCall("Alina", "+375-29-333-33-22");

     }
 }

 class Phone {
     private String number;
     public String model;
     public double weight;

     public String getNumber() {
         return number;
     }

     public Phone(String number, String model, double weight) {
         this(number, model);
         this.weight = weight;
     }

     public Phone(String number, String model) {
         this.number = number;
         this.model = model;
         this.weight = 999.99;
     }

     public Phone() {
     }

     public void receiveCall(String nameCaller) {
         System.out.println("Звонит " + nameCaller);
     }

     public void receiveCall(String nameCaller, String numberCaller) {
         System.out.println("Звонит " + nameCaller + " " + numberCaller);
     }
 }
