import java.util.Random;

public class EXE4_3_Dice{
    public void roll(int a){
        int num = 0;
        Random r = new Random();

        for(int i = 0; i < a ; i++){
            num = r.nextInt(6) + 1;
            System.out.println(num);
        }
        
    }
}
