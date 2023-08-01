package Tusk3;

import java.util.Scanner;

public class InputNumber
{
    public int inputNumber()
    {
        System.out.println("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(number);
        return number;
    }
}
