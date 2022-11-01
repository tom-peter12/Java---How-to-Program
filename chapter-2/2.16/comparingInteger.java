// This application compares two integers.

import java.util.Scanner;

public class comparingInteger
{
    public static void main(String[] args) {
        int intOne;
        int intTwo;

        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Please Enter Your First Number: ");
            intOne = input.nextInt();
            System.out.println("Please Enter Your Second Number: ");
            intTwo = input.nextInt();
        }
        if (intOne == intTwo)
            System.out.println("These number are equal");
        else if (intOne > intTwo)
            System.out.printf("%d is larger\n", intOne);
        else
            System.out.printf("%d is larger\n", intTwo);
    }
}