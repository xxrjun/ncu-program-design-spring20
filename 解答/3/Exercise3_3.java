import java.util.Scanner;
public class Exercise3_3 {
     public static void main(String args[]){
           int row;
           Scanner s = new Scanner(System.in);
           System.out.print("�аݭn�L�X�C���T���άP�P?");
           row = s.nextInt();

     for(int i=1; i<= row; i++){
       for (int j = 1; j <= i; j++){
         System.out.print("*");
       }
       System.out.println();
     }   
   }
}
