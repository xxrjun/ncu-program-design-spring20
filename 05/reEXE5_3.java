import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class reEXE5_3 {
    public static void main(String[] args){
        reEXE5_3 functionUse = new reEXE5_3();
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        int []lotto = new int[3];
        int []userNum = new int[3];
        int tempUser = 0;
        int tempLotto = 0;

        System.out.printf("Input three diffrent numbers(1~12): ");
        for(int i = 0 ;i < userNum.length ; i++){
            tempUser = input.nextInt();
            while(Arrays.binarySearch(userNum,tempUser) >= 1){
                System.out.printf("Pleas input diffrent number: ");
                tempUser = input.nextInt();
            }
            while(tempUser > 12 || tempUser < 1){
                System.out.printf("Pleas input 1~12 number: ");
                tempUser = input.nextInt();
            }
            userNum[0] = tempUser;
            Arrays.sort(userNum);
        }

        for(int i = 0 ;i < userNum.length ; i++){
            do{
                tempLotto = 1 + r.nextInt(12);
            }while((Arrays.binarySearch(lotto,tempLotto) >= 0));
            lotto[0] = tempLotto;
            Arrays.sort(lotto);
        }

        functionUse.draw(lotto);
        System.out.printf("Your number: ");
        for(int i = 0;i < userNum.length ; i++){
            System.out.printf("%d ", userNum[i]);
        }
        functionUse.check(userNum,lotto);

        input.close();//close the Scanner

    }//end main

    public void draw(int lotto[]){
        System.out.printf("Power numbers: ");
        for(int i = 0 ; i < lotto.length ; i++){
            System.out.printf("%d ",lotto[i]);
        }
        System.out.println();
    }//to display power numbers

    public void check(int userNum[],int lotto[]){
        int count = 0;
        for(int i = 0 ; i < lotto.length ; i++){
            if(Arrays.binarySearch(userNum,lotto[i]) >= 0){
                count++;
            }
        }
        System.out.println();
        System.out.println("Your got " + count +" numebrs");
        
        switch(count){
            case 1:
                System.out.println("Third prize");
                break;
            case 2:
                System.out.println("Second prize");
                break;
            case 3:
                System.out.println("First prize");
                break;
            default:
                System.out.println("No prize");
                break;
        }
    }//to display whether and whick prize user get
}