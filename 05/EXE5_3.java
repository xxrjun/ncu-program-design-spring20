import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class EXE5_3{

    public static void draw(int lotto[]){
        System.out.printf("Power numbers: ");
        for(int i : lotto){
               System.out.printf( i +" ");
        }
    }
    public static void check(int userNum[], int lotto[]){
        int count = 0;
        for(int i = 0; i < 6 ; i++){
            int n = Arrays.binarySearch(userNum,lotto[i]);
            if(n >= 1){
                count ++;
            }
        }
        System.out.println("is: " +count);
        if(count == 6){
            System.out.println("First prize");
        }
        else if (count == 5){
            System.out.println("Second prize");
        }
        else if (count == 4){
            System.out.println("Third prize");
        }
        else if (count == 3){
            System.out.println("Fourth prize");
        }
        else{
            System.out.println("No prize");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] userNum = new int[6];
        int temp2 = 0;
        System.out.printf("Please input six num: ");
        for(int i = 0; i < 6 ; i++){
            temp2 = input.nextInt();
            while(Arrays.binarySearch(userNum,temp2) >= 1){
                System.out.printf("Please input diffrent: ");
                userNum[i] = input.nextInt();
            }
            userNum[0] = temp2;
            Arrays.sort(userNum);
        }

        Random randomNumbers = new Random();
        int []lotto = new int[6];
        int temp = 0;

        for(int i = 0 ;i <= 6 ; i++){  
            do{
                temp = 1 + randomNumbers.nextInt(9);
            }while(Arrays.binarySearch(lotto,temp) >= 0);
            lotto[0] = temp;//let fresh number to first place
            Arrays.sort(lotto);//let array arrang by numbers
        }

        draw(lotto);
        System.out.printf("\n");
        check(userNum,lotto);

        input.close();
    }
}