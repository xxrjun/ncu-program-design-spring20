import java.util.Random;
import java.util.Arrays;
public class reEXE5_1 {
    public static void main(String[] args){
        int n = 0;
        int []array = new int[7];
        Random r = new Random();

        for(int i = 1 ; i <= 6 ; i++){
            n = 1 + r.nextInt(42);
            while(Arrays.binarySearch(array,n) >= 1){
                n = 1 + r.nextInt(42);
            }
            array[i] = n;
        }
        System.out.printf("Power numbers: ");
        for(int i = 1 ; i <=6 ; i++){
            System.out.printf("%d ",array[i]);
        }
    }
}
