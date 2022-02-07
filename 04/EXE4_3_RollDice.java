
import java.util.Scanner;

public class EXE4_3_RollDice {
    public static void main(String[] args){
        int a = 0;
        Scanner input = new Scanner(System.in);
        EXE4_3_Dice roll1 = new EXE4_3_Dice(); 
    
        System.out.printf("How many times you want to roll: ");
        a = input.nextInt();
        roll1.roll(a);

        input.close();
    }
}
