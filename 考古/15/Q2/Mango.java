package Q2;

public class Mango {
    private double price;
    private int quantity;

    public Mango(double p, int q){
        setPrice(p);
        setQuantity(q);
    }
    
    public  void setPrice(double p){
        price = p;
    }
    public double getPrice(){
        return price * quantity;
    }
    public  void setQuantity(int q){
        quantity += q;
    }
    public double getQuantity(){
        return quantity;
    }
    public double Selling(int q){
        quantity += q;
        return price * quantity;
    }
    public String toString(){
        return "今日賣出 " + getQuantity() + " 斤芒果，收入 " + price * quantity +" 元";
    }
}
