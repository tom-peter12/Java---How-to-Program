/**
 * carPooling
 */

import java.util.Scanner;;

public class carPooling 
{
    public static void main(String[] args) {
        float milesDriven;      // Total miles driven per day
        float gasCost;          // Cost per gallon of gasoline
        float milesPerGallon;   // Average miles per gallon
        float parkingFees;      // Parking fees per day
        float tolls;            // Tolls per day
        try(Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter Total Miles You Drive Per Day: ");
            milesDriven = input.nextFloat();
            System.out.println("Enter Cost Per Gallon of Gasoline: ");
            gasCost = input.nextFloat();
            System.out.println("Enter Average Miles Per Gallon: ");
            milesPerGallon = input.nextFloat();
            System.out.println("Enter Parking Fees Per Day: ");
            parkingFees = input.nextFloat();
            System.out.println("Enter Tolls Per Day: ");
            tolls = input.nextFloat();
        }

        System.out.printf("Your daily driving cost is: %.1f\n", tolls + parkingFees + (milesDriven / milesPerGallon) * gasCost);
    }    
}