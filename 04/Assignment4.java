import java.util.Random;
import javax.swing.JOptionPane;

public class Assignment4{
    public static  void main(String[] args){
        Assignment4 play = new Assignment4();
        int  n = 0 ;

        do{
            String input = JOptionPane.showInputDialog(null,"請選擇遊戲(1)猜數字(2)小樂透,-1離開程式","Input",3);
            n = Integer.parseInt(input);

            if(n == 1){
                play.game1();
            }
            else if(n ==2){
                play.game2();
            }
            else{
                String inputtwice = JOptionPane.showInputDialog(null,"請選擇遊戲(1)猜數字(2)小樂透,-1離開程式","Input",3);
                n = Integer.parseInt(inputtwice);
            }
        }while(n != -1);
        
      
    }
    public void game1(){
    	String input="";
    	int guess = 0, answer=0;
    	Random r = new Random();
    	answer =1+r.nextInt(42);
    	input= JOptionPane.showInputDialog("產生數字1~42! \n請你猜一猜? "); guess=Integer.parseInt(input);
    	do{
    	if (guess < answer){
    	guess = Integer.parseInt(JOptionPane.showInputDialog(null, "不是 " +
    	guess + ", 再大一點", ""+answer, 1)); } else if (guess > answer){
    	guess = Integer.parseInt(JOptionPane.showInputDialog(null, "不是 " + guess + ", 再小一點", ""+answer, 1)); }
    	} while (guess != answer);
    	JOptionPane.showMessageDialog(null, "猜對了!", "答案是" + answer, 2);
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

        String inputn1 = JOptionPane.showInputDialog(null,"請壓第一個數字(1~10含1或10)：","Input",3); 
        n1 = Integer.parseInt(inputn1);
        while(n1 < 0 || n1 > 10){
            String inputn1Again= JOptionPane.showInputDialog(null,"請壓第一個數字(1~10含1或10)：","Input",3); 
            n1 = Integer.parseInt(inputn1Again);
        }
        String inputn2 = JOptionPane.showInputDialog(null,"請壓第二個不同的數字(1~10含1或10)：","Input",3); 
        n2 = Integer.parseInt(inputn2);
        while(n2 < 0 || n2 > 10){
            String inputn2Again= JOptionPane.showInputDialog(null,"請壓第一個數字(1~10含1或10)：","Input",3); 
            n2 = Integer.parseInt(inputn2Again);
        }
        while(n2 == n1){
            String inputn3 = JOptionPane.showInputDialog(null,"請壓第二個\'不同\'的數字(1~10含1或10)：","Input",3); 
            n2 = Integer.parseInt(inputn3);
        }
     
        JOptionPane.showMessageDialog(null,"中獎號碼：" + x1 +" "+ x2 +"\n你選得號：" + n1 +" "+ n2 +"\n銘謝惠顧！");
    }
}