/**
 * separatingDigits
 */

import java.util.Scanner;

public class separatingDigits 
{
    public static void main(String[] args) {
        int x;
        int i = 0;
        String holder;
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Please Enter a Five digit number: ");
            x = input.nextInt();
        }
        if (x < 10000 || x > 99999)
            System.out.println("Your number should be a five digit number (Note: Between 10000 to 99999)");
        else
        {
            holder = "" + x;
            while (i < holder.length())
            {
                System.out.printf("%c   ", holder.charAt(i));
                i++;
            }
            System.out.println();
        }
    }
}