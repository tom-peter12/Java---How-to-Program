/**
 * squaresAndcubes
 */
public class squaresAndcubes 
{
    public static void main(String[] args) {
        System.out.println("number  square  cube");
        for (int i = 0; i <= 10; i++)
        {
            System.out.printf("%6d %7d %6d\n", i, i * i, i * i * i);
        }
    }
}