import javax.swing.JOptionPane;
import java.util.Random;
public class Example5_2_total{  //guess
   public static void main(String args[]){
     int input = 0;
     while (input !=-1){ 
       input = Integer.parseInt(JOptionPane.showInputDialog("請選擇遊戲 (1)猜數字 (2)小樂透 或-1離開程式: "));  
       
       switch (input){
          case 1:
             game1();
             break;
          case 2:
             game2();
             break;
        } //end switch
      } //end while
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

//以下是本次作業要寫的程式內容

    public static void game2(){

      Random r = new Random();
      int a=0,b=0, e=0, guess1=0, guess2=0;
      String output = "";
 
      guess1 = Integer.parseInt(JOptionPane.showInputDialog("請押第一個數字(1~10 含1或10："));
      guess2 = Integer.parseInt(JOptionPane.showInputDialog("請押第二個不同的數字(1~10 含1或10)："));

      a = 1 + r.nextInt(10);
      do{ b = 1 + r.nextInt(10); } while(a==b);

   
      if(guess1==a || guess1==b){ e+=1;}
      if(guess2==a || guess2==b){ e+=1;}

      if (e ==2){output = "恭喜中頭彩！";}
      else if (e ==1){output = "恭喜中普獎！";} 
      else {output = "銘謝惠顧！";}
  
      JOptionPane.showMessageDialog(null, "中獎號碼："+ a + " " + b + "\n你的選號：" + guess1 +  " " + guess2 + "\n" + output);
  }
}
