import java.util.ArrayList;
public class Club{
  private ArrayList<Member> list;
  public Club(){ list = new ArrayList<Member>();  }
  public void addMember(Member m){ list.add(m); }
  public int totalFees(){
      int total = 0;
      for(int i = 0; i< list.size(); i++){ total += list.get(i).getFee(); }
      return total;
  }
 
  public String toString(){ 
     String message="";
     for(int i = 0; i< list.size(); i++){ message += list.get(i); }
     return message;
  }
}
        
