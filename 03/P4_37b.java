import java.util.Scanner;

public class P4_37b 
{
    public static void main(String[] args)
    {
        int l1 = 0;//input
        int l2 = 0,l3 = 0;//for calculate
        int iL = 0;//for count
        int y = 1;
        double result = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("l = 1 + 1/1! + 1/2! +....+1/n!\n");
        System.out.printf("Input: ");

        l1 = input.nextInt();
        l2 = l1;
        l3 = l1;
        iL = l1;

        while(l1 < 0)
        {
            System.out.printf("Please input a positive integer: ");
            l1 = input.nextInt();
            l2 = l1;
            result = l1;
        }
        if(l1 == 0)
        {
            result = 1.00;
        }
        else
        {
            for(int j = 0 ; j < l1 +1 ; j++)
            {   
                for(int i = 1 ; i < iL; i++)
                {   
                    l3 *= (l2-i);
                }
                if (iL <= 1)
                {
                    l3 = 1;
                }
                result += (double) 1/l3;
                System.out.printf("l = %.2f , l3 = %d , iL = %d \n",result,l3,iL);
                iL -= 1;
                l3 = l1;
                l3 -= y;
                l2 = l3;
                y++;
            }
        }
        System.out.printf("l = %.2f\n",result);
        input.close();
        
    }    
}
