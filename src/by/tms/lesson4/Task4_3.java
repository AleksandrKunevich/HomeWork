/*
 * Написать функцию, принимающую в качестве параметров имя, фамилию и отчество, и возвращающую инициалы в 
 * формате "Ф.И.О." Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
 */

import java.util.Scanner;

public class Task4_3{
  
    public static void main(String[] args){
    
        System.out.print("Enter your family, name and last name (FIO): ");    
        Scanner scanner = new Scanner(System.in);
        String enterFIO = scanner.nextLine();
        enterFIO = enterFIO.trim();
        Strind words[] = enterFIO.split(" ");
        if (words.length < 3) {
            System.out.println("Incorrect enter FIO!");
        } else {
            char famile = words[0].toUpperCase().charAt(0);
            char name = words[1].toUpperCase().charAt(0);
            char lastName = words[2].toUpperCase().charAt(0);
            System.out.println("" + famile + "." + name + "." + lastName + ".");
        }
    }  
}
