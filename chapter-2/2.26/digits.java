/**
 * digits
 */

import java.util.Scanner;

public class digits
{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Please enter your double digit number");
            int x = input.nextInt();
            if (x > 99 || x < 0)
                System.out.println("Please Enter a two digit number (Note: Between 0 - 99)");
            else
            {
                System.out.printf("The first digit is : %d\n", x / 10);
                System.out.printf("The second digit is : %d\n", x % 10);
            }
        }
    }    
}