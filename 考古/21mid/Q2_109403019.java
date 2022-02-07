import java.util.Random;
import javax.swing.JOptionPane;

public class Q2_109403019 {
    public static  void main(String[] args){
        int n = 0;//for user input
        int x = 0;//for random num
        int count = 0;
        int money = 0;

        Random r = new Random();
        x = r.nextInt(9) + 1;
        System.out.println(x);
        String input = JOptionPane.showInputDialog(null,"Guess Number(1~9)!\nFirst Time Got Bingo: 500\nSecond Time got Bingo: 100\nInput","Input",3);
        n = Integer.parseInt(input);
        count++;

        do{
            if(n > x){
                String inputB = JOptionPane.showInputDialog(null,"Is not" + n +".Guess smaller one.");
                n = Integer.parseInt(inputB);
                count++;
            }
            else if(n < x){
                String inputS = JOptionPane.showInputDialog(null,"Is not" + n +".Guess bigger one.");
                n = Integer.parseInt(inputS);
                count++;
            }
            else if(n > 9 || n < 0){
                JOptionPane.showInputDialog(null,"Input 1~9");
                n = Integer.parseInt(input);
            }
        }while(n != x);

        do{
            if(count == 1){
                money += 500;
                x = r.nextInt(9) + 1;
                String inputContinue = JOptionPane.showInputDialog(null,"Bingo! Getting 500 dollars\nContinue: Press 0\nExit: Press -1");
                n = Integer.parseInt(inputContinue);
                if(n == 0){ 
                    count = 0;
                    String input500 = JOptionPane.showInputDialog(null,"Guess Number(1~9)!\nFirst Time Got Bingo: 500\nSecond Time got Bingo: 100\nInput","Input",3);
                    n = Integer.parseInt(input500);
                    count++;
                    do{
                        if(n > x){
                            String inputB = JOptionPane.showInputDialog(null,"Is not" + n +".Guess smaller one.");
                            n = Integer.parseInt(inputB);
                            count++;
                        }
                        if(n < x){
                            String inputS = JOptionPane.showInputDialog(null,"Is not" + n +".Guess bigger one.");
                            n = Integer.parseInt(inputS);
                            count++;
                        }
                        else if(n > 9 || n < 0){
                            JOptionPane.showInputDialog(null,"Input 1~9");
                            n = Integer.parseInt(input);
                        }
                    }while(n != x);
                }
                else if(n == -1){
                    break;
                }
            }
            else if(count ==2){
                money += 100;
                x = r.nextInt(9) + 1;
                String inputContinue = JOptionPane.showInputDialog(null,"Bingo! Getting 100 dollars\nContinue: Press 0\nExit: Press -1");
                n = Integer.parseInt(inputContinue);
                if(n == 0){ 
                    count = 0;
                    String input500 = JOptionPane.showInputDialog(null,"Guess Number(1~9)!\nFirst Time Got Bingo: 500\nSecond Time got Bingo: 100\nInput","Input",3);
                    n = Integer.parseInt(input500);
                    count++;
                    do{
                        if(n > x){
                            String inputB = JOptionPane.showInputDialog(null,"Is not" + n +".Guess smaller one.");
                            n = Integer.parseInt(inputB);
                            count++;
                        }
                        if(n < x){
                            String inputS = JOptionPane.showInputDialog(null,"Is not" + n +".Guess bigger one.");
                            n = Integer.parseInt(inputS);
                            count++;
                        }
                        else if(n > 9 || n < 0){
                            JOptionPane.showInputDialog(null,"Input 1~9");
                            n = Integer.parseInt(input);
                        }
                    }while(n != x);
                }
                else if(n == -1){
                    break;
                }
            }
            else{
                x = r.nextInt(9) + 1;
                String inputContinue = JOptionPane.showInputDialog(null,"Finally got Bingo\nContinue: Press 0\nExit: Press -1");
                n = Integer.parseInt(inputContinue);
                if(n == 0){ 
                    count = 0;
                    String input0 = JOptionPane.showInputDialog(null,"Guess Number(1~9)!\nFirst Time Got Bingo: 500\nSecond Time got Bingo: 100\nInput","Input",3);
                    n = Integer.parseInt(input0);
                    count++;
                    do{
                        if(n > x){
                            String inputB = JOptionPane.showInputDialog(null,"Is not" + n +".Guess smaller one.");
                            n = Integer.parseInt(inputB);
                            count++;
                        }
                        if(n < x){
                            String inputS = JOptionPane.showInputDialog(null,"Is not" + n +".Guess bigger one.");
                            n = Integer.parseInt(inputS);
                            count++;
                        }
                        else if(n > 9 || n < 0){
                            JOptionPane.showInputDialog(null,"Input 1~9");
                            n = Integer.parseInt(input);
                        }
                    }while(n != x);
                }
                else if(n == -1){
                    break;
                }
            }
        }while(n != -1);
        JOptionPane.showMessageDialog(null,"Congradulation for you getting" + money+".");
    }
}
