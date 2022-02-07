public class Couple {
    private Man m;
    private Woman w;

    public Couple(Man m,Woman w){
        this.m = m;
        this.w = w;
    }
    public Man getMan(){
        return m;
    }
    public Woman getWoman(){
        return w;
    }
    public void changeMan(Man m){
        this.m = m;
    }
    public String toString(){
        return m +" and "+ w +" are now in Love";
    }
}
