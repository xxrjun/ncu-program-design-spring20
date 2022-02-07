//109403019
public class Club {
    private Member []Members = new Member[20];
    private int count;
    private int totalFee;

    public void addMember(Member m){
        if(count < 5){
            Members[count++] = m;
            totalFee += m.getFee();
        }
        else{
            
        }
    }
    public int totalFees(){
        return totalFee;
    }
    public String toString(){
        String output = "";
        for(int i = 0 ; i < 20 ;i++){
            if(Members[i] != null){
                output += Members[i] + "\n";
            }
        }
        return output;
    }
}

   
