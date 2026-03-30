import java.util.StringTokenizer;

public class Geeks {

    public static void main(String[] args) {

        String s = "Hello Geeks how are you";

        // Default delimiter is space
        StringTokenizer st = new StringTokenizer(s, " ");

        // Tokenize the string and print each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}