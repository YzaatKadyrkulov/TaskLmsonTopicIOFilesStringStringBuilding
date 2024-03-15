import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * Task of teacher
         * Deadline : 13.03.2024 / 11:00
         * 1. Параметирине String тибинде соз алып ал созду тескерисинен кылып кайтарган метод туз.
         *
         * 2. StringBuilder аркылуу создордун массивдерин алып, аларды бир сапка бириктирген метод түз.
         *
         * 3. Параметирине соз алып ал создун ичинде канча ундуу тамга бар экенин эсептеген метод туз.
         *
         * 4. StringBuilder жардамы менен берилген. соз палиндром экенин текшеруучу метод туз.
         *
         * 5. StringBuilder аркылуу сүйлөмдөгү ар бир сөздүн биринчи тамгасын баш тамга менен жазуучу метод туз.
         *
         * 6. String жана StringBuilder жардамы менен сүйлөмдөгү сөздөрдүн санын эсептөөчу метод туз.
         *
         * 7. StringBuilder аркылуу ар бир тамганын өзүнүн ASCII коду менен алмаштырган метод туз.
         *
         * 8. StringBuilder аркылуу cуйломдон бардык боштуктарды (пробелдерди) алып салуучу метод туз.
         */

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1.Reverse words.
                    2.Output all words from arrays in one line.
                    3.Voiced letters.
                    4.Output words of palindrome.
                    5.Output initialWord.
                    6.Output Words in one line.
                    7.Output ASCII.
                    8.Output sentence without spaces.
                    9.Exit.""");
            switch (new Scanner(System.in).nextInt()) {
                case 1:
                    System.out.println("Write words: ");
                    String words = scanner1.nextLine();
                    System.out.println(Words.reverseWord(words));
                    break;
                case 2:
                    System.out.print(" Enter arrays of numbers: ");
                        int num = scanner2.nextInt();

                        String[] array = new String[num];
                        for (int i = 0; i < array.length; i++) {
                            System.out.println("Arrays: " + (i + 1) + ": ");
                            array[i] = scanner2.next();
                        }
                        String arrayOfWords = Words.outputArrayOfWords(array);

                        System.out.println(" An array concatenated into one row: " + arrayOfWords);
                        break;
                case 3:
                    System.out.println("Write words, it method outputs voiced letters. ");
                    String voicedLetters = scanner1.nextLine();
                    System.out.println(Words.getAllConsonants(voicedLetters));
                    break;
                case 4:
                    System.out.println("Enter words, it  method outputs a word of palindrome.");
                    String palindrome = scanner1.nextLine();
                    Words.findPalindrome(palindrome);
                    break;
                case 5:
                    System.out.println("Write words, it method outputs an initial word. ");
                    String initialWord = scanner1.nextLine();
                    System.out.println(Words.getInitialLetter(initialWord));
                    break;
                case 6:
                    System.out.println("Write words, it method outputs a word of amount. ");
                    String amountOfWords = scanner1.nextLine();
                    System.out.println(Words.countWordsOfAmount(amountOfWords));
                    break;
                case 7:
                    System.out.println("Write number or numbers, it method outputs ASCIICode. ");
                    String ASCIICode = scanner1.nextLine();
                    System.out.println(Words.getASCIICode(ASCIICode));
                    break;

                case 8:
                    System.out.println("Write words, it method cleans пробелы. ");
                    String пробелы = scanner1.nextLine();
                    System.out.println(Words.getSentenceWithoutSpaces(пробелы));
                    break;
                case 9:
                    System.exit(0);
            }
            }
        }


}