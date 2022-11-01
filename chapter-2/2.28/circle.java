/**
 * circle
 */

import java.util.Scanner;;

public class circle 
{
    public static void main(String[] args) {
        final float PI = (float) 3.14159;
        float radius;
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Please Enter the Radius of Your Circle here:");
            radius = input.nextInt();
        }
        System.out.printf("The diameter of your circle is :%.2f\n", 2 * radius);
        System.out.printf("The Circumference of your circle is :%.2f\n", 2 * PI * radius);
        System.out.printf("The area of your circle is :%.2f\n", PI * radius * radius);
    }    
}