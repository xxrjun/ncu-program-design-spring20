import java.util.Random;
import javax.swing.JOptionPane;

public class Assignment4{
    public static  void main(String[] args){
        Assignment4 play = new Assignment4();
        int  n = 0 ;

        do{
            String input = JOptionPane.showInputDialog(null,"�п�ܹC��(1)�q�Ʀr(2)�p�ֳz,-1���}�{��","Input",3);
            n = Integer.parseInt(input);

            if(n == 1){
                play.game1();
            }
            else if(n ==2){
                play.game2();
            }
            else{
                String inputtwice = JOptionPane.showInputDialog(null,"�п�ܹC��(1)�q�Ʀr(2)�p�ֳz,-1���}�{��","Input",3);
                n = Integer.parseInt(inputtwice);
            }
        }while(n != -1);
        
      
    }
    public void game1(){
    	String input="";
    	int guess = 0, answer=0;
    	Random r = new Random();
    	answer =1+r.nextInt(42);
    	input= JOptionPane.showInputDialog("���ͼƦr1~42! \n�ЧA�q�@�q? "); guess=Integer.parseInt(input);
    	do{
    	if (guess < answer){
    	guess = Integer.parseInt(JOptionPane.showInputDialog(null, "���O " +
    	guess + ", �A�j�@�I", ""+answer, 1)); } else if (guess > answer){
    	guess = Integer.parseInt(JOptionPane.showInputDialog(null, "���O " + guess + ", �A�p�@�I", ""+answer, 1)); }
    	} while (guess != answer);
    	JOptionPane.showMessageDialog(null, "�q��F!", "���׬O" + answer, 2);
    }
    public void game2(){
        int x1 = 0 ,x2 = 0;//random numbers
        int n1 =0 ,n2 = 0;//user input number
        Random r = new Random();

        x1 = r.nextInt(10) +1;
        x2 = r.nextInt(10) +1;

        while(x2 == x1) {
            x2 = r.nextInt(10) +1;
        }

        String inputn1 = JOptionPane.showInputDialog(null,"�����Ĥ@�ӼƦr(1~10�t1��10)�G","Input",3); 
        n1 = Integer.parseInt(inputn1);
        while(n1 < 0 || n1 > 10){
            String inputn1Again= JOptionPane.showInputDialog(null,"�����Ĥ@�ӼƦr(1~10�t1��10)�G","Input",3); 
            n1 = Integer.parseInt(inputn1Again);
        }
        String inputn2 = JOptionPane.showInputDialog(null,"�����ĤG�Ӥ��P���Ʀr(1~10�t1��10)�G","Input",3); 
        n2 = Integer.parseInt(inputn2);
        while(n2 < 0 || n2 > 10){
            String inputn2Again= JOptionPane.showInputDialog(null,"�����Ĥ@�ӼƦr(1~10�t1��10)�G","Input",3); 
            n2 = Integer.parseInt(inputn2Again);
        }
        while(n2 == n1){
            String inputn3 = JOptionPane.showInputDialog(null,"�����ĤG��\'���P\'���Ʀr(1~10�t1��10)�G","Input",3); 
            n2 = Integer.parseInt(inputn3);
        }
     
        JOptionPane.showMessageDialog(null,"�������X�G" + x1 +" "+ x2 +"\n�A��o���G" + n1 +" "+ n2 +"\n���´f�U�I");
    }
}