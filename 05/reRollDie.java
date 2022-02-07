import java.util.Random;
import java.util.Scanner;

public class reRollDie {
    public static void main(String[] args){
        int times = 0;//user input times
        int face = 0;
        int [] frequency = new int[7];
        Random r = new Random();
        Scanner input = new Scanner(System.in);

        System.out.printf("Input how many times you want to roll: ");
        times = input.nextInt();

        for(int i = 0; i < times ; i++){
            face = 1 + r.nextInt(6);
            ++frequency[face];
        }
        System.out.printf("%s%10s","Face","Frequency");
        System.out.println();

        for(int i = 1; i <= 6; i++){
            System.out.printf("%d%,10d",i,frequency[i]);
            System.out.println();
        }

        input.close();
    }    
}
