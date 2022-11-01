/**
 * threeOrfive
 */

import java.util.Scanner;

public class threeOrfive 
{
    public static void main(String[] args) {
        int x = 0;
        int i = 0;
        try(Scanner input = new Scanner(System.in)){
            while (i++ < 3)
            {
                System.out.println("Please Enter you numbers: ");
                x = input.nextInt();
                if (x % 3 == 0 || x % 5 == 0)
                    System.out.printf("%d\n", x);
            }    
        }
    }
}