import java.util.Scanner;
import java.util.Random;

public class EXE3_1
{
    public static void main(String[] args)
    {
        int a,b,c;
        int counter;
        int score = 0;
        int answer;

        Scanner input = new Scanner(System.in);
        Random r = new Random(); 

        System.out.printf("線上測驗開始...\n");
        for(counter = 0 ; counter < 5 ;counter ++)
        {
            a = r.nextInt(8)+1;
            b = r.nextInt(8)+1;
            c = a * b;
            System.out.printf("%d x %d = ? ",a,b);
            answer = input.nextInt();

            if (answer == c)
            {
                score ++;
            }
            else
            {
                score += 0;
            }
            if(counter == 4)
            {
                input.close();
            }
        }

        if(score >= 4)
        {
            System.out.printf("數學資優生\n");
        }
        else
        {
            System.out.printf("要再加油！\n");
        }
        
    }
}