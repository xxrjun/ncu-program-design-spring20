package Q2;

public class Cherry {
    private double price;
    private int quantity;
    private double tax;

    public Cherry(double p, int q, double t){
        setPrice(p);
        setQuantity(q);
        setTax(t);
    }
    
    public  void setPrice(double p){
        price = p;
    }
    public double getPrice(){
        return price * quantity;
    }
    public  void setQuantity(int q){
        quantity = q;
    }
    public double getQuantity(){
        return quantity;
    }
    public  void setTax(double t){
        tax = (price *quantity *t)/100;
    }
    public double getTax(){
        return tax;
    }

    public double Selling(int q){
        quantity += q;
        return price * quantity + getTax();
    }
    public String toString(){
        return "今日賣出 " + getQuantity() + " 斤櫻桃，收入 " + price * quantity + getTax() +" 元";
    }
}
