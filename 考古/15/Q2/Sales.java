package Q2;
import javax.swing.JOptionPane;

public class Sales {
    public static void main(String[] args){
        Cherry che = new Cherry(120, 0, 10);
        Orange ora = new Orange(20, 0);
        Mango man = new Mango(50,0);
        String fruits[] = {"櫻桃","柳丁","芒果","結帳完成"};
         
        int action = 0;
        do{
            int ch = 0;
            int or = 0;
            int ma = 0;
            int input = JOptionPane.showOptionDialog(null,"購買何種水果?","Q2",0,3,null,fruits,null);
            while(input != 3){
                switch(input){
                    case 0:
                        String input1 = JOptionPane.showInputDialog(null,"要買幾斤櫻桃?");
                        ch += Integer.parseInt(input1);
                        break;
                    case 1:
                        String input2 = JOptionPane.showInputDialog(null,"要買幾斤柳丁?");
                        or += Integer.parseInt(input2);
                        break;
                    case 2:
                        String input3 = JOptionPane.showInputDialog(null,"要買幾斤芒果?");
                        ma += Integer.parseInt(input3);
                        break;
                    case 3:
                        break;
                }
                input = JOptionPane.showOptionDialog(null,"購買何種水果?","Q2",0,3,null,fruits,null);
            }          
            action = JOptionPane.showConfirmDialog(null,"一共是 " + (che.Selling(ch) +ora.Selling(or) + man.Selling(ma)) +" 元。下一位結帳?");
        }while(action == 0);
        JOptionPane.showMessageDialog(null,"今日銷售如下:\n" + che +"\n" + ora + "\n" + man);
        
    }
}
