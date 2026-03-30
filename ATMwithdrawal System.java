import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance, withdraw;

        System.out.print("Enter balance: ");
        balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        withdraw = sc.nextInt();

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance -= withdraw;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}