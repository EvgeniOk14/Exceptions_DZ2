package tusk4;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Bank
{
    private ConcurrentHashMap<BankAccount, Boolean> accounts;

    public Bank() {
        accounts = new ConcurrentHashMap<>();
    }

    public BankAccount createAccount(int balance, int maxBalance) {
        BankAccount account = new BankAccount(balance, maxBalance);
        accounts.put(account, true);
        return account;
    }

    public void transaction(BankAccount account, int amount) throws MaxBalanceExceededException, InsufficientFundsException {
        System.out.println("""
                выберите операцию:
                1) Положить деньги на счёт
                2) Снять деньги со счта
                """);
        Scanner sc = new Scanner(System.in);
        int operationNumber = sc.nextInt();
        switch (operationNumber)
        {
            case 1:

            if (amount > 0)
            {
                account.deposit(amount);
            }
            else
            {
                System.out.println("Вы ввели сумму меньше нуля! Введите правильную сумму!");
                transaction(account, amount);
            }
            case 2:
                if (amount > 0)
                {
                    account.withdraw(amount);
                }
                else
                {
                    System.out.println("Вы ввели сумму меньше нуля! Введите правильную сумму!");
                    transaction(account, amount);
                }




//                catch (InsufficientFundsException | MaxBalanceExceededException e)
//                    {
//                        System.out.println(e.getMessage());
//                    }
        }
    }

}
