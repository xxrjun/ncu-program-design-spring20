import java.util.Scanner;

public class EXE3_3 

{
    public static void main(String [] args)
    {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.printf("請問要印幾列三角形星星？ ");
        a = input.nextInt();

        for(int i = 1 ;i < a + 1 ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        input.close();
    }
}
