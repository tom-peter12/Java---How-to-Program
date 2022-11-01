/**
 * populationGrowth
 */

import java.util.Scanner;

public class populationGrowth 
{
    public static void main(String[] args) {
        long worldPopulation;
        float growthRate;
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Enter current world population here: ");
            worldPopulation = input.nextLong();
            System.out.println("Enter The annual world population growth rate here: ");
            growthRate = input.nextFloat();
        }
        for (int i = 1; i < 6; i++)
        {
            System.out.printf("%.0f\n", (i * growthRate / 100 * worldPopulation) + worldPopulation);
        }
    }    
}