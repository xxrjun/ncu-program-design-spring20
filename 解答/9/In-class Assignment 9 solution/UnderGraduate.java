public class UnderGraduate extends Student{
  private boolean honor = false;  //�O�_���Z�u�ǥ�

  public UnderGraduate(String name, String major){
    super(name, major);  
  }
  public int tuition(){ 
    return (honor == true) ? 500*getCredits() : 1000*getCredits(); }

  public void setHonor(boolean h){ honor = h; }
  public boolean checkHonor(){ return honor; } //a get method for honor, but wth a different name to better represent the design logic
} 
  