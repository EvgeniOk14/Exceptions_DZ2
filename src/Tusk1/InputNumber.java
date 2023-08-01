package Tusk1;
import java.util.Scanner;
public class InputNumber
{
    public Integer InputNumber()
    {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(number);
        return number;
    }
}
