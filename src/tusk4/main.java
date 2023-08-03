package tusk4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();

        // Создаем два счета
        bank.createAccount(1, 1000, 5000);
        bank.createAccount(2, 2000, 7000);

        // Пополняем первый счет на 1500 и пытаемся пополнить второй на 6000 (превышает максимальный баланс)
        try {
            bank.deposit(1, 1500);
            bank.deposit(2, 6000);
        } catch (MaxBalanceExceededException e) {
            System.out.println(e.getMessage());
        }

        // Снимаем со второго счета 3000 и пытаемся снять с первого больше, чем есть на счету
        try {
            bank.withdraw(2, 3000);
            bank.withdraw(1, 5000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Получаем балансы обоих счетов
        System.out.println("Account 1 balance: " + bank.getBalance(1));
        System.out.println("Account 2 balance: " + bank.getBalance(2));
    }
}