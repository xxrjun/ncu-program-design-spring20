package Assignment9;
public class Graduate extends Student{
    private int credits = 0;
    public Graduate(String name, String major, String advisor){
        super(name, major, advisor);
    }
    
    public int getCredits(){
        return credits;
    }
    public void addCredits(int credits){ 
        this.credits = credits;
    }
    public int tuition(){
        return  1500*getCredits();
    }
}