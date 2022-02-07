import java.util.Random;

public class EXE5_1 {
   public static void main(String[] args){
       Random randomNumbers = new Random();
       int []array = new int[7];

       for(int i = 1 ;i <= 6 ; i++){
           array[i] = 1 + randomNumbers.nextInt(42);
       }

       for(int y = 1 ; y <=6 ; y++){
           System.out.println("array[" + y + "] is " + array[y]);
       }
   }
}
