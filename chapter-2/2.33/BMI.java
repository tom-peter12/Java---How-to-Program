/**
 * BMI
 */

import java.util.Scanner;

public class BMI 
{
    public static void main(String[] args) {
        float weightInKilograms;
        float heightInMeter;
        float BMI;
        
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter your weight here: (In kilograms)");
            weightInKilograms = input.nextFloat();
            System.out.println("Enter your height here: (In Meter)");
            heightInMeter = input.nextFloat();
        }
        BMI = weightInKilograms / (heightInMeter * heightInMeter);
        if (BMI < 18.5)
            System.out.printf("Your BMI is %f --> Underweight:  Less than 18.5\n", BMI);
        else if (BMI >= 18.5 && BMI <= 24.9)
            System.out.printf("Your BMI is %f --> Normal:       Between 18.5 and 24.9\n", BMI);
        else if(BMI >= 25 && BMI <= 29.9)
            System.out.printf("Your BMI is %f --> Overweight:   Between 25 and 29.9\n", BMI);
        else
            System.out.printf("Your BMI is %f --> Obese:        30 or greater\n", BMI);
    }    
}