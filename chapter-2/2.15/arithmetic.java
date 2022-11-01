// This application asks user to enter two integers, obtains them
// from the user and prints their sum, product, difference and division.

import java.util.Scanner;

public class arithmetic
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
        System.out.printf("The sum of the two integers %d and %d is : %d\n", intOne, intTwo, (intOne + intTwo));
        System.out.printf("The product of the two integers %d and %d is : %d\n", intOne, intTwo, (intOne * intTwo));
        System.out.printf("The difference of the two integers %d and %d is : %d\n", intOne, intTwo, (intOne - intTwo));
        System.out.printf("The division of the two integers %d and %d is : %d\n", intOne, intTwo, (intOne / intTwo));
    }
}