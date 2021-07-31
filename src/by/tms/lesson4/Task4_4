/*
 * Напишите метод, который в принимает в качестве параметра любую строку, например "I like Java!!!".
 * - Распечатать последний символ строки.
 * - Проверить, заканчивается ли ваша строка подстрокой "!!!".
 * - Проверить, начинается ли ваша строка подстрокой "I like" .
 * - Проверить, содержит ли ваша строка подстроку "Java".
 * - Найти позицию подстроки "Java" в строке "I like Java!!!".
 * - Заменить все символы "a" на "o".
 * - Преобразуйте строку к верхнему регистру.
 * - Преобразуйте строку к нижнему регистру.
 * - Вырезать строку Java.
 */
 
 public class Task4_4{
 
     public static void Main(String[] args){
     
     String anyString = "I like Java!!!";
     StringBuilder anyStringBuilder = new StringBuilder(anyString);
     char lastCharInStringBuilder = anyStringBuilder.charAt(anyStringBuilder.length()-1);
     System.out.println("(StringBuilder) Last simbol: " + lastCharInStringBuilder);
     
     char lastCharInString = anyString.charAt(anyString.length()-1);
     System.out.println("(String) Last simbol: " + lastCharInString);
     
     System.out.println(anyString.endsWith("!!!") ? "String end \"!!!\"" : "String is NOT end \"!!!\"");
     System.out.println(anyString.startsWith("I like") ? "String start \"I like\"" : "String NOT start \"I like\"");
     
     String wordJava = "Java";
     System.out.println("(regionMatches) Java is inside: " + anyString.regionMatches(7, "Java", 0, 4));
     int index = anyString.indexOf(wordJava);
     System.out.println(index != -1 ? "(indexOf) \"Java\" inside." : "(indexOf) \"Java\" is NOT inside.");
     System.out.println("(contains) \"Java\" inside: " + anyString.contains("Java"));
     
     System.out.println("\"Java\" position is: " + index);
     
     String changeAnyStringLetter = anyString.replace('a', 'o');
     System.out.println("Result \'a\' replace to \'o\': " + changeAnyStringLetter);
     
     System.out.println(anyString.toUpperCase());
     System.out.println(anyString.toLowerCase());
     
     String changeAnyStringWord = anyString.replace("Java", "");
     System.out.println("Delete \"Java\": " + changeAnyStringWord);
     }
 }
