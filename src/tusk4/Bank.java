package tusk4;

import java.util.concurrent.ConcurrentHashMap;

class Bank
{
    private ConcurrentHashMap<Integer, BankAccount> accounts;
    public Bank()
    {
        accounts = new ConcurrentHashMap<>();
    }

    public synchronized void createAccount(
                                           int accountId,
                                           double initialBalance,
                                           double maxBalance
                                           )
    {
        accounts.put(accountId, new BankAccount(initialBalance, maxBalance));
    }


    public synchronized void deposit(int accountId, double amount) throws MaxBalanceExceededException {
        BankAccount account = accounts.get(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Invalid account id!");
        }
        account.deposit(amount);
    }

    public synchronized void withdraw(int accountId, double amount) throws InsufficientFundsException {
        BankAccount account = accounts.get(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Invalid account id!");
        }
        account.withdraw(amount);
    }

    public synchronized double getBalance(int accountId) {
        BankAccount account = accounts.get(accountId);
        if (account == null) {
            throw new IllegalArgumentException("Invalid account id!");
        }
        return account.getBalance();
    }
}
