package Tusk3;

public class CheckFirstNumber
{
    public void checkFirstNumber(int number) throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException
    {
        if(number > 100)
        {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона.");
        }
        System.out.println("Проверка прошла успешно! ");
    }
}
