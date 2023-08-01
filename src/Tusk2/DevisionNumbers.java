package Tusk2;

public class DevisionNumbers
{
    public void devisionNumbers(int x, int y) throws DivisionByZeroException
    {
        float result;
        if (y == 0)
        {
            throw new DivisionByZeroException("Деление на ноль не допустимо! ");
        }

            {
                System.out.println("Результат деления двух чисел = " + x / y);
            }
    }
}