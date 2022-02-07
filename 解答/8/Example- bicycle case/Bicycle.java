public class Bicycle {
  private Wheel w;  
  private Frame f;  

  public Bicycle(Wheel w, Frame f){
     setWheel(w);
     setFrame(f);
  }

  public void setWheel(Wheel w){ this.w = w; }
  public Wheel getWheel(){ return w; }
  public void setFrame(Frame f){ this.f = f;  }
  public Frame getFrame(){ return f; }
  
//�p�P�������D�n�O���L�[�W���[�A�æ��ո˶O��500��
  public double getCost(){
   return  500 + w.getCost() + f.getCost(); 
  }
}
           