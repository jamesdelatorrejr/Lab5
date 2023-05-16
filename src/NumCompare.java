public class NumCompare {
    public static void main(String[] args)
    {
        int numberOne = 6;
        int numberTwo = 0;

        if (numberOne == numberTwo)
        {
            System.out.println("The numbers " + numberOne + " and " + numberTwo + " are equal.");
        }
        else if (numberOne > numberTwo)
        {
            System.out.println(numberOne + " is greater than " + numberTwo);
        }
        else if (numberOne < numberTwo)
        {
            System.out.println(numberOne + " is less than " + numberTwo);
        }
        else
        {
            System.out.println("There is an error. Check your spelling.");
        }
    }

}
