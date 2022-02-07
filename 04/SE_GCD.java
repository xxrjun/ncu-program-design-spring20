import java.util.Scanner;

public class SE_GCD {
        public static void main(String[] args){
            int n1 = 0 , n2 = 0;

            Scanner input = new Scanner(System.in);
            System.out.printf("Enter the first integer: ");
            n1 = input.nextInt();
            System.out.printf("Enter the second integer: ");
            n2 = input.nextInt();

            System.out.println("The GCD of ("+ n1 +","+n2 +") is "+findGCD(n1,n2));
            input.close();
        }
        public static int findGCD(int n1,int n2){
            int gcd = 1;

            for(int i = 1 ; i <= n1 && i <= n2;i++){
                if(n1 % i == 0 && n2 % i ==0){
                    gcd = i;
                }
            }
            return gcd;
        }
}
