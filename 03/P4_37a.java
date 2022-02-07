import java.util.Scanner;

public class P4_37a
{
    public static void main(String[] args)
    {
        int n1 =0 , n2 =0;
        int result = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Input: ");

        n1 = input.nextInt();
        n2 = n1;
        result = n1;

        while(n1 < 0)
        {
            System.out.printf("Please input a positive integer: ");
            n1 = input.nextInt();
            n2 = n1;
            result = n1;
        }
        if(n1 == 0)
        {
            n2 = 1;
        }
        else
        {
            for(int i = 1 ; i < n1; i++)
            {
                result *= (n2-i);
            }
        }
        System.out.printf("%d! = %d\n",n1,result);
        input.close();
    }
}
