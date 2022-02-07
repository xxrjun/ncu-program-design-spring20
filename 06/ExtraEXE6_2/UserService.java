package ExtraEXE6_2;

import javax.swing.JOptionPane;

public class UserService {
    public static void main(String[] args){
        int choice = 0; 
        int n = 1;
        int id = 0;
        BankService bankservice = new BankService();
        
        do{
            choice = 0;
            String input = JOptionPane.showInputDialog(null,"Welcome to Java Bank! Select transactions:\n"+
                                                            "(1) Create an account\n" +
                                                            "(2) Operate an existing account\n" +
                                                            "(3) Exit application");
            choice = Integer.parseInt(input);
            switch (choice){
                case 1:
                    String inputName = JOptionPane.showInputDialog(null,"Enter customer name: ");
                    String inputAssignAccountNum = JOptionPane.showInputDialog(null,"Assign account number: ");
                    for(int i = 0; i < bankservice.id ; i++){
                        if(inputAssignAccountNum.compareTo(bankservice.getAccountNumber(i)) == 0){
                            JOptionPane.showMessageDialog(null, "Has assigned!");
                            inputAssignAccountNum = JOptionPane.showInputDialog(null,"Assign account number: ");
                        }
                    }
                    String inputDepositF = JOptionPane.showInputDialog(null, "Enter amount of deposit: ");
                    
                    bankservice.Registration(inputName, inputAssignAccountNum, inputDepositF);
                    JOptionPane.showMessageDialog(null,"Register success!\nAccount Num: "+ inputAssignAccountNum );
                    break;
                case 2:     
                    String search = JOptionPane.showInputDialog(null,"Enter account number");
                    id = 0;
                    for(int i = 0 ;i < bankservice.id ;i++){
                        n = search.compareTo(bankservice.getAccountNumber(i));
                        id = i;
                        if(n == 0){
                            break;    
                        }
                    }
                    if(n == 0){
                        int action = 0 ;
                        JOptionPane.showMessageDialog(null,"Find Account!");
                        String inputAction = JOptionPane.showInputDialog("Hello "+bankservice.getName(id)+" Your Balance is: " +bankservice.getBalance(id) +
                                                                                "\n 1.Deposit \n 2.Withdraw \n 3.Show balance \n 4.Cancel");
                        action = Integer.parseInt(inputAction);                                                       
                        if(action == 1){
                            String inputDeposit = JOptionPane.showInputDialog(null, "Enter amount of deposit: ");
                            bankservice.setDeposit(inputDeposit, id);
                            JOptionPane.showMessageDialog(null,"Deposit" + inputDeposit +" success!\nAccount Num: "+ bankservice.getAccountNumber(id) +"\nBalance: " + bankservice.getBalance(id));
                        }
                        else if (action == 2){                                             
                            String inputWithdraw = JOptionPane.showInputDialog(null, "Enter amount of withdraw: ");
                            if(bankservice.setWithdraw(inputWithdraw, id) == 0){
                                JOptionPane.showMessageDialog(null,"Insufficient Balance!");
                                break;
                            }
                            else if(bankservice.setWithdraw(inputWithdraw, id) == 1){
                                JOptionPane.showMessageDialog(null,"Withdraw " + inputWithdraw +" success!\nAccount Num: "+ bankservice.getAccountNumber(id) +"\nBalance: " + bankservice.getBalance(id));
                            }
                        }   
                        else if (action == 3){
                            JOptionPane.showMessageDialog(null,"Your Balance is: " +bankservice.getBalance(id)); 
                        }       
                        else if(action == 4){
                            JOptionPane.showMessageDialog(null,"See you next time"); 
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Wrong Enter");
                        }
                    }                                
                    else if(n != 0){
                        JOptionPane.showMessageDialog(null,"No found!");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Thanks for user, see you next time");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Wrong Enter!");
                    break;
            }
        }while(choice != 3);
        
    }
}
