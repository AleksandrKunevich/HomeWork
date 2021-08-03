/*
* Написать программу, которая проходит циклом по английскому алфавиту, начиная с буквы ‘b’,
* и выводит каждую букву до тех пор, пока не встретит гласную (т.е. вывести согласные на консоль).
(Второй вариант: до второй гласной)
*/

package by.tms.lesson5;

public final class ConsonantLetters {

    private ConsonantLetters() {
    }

    public static void showConsonantLetters(int indexOfVowelLetter) {

        // a e i o u y = 6
        if ((indexOfVowelLetter >= 1) && (indexOfVowelLetter <= 5)) {
            int count = 0;
            for (int i = 'b'; i < 'b' + 25; i++) {
                if (count == indexOfVowelLetter) break;
                switch ((char) i) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        count++;
                        break;
                    default:
                        System.out.print((char) (i - 32) + "" + (char) i + " ");
                        break;
                }
            }
        } else {
            System.out.println("Incorrect indexOfVowelLetter. Must be 1..5.");
        }
    }
}
