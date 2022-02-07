package ExtraEXE6_2;

import java.util.ArrayList;

public class BankService{
    public int id = 0;//amount of user

    private double Deposit;
    private double Withdraw;
    private ArrayList< ArrayList<String> > userList = new ArrayList< ArrayList<String> >();
    //first dimention for id; second 0 for name ,1 for accountNum ,2 for balance
    
    public void Registration(String name ,String number,String deposit){
        userList.add(new ArrayList<String>(3));
        setName(name);
        setAccountNumber(number);
        setDepositF(deposit);
        ++id;
    }

    public void setName(String name){
        userList.get(id).add(name);
    }
    public String getName(int id){
        return userList.get(id).get(0);
    }

    public void setAccountNumber(String number){
        userList.get(id).add(number);
    }
    public String getAccountNumber(int id){
        return userList.get(id).get(1);
    }

    public void setDepositF(String deposit){
        Deposit = Double.parseDouble(deposit);
        userList.get(id).add(deposit);
    }
    public void setDeposit(String deposit, int id){
        Deposit = Double.parseDouble(deposit);
        userList.get(id).set(2,Double.toString(Double.parseDouble(userList.get(id).get(2)) + Deposit));
    }

    public int setWithdraw(String withdraw,int id){
        Withdraw = Double.parseDouble(withdraw);
        if(Double.parseDouble(userList.get(id).get(2)) - Withdraw < 0){
            return 0;
        }
        else{
            userList.get(id).set(2,Double.toString(Double.parseDouble(userList.get(id).get(2)) - Withdraw));
            return 1;
        }   
    }
    public String getBalance(int id){
    
        return userList.get(id).get(2);
    }
    public  void getUserList(){
        for(int i = 0 ; i < id ; i++){
            System.out.println(userList.get(i).get(1));
        }    
    }

}
