import javax.swing.JOptionPane;
import java.util.Random;
public class Game{ 
   public static void main(String args[]){
         String input;
         input = JOptionPane.showInputDialog("�п�ܹC�� (1)�q�Ʀr (2)�p�ֳz");
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
       input= JOptionPane.showInputDialog("���ͼƦr1~42! \n�ЧA�q�@�q? ");
       guess=Integer.parseInt(input);	
       do{
         if (guess < answer){		
            guess = Integer.parseInt(JOptionPane.showInputDialog(null, "���O " + 
                guess + ", �A�j�@�I", ""+answer, 1));  }  
          else if (guess > answer){
            guess = Integer.parseInt(JOptionPane.showInputDialog(null, "���O " + 
                guess + ", �A�p�@�I", ""+answer, 1));   }	  	
       } while (guess != answer);
       JOptionPane.showMessageDialog(null, "�q��F�I", "���׬O" + answer, 2);    
}

public static void game2(){}  //�ȵL���e
}
