public class Ticket {
    private String name;
    private String date;
    private int price = 10;

    public Ticket(String date, String name){
        setName(name);
        setDate(date);
    }
    public Ticket(String date, int price ){
        setPrice(price);
        setDate(date);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public String toString(){
        return date + (getPrice() != 10 ? " 售出一張票。 票價: " + getPrice() : "送出一張票。 貴賓: " + getName()); 
    }
}
