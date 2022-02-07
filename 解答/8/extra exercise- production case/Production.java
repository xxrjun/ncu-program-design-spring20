public class Production{
  private Machine m [] = new Machine [3];  //declare the type of class to form aggregation

  public Production(Machine a, Machine b, Machine e, int timeA, int timeB, int timeC){
    m[0] = a;
    m[1] = b;
    m[2] = e;
    m[0].setTime(timeA);
    m[1].setTime(timeB);
    m[2].setTime(timeC);
  }
  
  public int calcCost(){
    return m[0].procCost() + m[1].procCost() + m[2].procCost(); 
  }

  public int calcTime(){ return m[0].getTime() + m[1].getTime() +m[2].getTime(); }
}