public class Account{
  private String name;
  private String AcctNo;
  private double balance;

  public void setName(String name){ this.name= name; }
  public String getName(){ return name; }

  public void setAcctNo(String AcctNo){ this.AcctNo= AcctNo; }
  public String getAcctNo(){ return AcctNo; }  

  public void setBalance(double balance){ this.balance= balance; }
  public double getBalance(){ return balance; }

  public void deposit(double money){  
    if (money > 0){ balance +=money; }
  }
  public void withdraw(double money){  
    if ((money < balance) && (money >0)){ balance -=money; }
  }
}
 
