package by.tms.lesson5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter INTEGER number: ");
        Scanner scanner = new Scanner(System.in);
        int enterNumber = scanner.nextInt();

        System.out.println("String = " + SumNumber.getSumOfNumberByString(enterNumber));
        System.out.println("Integer = " + SumNumber.getSumOfNumberByInteger(enterNumber));

        System.out.print("\nFibonachi befor by loop " + enterNumber + " =");
        Fibonachi.showFiboBeforeByLoop(enterNumber);
        System.out.print("\nFibonachi befor by recursion " + enterNumber + " =");
        Fibonachi.showFiboBeforeByRecursion(enterNumber);

        System.out.print("\nEnter multiplication table number 1..10: ");
        enterNumber = scanner.nextInt();
        MultiplicationTable.showMultiplicationTable(enterNumber);

        System.out.print("\nEnter factorian number 0..12: ");
        enterNumber = scanner.nextInt();
        System.out.println("Factorial " + enterNumber + " by loop = " + Factorial.getFactorianByLoop(enterNumber));
        System.out.println("Factorial " + enterNumber + " by recursion = " + Factorial.getFactorianByRecursion(enterNumber));

        System.out.print("\nEnter number to understand is \"simple number\"? : ");
        enterNumber = scanner.nextInt();
        System.out.println(enterNumber + " is \"simple number\"? : " + SimpleNumber.isSimpleNumber(enterNumber));

        System.out.println("\nConsonant latters before 1 vowel letter: ");
        ConsonantLetters.showConsonantLetters(1);
        System.out.println("\nConsonant latters before 2 vowel letter: ");
        ConsonantLetters.showConsonantLetters(2);
        System.out.println("\nConsonant latters before 5 vowel letter: ");
        ConsonantLetters.showConsonantLetters(5);
    }
}
