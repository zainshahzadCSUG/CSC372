public class BankAccount {

    // store the customer's first name
    protected String firstName;

    // store the customer's last name
    protected String lastName;

    // unique identifier for the account
    protected int accountID;

    // track the current balance of the account
    protected double balance;

    // default constructor initializes a new account with a zero balance
    public BankAccount() {
        balance = 0.0;
    }

    // assigns the first name provided by the user
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // assigns the last name provided by the user
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // store the account ID entered by the user
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // add the specified amount to the current balance
    public void deposit(double amount) {
        balance += amount;
    }

    // output the core account details in a formatted summary
    public void accountSummary() {
        System.out.println("Account Holder: " + firstName + " " + lastName);
        System.out.println("Account ID: " + accountID);
        System.out.println("Balance: $" + balance);
    }
}
