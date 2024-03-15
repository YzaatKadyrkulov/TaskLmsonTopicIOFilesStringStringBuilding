public class Words {

    public static String reverseWord(String word) {
        StringBuilder reverseWord = new StringBuilder(word);
        reverseWord.reverse();

        return reverseWord.toString();
    }

    public static String outputArrayOfWords(String[] arrays) {
        StringBuilder arrayOfWords = new StringBuilder();
        for (String array : arrays) {
            arrayOfWords.append(array);
        }
        return arrayOfWords.toString();
    }

    public static String getAllConsonants(String word) {
        int vowelCount = 0;
        String allVowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (allVowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        return "In word: " + vowelCount + " vowels letters";

    }

    public static void findPalindrome(String word) {
        StringBuilder palindrome = new StringBuilder(word).reverse();
        if (word.equals(palindrome.toString())) {
            System.out.println("The word is palindrome");
        } else {
            System.out.println("The word isn't palindrome");
        }
    }

    public static String getInitialLetter(String word) {
        StringBuilder initialWord = new StringBuilder(word);

        return initialWord.substring(0, 1).toUpperCase() + initialWord.substring(1);
    }

    public static String countWordsOfAmount(String word) {
        StringBuilder count1Word = new StringBuilder(word);

        String sentence = count1Word.toString();
        String[] words = sentence.split("\\s+");

        int wordCount = words.length;

        return "Amount of words in one line: " + wordCount;
    }

    public static String getASCIICode(String word) {
        StringBuilder ASCIICode = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            ASCIICode.append((int) letter);
        }
        return "ASCIICode code of words " + word + " this- " + Integer.parseInt(ASCIICode + "");
    }

    public static String getSentenceWithoutSpaces(String word) {
        StringBuilder sentence = new StringBuilder(word);
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                sentence.delete(i, i + 1);
                }
            }
        return sentence + "";

    }

    }

