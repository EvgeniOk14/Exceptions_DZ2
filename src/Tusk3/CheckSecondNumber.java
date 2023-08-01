package Tusk3;

public class CheckSecondNumber {
    public void checkSecondNumber(int number) throws NumberOutOfRangeException
    {
        if(number < 0)
        {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона.");
        }
        System.out.println("Проверка прошла успешно! ");
        }
    }
