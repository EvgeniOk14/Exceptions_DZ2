package tusk4;

class BankAccount {
    private double balance;
    private double maxBalance;

    public BankAccount(double balance, double maxBalance) {
        this.balance = balance;
        this.maxBalance = maxBalance;
    }

    public synchronized void deposit(double amount) throws MaxBalanceExceededException {
        if (balance + amount > maxBalance) {
            throw new MaxBalanceExceededException("Deposit amount exceeds maximum balance!");
        }
        balance += amount;
    }

    public synchronized void withdraw(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Withdrawal amount exceeds available balance!");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
