//109403019
public class Member {
    private String Name;
    private int Fee;

    public Member(String Name, int Fee){
        setName(Name);
        setFee(Fee);
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setFee(int Fee){
        this.Fee = Fee;
    }
    public String getName(){
        return Name;
    }
    public int getFee(){
        return Fee;
    }
    public String toString(){
        return getName() +" Membership Fee: " +getFee();
    } 
}
