// This application asks user to enter three integers, obtains them
// from the user and prints their sum, product, difference and division.
// It also computes the smallest and largest number.

import java.util.Scanner;

public class math
{
    public static void main(String[] args) {
        int intOne;
        int intTwo;
        int intThree;

        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Please Enter Your First Number: ");
            intOne = input.nextInt();
            System.out.println("Please Enter Your Second Number: ");
            intTwo = input.nextInt();
            System.out.println("Please Enter Your Third Number: ");
            intThree = input.nextInt();
        }
        System.out.printf("The sum of the three integers %d, %d and %d is : %d\n", intOne, intTwo, intThree, (intOne + intTwo + intThree));
        System.out.printf("The product of the three integers %d, %d and %d is : %d\n", intOne, intTwo, intThree, (intOne * intTwo * intThree));
        System.out.printf("The average of the two integers %d, %d and %d is : %d\n", intOne, intTwo, intThree, (intOne + intTwo + intThree) / 3);

        if (intOne == intTwo && intThree == intTwo)
            System.out.println("These number are equal");
        else if (intOne > intTwo && intOne > intThree)
            System.out.printf("%d is larger\n", intOne);
        else if (intTwo > intThree && intTwo > intOne)
            System.out.printf("%d is larger\n", intTwo);
        else
            System.out.printf("%d is larger\n", intThree);
    }
}