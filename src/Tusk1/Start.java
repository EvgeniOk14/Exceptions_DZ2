package Tusk1;

public class Start
{

    public void start()
    {
        InputNumber t = new InputNumber();
        try {
            ChekNumber C = new ChekNumber(t.InputNumber());
        } catch (InvalidArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
