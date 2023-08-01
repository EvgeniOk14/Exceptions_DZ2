package tusk4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            BankAccount account = bank.createAccount(0, 10000);
            for (int j = 0; j < 10; j++) {
//                int amount = (int)(Math.random() * 1000) - 500;
                  int amount = (int)(Math.random()*50) +20;
                executor.submit(() -> {
                    try {
                        bank.transaction(account, amount);


                    } catch (MaxBalanceExceededException e) {
                        System.out.println("ошибка:" + e.getMessage());
                    } catch (InsufficientFundsException e) {
                        System.out.println("ошибка:" + e.getMessage());
                    }
                });
            }
        }

        executor.shutdown();
    }

}

