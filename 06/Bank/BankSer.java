package Bank;

import java.util.*;

public class BankSer {
    private String Name;
    private String AccountNum;
    private double Deposit;
    private double Withdraw;

    private int id = 0;
    private ArrayList<ArrayList<String>> userList = new ArrayList<ArrayList<String>>();

    public void Registration(String name,String accountNum, String deposit){
        userList.add(new ArrayList<String> (3));
        setName(name);
        setAccontNum(accountNum);
        setDeposit_First(deposit);
        id++;
    }
    public void Operation(int id){
        getName(id);
        getAccountNum(id);
        getBalance(id);
    }

    public void setName(String name){
        Name = name;
        userList.get(id).add(Name);
    }
    public void setAccontNum(String accountNum){
        AccountNum = accountNum;
        userList.get(id).add(AccountNum);
    }
    public void setDeposit_First(String deposit){
        userList.get(id).add(deposit);
    }
    public void setDeposit(String deposit,int id){
        Deposit = Double.parseDouble(deposit);
        userList.get(id).set(2,Double.toString(Double.parseDouble(userList.get(id).get(2)) + Deposit));
    }
    public void setWithdraw(String withdraw, int id){
        Withdraw = Double.parseDouble(withdraw);
        userList.get(id).set(2,Double.toString(Double.parseDouble(userList.get(id).get(2)) - Withdraw));
    }
    public String getName(int id){
        return userList.get(id).get(0);
    } 
    public String getAccountNum(int id){
        return userList.get(id).get(1);
    }
    public int getId(){
        return id;
    }
    public String getBalance(int id){
        return userList.get(id).get(2);
    }
}
