import java.util.Scanner;

public class SE_Distance {
    public static void main(String[] args){
        double x1 =0 ,y1 = 0;
        double x2 =0 ,y2 = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.printf( "%s\n   %s\n   %s\n", 
         "Type the end-of-file indicator to terminate", 
         "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
         "On Windows type <Ctrl> z then press Enter" );

        System.out.println("Or input A(x1,y1): ");
        System.out.printf("x1: ");
        
        while(input.hasNext()){
            x1 = input.nextDouble();
            System.out.printf("y1: ");
            y1 = input.nextDouble();
            
            System.out.println("Input B(x2,y2): ");
            System.out.printf("x2: ");
            x2 = input.nextDouble();
            System.out.printf("y2: ");
            y2 = input.nextDouble();
        }
        
        System.out.println("The distance between A and B is "+DBP(x1,y1,x2,y2));

        input.close();
    }

    public static double DBP(double x1,double y1,double x2,double y2){
        double result = 0;
        result = Math.pow((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2),0.5);

        return result;
    }

}


