import javax.swing.JOptionPane;
import java.util.Random;
public class Assignment3_A{
   public static void main(String [] args){
     Random r = new Random();
     int a = Integer.parseInt(JOptionPane.showInputDialog("��J�@�Ӿ�ơG "));
     for(int i = 1; i <=a; i++){
        for(int j = 1; j <= a; j++){
          System.out.print(1+r.nextInt(a));
        }
        System.out.println();
     }
   }
}