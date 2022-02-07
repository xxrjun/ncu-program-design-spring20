package EXE9_2;

public class SuperA {
    private String v1 = "data from super";
    protected String v2 = "from super's protected v2";

    protected void setV2(String v2){
        this.v2 = v2;
    }
    public void setV1(String a){
        v1 = a;
    }
    public String getV1(){ 
        return v1;
    }
}
