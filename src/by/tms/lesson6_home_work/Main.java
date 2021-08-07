package by.tms.lesson6_home_work;

import com.sun.tools.attach.AttachNotSupportedException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Run task 1 = CatchNullVariable class");
        try {
            CatchNullVariable.isCatchNull();
        } catch (NullPointerException e) {
            System.out.println("Integer in method isCatchNull = null - catch.");
            System.out.println("e.printStackTrace() - not print - is not readable...");
        } finally {
            System.out.println("Continue work in finally: ");

            System.out.println("\nRun task 2 = ArrayIndexCatch class");
            ArrayIndexCatch.catchArrayIndexOutOfBoundsException();
            System.out.println("Return back and continue work...");

            System.out.println("\nRun task 3 = MyPersonalException class");
            MyPersonalException myPersonalExceptionCatch = new MyPersonalException();
            try {
                myPersonalExceptionCatch.throwMyPersonalException();
            } catch (MyPersonalException myEx) {
                System.out.println("MyPersonalException catched...");
                System.out.println("=====StackTrace start=====");
                for (StackTraceElement stack : myEx.getStackTrace()) {
                    System.out.println(stack.toString());
                }
                System.out.println("=====StackTrace finish=====");
                System.out.println("Continue work in catch MyPersonalException...");

                System.out.println("\nRun task 4 = MyPersonalRuntimException");
                MyPersonalRuntimeException myPersonalRuntimeException
                        = new MyPersonalRuntimeException();
                try {
                    myPersonalRuntimeException.throwMyPersonalRuntimeException();
                } catch (MyPersonalRuntimeException myExRuntime) {
                    System.out.println("MyPersonalRuntimeException catched...");
                    System.out.println("Message from catch in Main class: " + myExRuntime.getMessage());
                    System.out.println("-----=====StackTrace start=====-----");
                    for (StackTraceElement stack : myExRuntime.getStackTrace()) {
                        System.out.println(stack.toString());
                    }
                    System.out.println("-----=====StackTrace finish=====-----");
                    System.out.println("End work in catch MyPersonalRuntimeException...");
                } finally {
                    System.out.println("Start work in finally MyPersonalRuntimeException...");
                    MyPersonalRuntimeException myPersonalRuntimeException2
                            = new MyPersonalRuntimeException("Text message second in (message).");
                    try {
                        myPersonalRuntimeException2.throwMyPersonalRuntimeException();
                    } catch (Exception myExRuntimeSecond) {
                        System.out.println("Message second in MyException class: " + myExRuntimeSecond.getMessage());
                        System.out.println("Message second in Main class" + myPersonalRuntimeException2.getMessage());
                        System.out.println("Continue work in finally MyPersonalRuntimeException...");

                        System.out.println("\nRun task 5 = ExceptionByException");
                        try {
                            throw new ArithmeticException("Message from Main ArithmeticException");
                        } catch (ArithmeticException arithmeticException) {
                            try {
                                throw new ExceptionByException("Message from Main ExceptionByException and "
                                        + arithmeticException.getMessage());
                            } catch (ExceptionByException exceptionByException) {
                                System.out.println("Text arithmeticException Main: " + arithmeticException.getMessage());
                                System.out.println("Text exceptionByException Main: " + exceptionByException.getMessage());
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Continue work in main...");

        System.out.println("\nRun task 6 = RandomException class");
        RandomException testRandom = new RandomException();
        for (int i = 0; i < 10; i++) {
            System.out.println("\nIteration " + i + ":");
            try {
                testRandom.runRandomException();
            } catch (AttachNotSupportedException e1) {
                System.out.println("Catch: " + e1.getMessage());
            } catch (ClassNotFoundException | CloneNotSupportedException e2) {
                System.out.println("Catch: " + e2.getMessage());
            } catch (Exception e3) {
                System.out.println("Catch " + e3.getMessage());
            }
        }

        System.out.println("\nRun task 7 = RandomException class");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nIteration " + i + ":");
            try {
                System.out.println("Run try...");
                testRandom.runRandomException5050();
            } catch (MyPersonalException e) {
                System.out.println("Run catch");
            } finally {
                System.out.println("Run finally");
            }
        }
    }
}