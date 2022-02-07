public class Machine{
  private int depreciation; 
  private int time;

  public Machine(int depreciation){ setDepreciation(depreciation);  }

  public int procCost(){ return time*depreciation;}

  public void setTime(int time){ this.time = time;  }
  public int getTime(){ return time; }

  public void setDepreciation(int cost){ depreciation = cost; }
  public int getDepreciation(){ return depreciation; }
  
 }