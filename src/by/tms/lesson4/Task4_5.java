/*
 * дано два числа, например 3 и 56, необходимо составить следующие строки:
 * 3 + 56 = 59
 * 3 - 56 = -53 
 * 3 * 56 = 168.
 * Используем StringBuilder. Замените символ "=" на слово "равно". Используйте методы
 *     StringBuilder.insert(), StringBuilder.deleteCharAt().
 * Замените симовл "=" на слово "равно". Используйте методы StringBuilder.replace().
 */

import java.util.Scanner;

public class Task4_5{
  
   public static void main(String[] args){
  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second number: ");
        int numberTwo = scanner.nextInt();
             
        StringBuilder stringPlus = new StringBuilder("" + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
        StringBuilder stringMinus = new StringBuilder("" + numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
        StringBuilder stringMultiple = new StringBuilder(String.valueOf(numberOne)).append(" - ").
            append(numberTwo).append(" = ").append((numberOne * numberTwo));
      
        System.out.println(stringPlus.toString());
        System.out.println(stringMinus.toString());
        System.out.println(stringMultiple.toString() + "\n");
        
        int indexPlus = stringPlus.indexOf("=");
        int indexMinus = stringPlus.indexOf("=");
        int indexMultiple = stringPlus.indexOf("=");
        
        StringBuilder strPlusMod = new StringBuilder(stringPlus);
        StringBuilder strMinusMod = new StringBuilder(stringMinus);
        StringBuilder strMultipleMod = new StringBuilder(stringMultiple);

        strPlusMod.deleteCharAt(indexPlus);
        strMinusMod.deleteCharAt(indexMinus);
        strMultipleMod.deleteCharAt(indexMultiple);
        
        strPlusMod.insert(indexPlus, "равно");
        strMinusMod.insert(indexMinus, "равно");
        strMultipleMod.insert(indexMultiple, "равно");

        System.out.println(strPlusMod.toString());
        System.out.println(strMinusMod.toString());
        System.out.println(strMultipleMod.toString() + "\n");
        
        StringBuilder strPlusModReplace = new StringBuilder(stringPlus);
        strPlusModReplace.replace(indexPlus, indexPlus + 1, "равно");
        StringBuilder strMinusModReplace = new StringBuilder(stringMinus);
        strMinusModReplace.replace(indexMinus, indexMinus + 1, "равно");
        StringBuilder strMultipleModReplace = new StringBuilder(stringMultiple);
        strMultipleModReplace.replace(indexMultiple, indexMultiple + 1, "равно");
        
        System.out.println(strPlusModReplace.toString());
        System.out.println(strMinusModReplace.toString());
        System.out.println(strMultipleModReplace.toString() + "\n");
    }
}

  
