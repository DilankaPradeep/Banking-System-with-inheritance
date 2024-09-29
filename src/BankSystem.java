public class BankSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("12345", 1000, 5);
        BankAccount current = new CurrentAccount("67890", 2000, 500);

        savings.deposit(500);
        current.withdraw(2500); // Uses overdraft

        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Current Account Balance: " + current.getBalance());

        // Polymorphic behavior
        BankAccount[] accounts = {savings, current};
        for (BankAccount account : accounts) {
            account.withdraw(100); // Calls the appropriate withdraw method
            System.out.println("Balance after withdrawal: " + account.getBalance());
        }
    }
}
