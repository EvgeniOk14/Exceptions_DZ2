package Tusk3;

public class main
{
    public static void main(String[] args)
    {
        Start start = new Start();
        try {
            start.start();
        } catch (NumberSumException e) {

        } catch (DivisionByZeroException e) {

        }
    }
}
