import java.util.Scanner;

public class gORl {
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

        if (intOne == 10 && intThree == 10 && intTwo == 10)
            System.out.println("Those integers are the same as number 10");
        else if (intOne > 10 && intThree > 10 && intTwo > 10)
            System.out.println("All Integers are larger than 10");
        else if (intOne < 10 && intThree < 10 && intTwo < 10)
            System.out.println("All Integers are smaller than 10");
        else
            System.out.println("One of the integers is either smaller or larger than 10");
    }
}