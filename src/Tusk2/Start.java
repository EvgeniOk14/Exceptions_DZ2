package Tusk2;

public class Start
{
    public void start()
    {
        InputNumber in1 = new InputNumber();
        int x = in1.inputNumbers();
        InputNumber in2 = new InputNumber();
        int y = in2.inputNumbers();
        DevisionNumbers dn = new DevisionNumbers();
        try
        {
            dn.devisionNumbers(x, y);
        }
        catch (DivisionByZeroException e)
        {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}