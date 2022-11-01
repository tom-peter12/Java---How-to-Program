/**
 * evenOddSum
 */

import java.util.Scanner;

public class evenOddSum 
{
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int i = 0;
        try(Scanner input = new Scanner(System.in)){
            while (i++ < 5)
            {
                System.out.println("Please Enter Your number Here: ");
                int x = input.nextInt();
                if (x % 2 == 0)
                    evenSum += x;
                else
                    oddSum += x;
            }
        }
        System.out.printf("The sum of the even numbers is %d\n", evenSum);
        System.out.printf("The sum of the odd numbers is %d\n", oddSum);
    }
}