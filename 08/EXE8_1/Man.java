public class Man{
    private String Name;

    public Man(String Name){
        setName(Name);
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public String toString(){
        return Name;
    }
}