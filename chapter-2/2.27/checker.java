/**
 * checker
 */

public class checker 
{
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (i % 2 == 0)
                    System.out.printf("%s", "* ");
                else
                    System.out.printf("%s", " *");
            }
            System.out.println();
        }
    }
}