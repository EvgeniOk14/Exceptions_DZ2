package Tusk3;

public class DivisionByZero
{
    public void divisionByZero(int number) throws DivisionByZeroException {
        if (number == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо! ");
        }
        System.out.println("Проверка прошла успешно! ");
    }
}