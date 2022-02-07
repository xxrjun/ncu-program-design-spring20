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
  
//�p�P�������D�n�O���L�[�W���[�A�æ��ո˶O��500��
  public double getCost(){
   return  500 + w.getCost() + f.getCost(); 
  }
}
           