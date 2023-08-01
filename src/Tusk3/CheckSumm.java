package Tusk3;

import java.sql.SQLOutput;

public class CheckSumm
{
    public void checkSum(int x, int y) throws NumberSumException {
        if ((x + y) < 10)
        {
        throw new NumberSumException("Сумма первого и второго чисел слишком мала.");
        }
        int result = x + y;
        System.out.println("Сумма " + x + "+" + y + " = " + result);
        System.out.println("Проверка прошла успешно! ");
    }
}
