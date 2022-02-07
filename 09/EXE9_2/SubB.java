package EXE9_2;

public class SubB extends SuperA{
    
    public void mb(){
        v2 = " subB change v2";
        System.out.println(v2);
    }
    

    @Override
    public void setV1(String v2){
        super.setV1(v2);;
    }
}
