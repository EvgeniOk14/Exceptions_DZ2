package Tusk2;

import java.util.Scanner;

public class InputNumber
{
  public Integer inputNumbers()
  {
      System.out.println("Введите число: ");
      Scanner sc1 = new Scanner(System.in);
      int number = Integer.parseInt(sc1.nextLine());
      return number;
  }
}
