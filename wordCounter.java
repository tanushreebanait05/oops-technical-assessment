import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Create StringTokenizer object
        StringTokenizer st = new StringTokenizer(sentence);

        // Count words
        int count = st.countTokens();

        // Display result
        System.out.println("Total number of words: " + count);
    }
}