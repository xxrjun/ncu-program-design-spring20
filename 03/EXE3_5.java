import java.util.Scanner;

public class EXE3_5

{
    public static void main(String [] args)
    {
        int a;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.printf("請問要印幾列三角形星星？ ");
        a = input.nextInt();

        for(int i = a ;i > 0 ; i--)
        {
            for(int y = 0; y < count; y ++)
            {
                System.out.printf(" ");
            }
            for(int j = i ; j > 0 ; j--)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
            count ++;
        }

        input.close();
    }
}
