import java.util.Random;
import javax.swing.JOptionPane;

public class EXE5_2 {
    public static void main(String[] args){
        String[] students = {"1","2","3","4","5"};
        Random randomNum = new Random();
        int input = JOptionPane.showConfirmDialog(null,"Start to roll call");
        //0 = yes ,1 = no , 2 = cancel
        while(input == 0){
            int n = randomNum.nextInt(students.length);
            input = JOptionPane.showConfirmDialog(null,students[n]+" got roll call\nKeep roll call?");
        }
    }
    
}
