import java.util.Scanner;

public class re_SE_PerfectNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int range = 2;

        System.out.printf("\n%s \n %s \n %s\n",
                "If want to end this program",
                "On MAC/LINUX type <Ctrl + d> then press Enter",
                "On Windos type <Ctrl + z> then press Enter");

        System.out.printf("What is the range you want to try from 2: ");
        
        while(input.hasNext()){
            range = input.nextInt();
            
            for(int i = 2 ; i <= range ; i++){
                String result = isPerfect(i);
                if(result != null){
                    System.out.printf("%d is a Perfect number! \n %10s Factors: %s\n",i," ",isPerfect(i));
                }
                else{
            
                }
            }
        }
        input.close();
    }

    public static String isPerfect(int value){
        int factorsSum = 1;
        String factors = "1 ";

        for(int temp = 2 ;temp <= value/2 ; temp++){
            if(value % temp == 0){
                factorsSum += temp;
                factors += temp + " ";
            }
        } 

        if(value == factorsSum){
            return factors;
        }
        else{
            return null;
        }  
    }
}
