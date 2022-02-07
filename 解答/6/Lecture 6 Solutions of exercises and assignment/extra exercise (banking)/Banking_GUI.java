/*
  Note that this application may need some enhancement (for example, input vlidation, 
  insertion of new accunt with identical account number) to be more comprehensive. 
  However, due to your current capability I stop implementating the code as it is.
  Welcome to bring an enhanced version to me if you have any. 
  Extra credits will be given for encouraging you to do so! 

  Modualarization is the key to real Java applications, including this one. 
  In this application, functionality is modualarized in methods, for program 
  efficiency, reusability and ease of maintenance. Enjoy it! 
                                                                     --By Prof. Chen
*/

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Banking_GUI{
  static ArrayList<Account> accounts = new ArrayList<Account>();
  public static void main(String [] args){
     menu();
  }

  public static void menu(){  
       int select = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Java Bank! Select transactions: \n(1)Create an account \n(2)Operate an existing account \n(3)Exit application"));
       switch (select){
         case 1:      
            newAccount();
            break;
         case 2:
            operateAccount();
            break;
         case 3:
            System.exit(0);
            break;
       }
   }

   public static void newAccount(){
        String name  = JOptionPane.showInputDialog("Enter customer name:");
        String acctNO = JOptionPane.showInputDialog("Assign account number:");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of deposit:"));
        accounts.add(new Account(name, acctNO, balance));
        menu();
   }
   
   public static void operateAccount(){
        int a = -1;
        String acctNO = JOptionPane.showInputDialog("Enter account number:");
        for(int i = 0; i<accounts.size(); i++){
          if(accounts.get(i).getAcctNo().equals(acctNO)){ 
            JOptionPane.showMessageDialog(null, "Customer found!");
            a = i; 
            break;
          }
        }
        if(a != -1){ 
           int t = Integer.parseInt(JOptionPane.showInputDialog("Hello, " + accounts.get(a).getName() + " Your current balance is: " + accounts.get(a).getBalance() + "\nSelect transactions: \n(1)Deposit\n(2)Withdraw\n(3)Show balance\n(4)Cancel"));
           if (t == 1){ 
              double money = Double.parseDouble(JOptionPane.showInputDialog("Amount of deposit?"));
              accounts.get(a).deposit(money); 
              JOptionPane.showMessageDialog(null, "Done. " + accounts.get(a).getName() + ", your current balance is: " + accounts.get(a).getBalance()); 
              menu();
           } 
           else if(t ==2){ 
              double money = Double.parseDouble(JOptionPane.showInputDialog("Amount of withdraw?"));
              accounts.get(a).withdraw(money); 
              JOptionPane.showMessageDialog(null, "Done. " + accounts.get(a).getName() + ", your current balance is: " + accounts.get(a).getBalance()); 
              menu();
           }
           else if(t ==3){
              JOptionPane.showMessageDialog(null, "Hello " + accounts.get(a).getName() + " Your current balance is: " + accounts.get(a).getBalance()); 
              menu();   
           }
           else{ JOptionPane.showMessageDialog(null, "Thank you for doing business with Java Bank"); }
        }
        else{ 
           JOptionPane.showMessageDialog(null, "No such an account");
           menu();
        } 
    }
 }