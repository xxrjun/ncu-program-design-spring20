import java.util.Scanner;

public class EXE3_20
{
    public static void main(String [] args)
    {
        int number;
        int largest = 0;
        Scanner input = new Scanner (System.in);
        System.out.printf("Input ten numbers: ");
        for(int counter = 0 ; counter < 10 ; counter++)
        {
            number = input.nextInt();

            if( number > largest)
            {
                largest = number;
            }
        }

        System.out.printf("The largest number is %d\n",largest);
    }
}