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
            // Assuming super.withdraw() handles balance
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
