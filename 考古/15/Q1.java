import javax.swing.JOptionPane;
import java.util.Random;

public class Q1{
    public static void main(String[] args){
        Random r = new Random();
        int check = 0;
        int randomNum = 0;
        String computer[] = {"剪刀","石頭","布"};
        String me[] = {"剪刀","石頭","布"};
        do{
            int input = JOptionPane.showOptionDialog(null,"『剪刀-石頭-布』遊戲 - 請選擇: ","Exam2",0,3,null,me,null);
            randomNum = r.nextInt(3);
            if(input == randomNum){
                int action = JOptionPane.showConfirmDialog(null,"玩家: "+ me[input] +"電腦:" + computer[randomNum] +"\n平手\n繼續遊戲?");
                check = action;
            }
            else if(input == 0 && randomNum == 1){
                int action = JOptionPane.showConfirmDialog(null,"玩家: "+ me[input] +"電腦:" + computer[randomNum] +"\n電腦獲勝\n繼續遊戲?"); 
                check = action;           
            }
            else if(input == 0 && randomNum == 2){
                int action = JOptionPane.showConfirmDialog(null,"玩家: "+ me[input] +"電腦:" + computer[randomNum] +"\n玩家獲勝\n繼續遊戲?");
                check = action;
            }
            else if(input == 1 && randomNum == 0){
                int action = JOptionPane.showConfirmDialog(null,"玩家: "+ me[input] +"電腦:" + computer[randomNum] +"\n玩家獲勝\n繼續遊戲?");
                check = action;
            }
            else if(input == 1 && randomNum == 2){
                int action = JOptionPane.showConfirmDialog(null,"玩家: "+ me[input] +"電腦:" + computer[randomNum] +"\n電腦獲勝\n繼續遊戲?");
                check = action;
            }
	    else if(input == 2 && randomNum == 1){
		int action = JOptionPane.showConfirmDialog(null,"玩家: "+ me[input] +"電腦:" + computer[randomNum] +"\n玩家獲勝\n繼續遊戲?");
                check = action;
	    }
	    else if(input == 2 && randomNum == 0){
		int action = JOptionPane.showConfirmDialog(null,"玩家: "+ me[input] +"電腦:" + computer[randomNum] +"\n電腦獲勝\n繼續遊戲?");
                check = action;
	    }
            
        }while(check != 1);
        

    } 
}