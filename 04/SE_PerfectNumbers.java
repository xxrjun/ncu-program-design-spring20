public class SE_PerfectNumbers {
    public static void main(String[] args){
        SE_PerfectNumbers run = new SE_PerfectNumbers();

        run.findPerfectNumbers();

    }

    public void findPerfectNumbers(){
        int Num = 1,sum = 0;
        int factor = 1;

        for(int i  = 0; i < 1000  ;i++){
            for(int y = 1 ; y < Num; y++){
                if(Num % factor == 0 && factor != Num){
                   sum += factor;
                }
                factor ++;
            }
            if(sum == Num){
                System.out.println("Perfect Number :" + Num +" it's factors: " + sum);
            }

            sum = 0;//reset sum
            factor = 1;//reset factor 
            Num ++;
        }
    }
}
