package tusk4;

    public class BankAccount
    {
        private double balance;
        private double maxBalance;
        public BankAccount(double maxBalance, double balance)
        {
            this.maxBalance = maxBalance;
            this.balance = balance;
        }

        public synchronized void deposit(int cash) throws MaxBalanceExceededException
        {
            if((balance + cash) > maxBalance)
            {
                throw new MaxBalanceExceededException("Вы превысили максимально допустимую сумму!");
            }
            balance+= cash;
        }

        public synchronized void withdraw(int cash) throws InsufficientFundsException
        {
            if((balance - cash) < 0)
            {
                throw new InsufficientFundsException("Ваш баланс меньше допустимого! ");
            }
            balance-= cash;
        }
}
