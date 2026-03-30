import java.util.Scanner;

class TextEditorBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StringBuffer
        System.out.print("Enter initial text: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        // Append text
        System.out.print("Enter text to append: ");
        sb.append(sc.nextLine());

        // Insert text at specific position
        System.out.print("Enter text to insert: ");
        String insertText = sc.nextLine();

        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();

        sb.insert(pos, insertText);

        // Reverse string
        sb.reverse();

        // Display final string
        System.out.println("Final String: " + sb);
    }
}