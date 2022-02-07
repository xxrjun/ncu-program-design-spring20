package Bank;

import javax.swing.JOptionPane;

public class User {
    public static void main(String[] args){
        BankSer use = new BankSer();
        int n = 0 ;
      
        do{
            String input = JOptionPane.showInputDialog(null,"Welcome to Java Bank! Select transaction: \n" +
                                                            "(1) Create an account\n"+
                                                            "(2) Operate an existing account\n"+
                                                            "(3) Exit application");
            n = Integer.parseInt(input);

            switch(n){
                case 1:
                    String inputName = JOptionPane.showInputDialog(null,"Enter customer name:");
                    String inputAccountNum = JOptionPane.showInputDialog(null,"Assign Account Number:");
                    String inputDeposit_First = JOptionPane.showInputDialog(null,"Enter amount of deposit:");
                    use.Registration(inputName,inputAccountNum, inputDeposit_First);
                    break;
                case 2:
                    String search = JOptionPane.showInputDialog(null,"Enter account number:");
                    int find = 0;
                    int id  = 0;
                    for(int i = 0 ;i < use.getId() ; i++){
                        find = search.compareTo(use.getAccountNum(i));
                        if(find == 0){
                            id = i;
                            break;
                        }
                    }
                    if(find == 0){
                        JOptionPane.showMessageDialog(null, "Customer found!");
                        String action = JOptionPane.showInputDialog(null,"Hello "+ use.getName(id) +" Your current balance is : "+ use.getBalance(id)+
                                                                    "\nSelect transactions:\n"+                                                              
                                                                    "(1) Deposit\n" +
                                                                    "(2) Withraw\n" +
                                                                    "(3) Show Balance\n" +
                                                                    "(4) Cancel");
                        switch(action){
                            case "1":
                                String inputDeposit = JOptionPane.showInputDialog(null, "Amount of deposit");
                                use.setDeposit(inputDeposit, id);
                                break;
                            case "2":
                                String inputWithdraw = JOptionPane.showInputDialog(null, "Amount of deposit");
                                use.setWithdraw(inputWithdraw, id);
                                break;
                            case "3":
                                JOptionPane.showMessageDialog(null, "Hi " +use.getName(id) +". Your current balance is :" + use.getBalance(id));
                                break;
                            case "4":
                                JOptionPane.showMessageDialog(null, "Thank for use!");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Wrong Enter!");
                                break;
                        }                                             
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "No found!");
                        break;
                    }
                     
                    break;
                default:
            }
        }while(n != 3);
    }    
}
