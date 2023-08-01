package Tusk3;

public class Start {
    public void start() throws NumberSumException, DivisionByZeroException
    {
        InputNumber in1 = new InputNumber();
        int x = in1.inputNumber();
        try
        {
            CheckFirstNumber cfn = new CheckFirstNumber();
            cfn.checkFirstNumber(x);
        }
        catch (NumberOutOfRangeException e)
        {
            System.out.println("ошибка: " + e.getMessage());
        }



        InputNumber in2 = new InputNumber();
        int y = in1.inputNumber();
        try
            {
                CheckSecondNumber cfn1 = new CheckSecondNumber();
                cfn1.checkSecondNumber(y);
            }
            catch (NumberOutOfRangeException e)
            {
                System.out.println("ошибка: " + e.getMessage());
            }


        try
        {
            CheckSumm cfn = new CheckSumm();
            cfn.checkSum(x, y);
        }
        catch (NumberSumException e)
        {
            System.out.println("ошибка: " + e.getMessage());
        }



        InputNumber in3 = new InputNumber();
        int z = in3.inputNumber();
        try
        {
            DivisionByZero dbz = new DivisionByZero();
            dbz.divisionByZero(z);
        }
        catch (DivisionByZeroException e)
        {
            System.out.println("ошибка: " + e.getMessage());
        }

    }
}




