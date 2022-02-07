import javax.swing.JOptionPane;
import java.util.Random;
public class Game{ 
   public static void main(String args[]){
         String input;
         input = JOptionPane.showInputDialog("請選擇遊戲 (1)猜數字 (2)小樂透");
         switch (Integer.parseInt(input)){
             case 1:
                 game1();
                 break;
             case 2:
                 game2();
                 break;
          } //end switch
     System.exit(1);
   }//end main 
	
public static void game1(){
       String input="";
       int guess = 0, answer=0;
       Random r = new Random();
       answer =1+r.nextInt(42);
       input= JOptionPane.showInputDialog("產生數字1~42! \n請你猜一猜? ");
       guess=Integer.parseInt(input);	
       do{
         if (guess < answer){		
            guess = Integer.parseInt(JOptionPane.showInputDialog(null, "不是 " + 
                guess + ", 再大一點", ""+answer, 1));  }  
          else if (guess > answer){
            guess = Integer.parseInt(JOptionPane.showInputDialog(null, "不是 " + 
                guess + ", 再小一點", ""+answer, 1));   }	  	
       } while (guess != answer);
       JOptionPane.showMessageDialog(null, "猜對了！", "答案是" + answer, 2);    
}

public static void game2(){}  //暫無內容
}
