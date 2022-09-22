public class Main
{
    public static void main(String[] args)
    {
        int numberOne = 23;
        int numberTwo = 46;

        System.out.println("Please enter a number.");
        System.out.println("Please enter another number.");

        if (numberOne == numberTwo)
        {
            System.out.println(numberOne + " is equal to " + numberTwo + ".");
        }
        else if (numberOne > numberTwo)
        {
            System.out.println(numberTwo + " is less than " + numberOne + ".");
        }
        else
        {
            System.out.println(numberOne + " is less than " + numberTwo + ".");
        }
    }
}