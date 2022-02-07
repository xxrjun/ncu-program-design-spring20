import javax.swing.JOptionPane;
import java.util.Random;

public class test {
    public static void main(String[] args){
        String []name = {"Jack","Hoan","Stanly","Paul","Nancy"};
        Random r = new Random();
        int response = JOptionPane.showConfirmDialog(null,"開始點名");
        // 0=yes, 1=no, 2=cancel
        
        while(response == 0){
            int n = r.nextInt(5);
            response = JOptionPane.showConfirmDialog(null,name[n]+ " got roll call\nKeep roll call?");
        }
    }
}
