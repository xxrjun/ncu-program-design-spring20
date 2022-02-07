import java.util.Arrays;

public class Try{
    public static void main(String[] args){
        char [] test = {'b','c'};
        int [] test2 = {2,3};
        Arrays.sort(test);
        Arrays.sort(test2);
        int n1 = Arrays.binarySearch(test,'a') + 1;
        int n2 = Arrays.binarySearch(test2,1);
        System.out.println(n1);
        System.out.println(n2);
      
    
    }
}