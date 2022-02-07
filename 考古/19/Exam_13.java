import javax.swing.JOptionPane;
import java.util.Random;

public class Exam_13 {
    public static void main(String [] args){
        int n = 0; 
        int m = 0;
        Random r = new Random();
        String input = JOptionPane.showInputDialog(null,"輸入一個整數","輸入",3);
        n = Integer.parseInt(input);

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                m = r.nextInt(n) + 1;
                System.out.print(m);
            }
            System.out.printf("\n");
        }
    }
}
