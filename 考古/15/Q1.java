import javax.swing.JOptionPane;
import java.util.Random;

public class Q1{
    public static void main(String[] args){
        Random r = new Random();
        int check = 0;
        int randomNum = 0;
        String computer[] = {"�ŤM","���Y","��"};
        String me[] = {"�ŤM","���Y","��"};
        do{
            int input = JOptionPane.showOptionDialog(null,"�y�ŤM-���Y-���z�C�� - �п��: ","Exam2",0,3,null,me,null);
            randomNum = r.nextInt(3);
            if(input == randomNum){
                int action = JOptionPane.showConfirmDialog(null,"���a: "+ me[input] +"�q��:" + computer[randomNum] +"\n����\n�~��C��?");
                check = action;
            }
            else if(input == 0 && randomNum == 1){
                int action = JOptionPane.showConfirmDialog(null,"���a: "+ me[input] +"�q��:" + computer[randomNum] +"\n�q�����\n�~��C��?"); 
                check = action;           
            }
            else if(input == 0 && randomNum == 2){
                int action = JOptionPane.showConfirmDialog(null,"���a: "+ me[input] +"�q��:" + computer[randomNum] +"\n���a���\n�~��C��?");
                check = action;
            }
            else if(input == 1 && randomNum == 0){
                int action = JOptionPane.showConfirmDialog(null,"���a: "+ me[input] +"�q��:" + computer[randomNum] +"\n���a���\n�~��C��?");
                check = action;
            }
            else if(input == 1 && randomNum == 2){
                int action = JOptionPane.showConfirmDialog(null,"���a: "+ me[input] +"�q��:" + computer[randomNum] +"\n�q�����\n�~��C��?");
                check = action;
            }
	    else if(input == 2 && randomNum == 1){
		int action = JOptionPane.showConfirmDialog(null,"���a: "+ me[input] +"�q��:" + computer[randomNum] +"\n���a���\n�~��C��?");
                check = action;
	    }
	    else if(input == 2 && randomNum == 0){
		int action = JOptionPane.showConfirmDialog(null,"���a: "+ me[input] +"�q��:" + computer[randomNum] +"\n�q�����\n�~��C��?");
                check = action;
	    }
            
        }while(check != 1);
        

    } 
}