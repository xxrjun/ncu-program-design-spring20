public class Frame{
  private String ID; 
  private String material;
  private double cost;

  public Frame(String ID, String m, double c){   
    setID(ID);  
    setCost(c);  
    setMaterial(m);
  }
  
  public void setCost(double cost){  this.cost = cost;  }
  public double getCost(){  return cost;  }  
  public void setMaterial(String material){ this.material = material;}
  public String getMaterial(){ return material;}
  public void setID(String ID){ this.ID = ID;}
  public String getID(){ return ID;}

}