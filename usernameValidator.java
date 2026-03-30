import java.util.Scanner;

class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept username
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        // Remove spaces
        username = username.trim();

        // Convert to lowercase
        username = username.toLowerCase();

        // Display result
        System.out.println("Cleaned Username: " + username);
    }
}