/*
Дана строка "Versions: Java 5, Java 6, Java 7, Java 8, Java 12." Найдите все подстроки "Java X" и распечатать их.
*/

public class Task4_6 {
    
    public static void main(String[] args) {
        
     String text = "Versions: java 5, JaVa 6, JavA 7, Java 8, Java 12.";
     int count = 0;
     StringBuilder textJava = new StringBuilder();
     
     char[] letters = text.toCharArray();
     for (int i = 0; i < letters.length-1; i++) {
         if (String.valueOf(letters[i]).toUpperCase().equals("J") && (i + 1 < letters.length)) {
             textJava.append(letters[i]);
             i++;
             if (String.valueOf(letters[i]).toUpperCase().equals("A") && (i + 1 < letters.length)) {
                 textJava.append(letters[i]);
                 i++;
                 if (String.valueOf(letters[i]).toUpperCase().equals("V") && (i + 1 < letters.length)) {
                     textJava.append(letters[i]);
                     i++;
                     if (String.valueOf(letters[i]).toUpperCase().equals("A") && (i + 1 < letters.length)) {
                         textJava.append(letters[i]);
                         i++;
                         if (String.valueOf(letters[i]).toUpperCase().equals(" ") && (i + 1 < letters.length)) {
                             textJava.append(letters[i]);
                             i++;
                             for (int j = i; j < letters.length-1; j++, i++) {
                                 if ((letters[i] == '1' || letters[i] == '2' || letters[i] == '3' || letters[i] == '4' || 
                                     letters[i] == '5' || letters[i] == '6' || letters[i] == '7' || letters[i] == '8' || 
                                     letters[i] == '9' || letters[i] == '0') && (i + 1 < letters.length)) {
                                     textJava.append(letters[i]);
                                     } else {
                                     j = letters.length;
                                     textJava.append(' ');
                                     count++;
                                 }
                             }
                         }
                 }
                 }
             }
             
             
         } 
     }
     
     System.out.println(count == 0 ? "No Java X in text" : textJava.toString());
    }
}
