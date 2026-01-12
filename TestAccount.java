import java.util.Scanner;

public class TestAccount {

    public static void main(String[] args) {

        // scanner object allows the program to receive user input
        Scanner s = new Scanner(System.in);

        // creates a CheckingAccount object with a predefined interest rate
        CheckingAccount a = new CheckingAccount(2.5);

        // prompts the user for personal and account information
        System.out.print("Enter first name: ");
        a.setFirstName(s.nextLine());

        System.out.print("Enter last name: ");
        a.setLastName(s.nextLine());

        System.out.print("Enter account ID: ");
        a.setAccountID(s.nextInt());

        // collects and processes an initial deposit
        System.out.print("Enter deposit amount: ");
        a.deposit(s.nextDouble());

        // stores the withdrawal amount for later processing
        System.out.print("Enter withdrawal amount: ");
        double w = s.nextDouble();

        // displays the account state before withdrawal
        a.displayAccount();

        // processes the withdrawal using the CheckingAccount logic
        System.out.println("\nProcessing withdrawal of $" + w + "...");
        a.processWithdrawal(w);

        // displays final account details after all operations
        System.out.println("\nFinal Account Details:");
        a.displayAccount();

        // closes the Scanner to release system resources
        s.close();
    }
}

