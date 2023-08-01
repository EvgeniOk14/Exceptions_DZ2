package Tusk1;

public class ChekNumber
{
    public ChekNumber(Integer number) throws InvalidArgumentException {
        if(number > 0)
        {
            System.out.println("Число корректное! ");
        }
        else
            {
                throw new InvalidArgumentException("Invalid number: " + number + " не корректное число! ");
            }

        }
    }

