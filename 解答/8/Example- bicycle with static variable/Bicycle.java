public class Bicycle {
  private Wheel w;  
  private Frame f;  
  private static int quantity;

  public Bicycle(Wheel w, Frame f){
     setWheel(w);
     setFrame(f);
     quantity++;
  }

  public void setWheel(Wheel w){ this.w = w; }
  public Wheel getWheel(){ return w; }
  public void setFrame(Frame f){ this.f = f;  }
  public Frame getFrame(){ return f; }

  public static int getQuantity(){ return quantity; }
  
//小摺的成本主要是輪胎加上車架，並有組裝費用500元
  public double getCost(){
   return  500 + w.getCost() + f.getCost(); 
  }
}
           