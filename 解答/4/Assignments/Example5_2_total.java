import javax.swing.JOptionPane;
import java.util.Random;
public class Example5_2_total{  //guess
   public static void main(String args[]){
     int input = 0;
     while (input !=-1){ 
       input = Integer.parseInt(JOptionPane.showInputDialog("�п�ܹC�� (1)�q�Ʀr (2)�p�ֳz ��-1���}�{��: "));  
       
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

//�H�U�O�����@�~�n�g���{�����e

    public static void game2(){

      Random r = new Random();
      int a=0,b=0, e=0, guess1=0, guess2=0;
      String output = "";
 
      guess1 = Integer.parseInt(JOptionPane.showInputDialog("�Щ�Ĥ@�ӼƦr(1~10 �t1��10�G"));
      guess2 = Integer.parseInt(JOptionPane.showInputDialog("�Щ�ĤG�Ӥ��P���Ʀr(1~10 �t1��10)�G"));

      a = 1 + r.nextInt(10);
      do{ b = 1 + r.nextInt(10); } while(a==b);

   
      if(guess1==a || guess1==b){ e+=1;}
      if(guess2==a || guess2==b){ e+=1;}

      if (e ==2){output = "���ߤ��Y�m�I";}
      else if (e ==1){output = "���ߤ������I";} 
      else {output = "���´f�U�I";}
  
      JOptionPane.showMessageDialog(null, "�������X�G"+ a + " " + b + "\n�A���︹�G" + guess1 +  " " + guess2 + "\n" + output);
  }
}
