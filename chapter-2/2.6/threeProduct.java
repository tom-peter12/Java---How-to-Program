// The program will calculate the product of three integers

import java.util.Scanner;
public class threeProduct 
{
    public static void main(String[] args) {
        
        int x, y, z, result;

        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Please Enter Your first integer: ");
            x = input.nextInt();
            System.out.println("Please Enter Your second integer: ");
            y = input.nextInt();
            System.out.println("Please Enter Your third integer: ");
            z = input.nextInt();
        }

        result = x * y * z;
        System.out.printf("Product is %d\n", result);
    }
}
