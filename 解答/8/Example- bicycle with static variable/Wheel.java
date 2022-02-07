public class Wheel {
  private String ID;
  private double cost;
  private int size;

  public Wheel(String ID, int size, double cost){   
    setID(ID);  
    setCost(cost);  
    setSize(size);
  }
  
  public void setID(String ID){ this.ID = ID;}
  public String getID(){ return ID;}
  
  public void setCost(double cost){ this.cost = cost;}
  public double getCost(){ return cost;}

  public void setSize(int size){ this.size = size;}
  public int getSize(){ return size;}

}
