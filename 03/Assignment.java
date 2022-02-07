import javax.swing.JOptionPane;
import java.util.Random;

public class Assignment 
{
    public static void main(String [] args)
    {
        int a;
        Random r = new Random();
        String input = JOptionPane.showInputDialog(null,"輸入一個參數：","輸入",3);
        a = Integer.parseInt(input);

        for(int i = 0 ; i < a ;i++)
        {
            for(int j = 0; j < a ; j++)
            {
                int x = r.nextInt(a)+1;
                System.out.printf("%d",x);
            }
            System.out.printf("\n");
        }

    }
    
}
