public class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            // Allow withdrawal beyond balance up to overdraft limit
            // Allow withdrawal beyond balance up to overdraft limit
            double newBalance = getBalance() - amount;
            // If balance is negative, it means overdraft is being used
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + newBalance);

        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
