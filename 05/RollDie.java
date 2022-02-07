import java.util.Random;

public class RollDie{
    public static void main(String[] ars){
        Random randomNumbers = new Random();
        int frequency[] = new int[7];
        System.out.println("*Roll dice randomly and Count total*");

        for(int roll = 1; roll <= 6000; roll++){
            ++frequency[1 + randomNumbers.nextInt(6)];
        }
        System.out.printf("%s%10s\n","Face","Frequency");

        for(int face = 1 ; face <=6 ; face++){
            System.out.printf("%d%10d\n",face,frequency[face]);
        }
    }
}