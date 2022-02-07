package Assignment9;

public class UnderGraduate extends Student{
    private boolean honor = false;
    private int credits = 0;
    public UnderGraduate(String name, String major){ 
        super(name, major);
    }

    public void setHonor(boolean honor){
        this.honor = honor;
    }
    public int getCredits(){return credits;}


    public void addCredits(int credits){ 
        this.credits += credits;
    }
    public int tuition(){
        return (honor == true) ? 500*getCredits() : 1000*getCredits();
    }
}
