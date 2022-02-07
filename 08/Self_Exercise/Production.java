public class Production {
    private int totalTime;
    private int totalCost;

    public Production(Machine m1, Machine m2, Machine m3, int t1, int t2, int t3){
        setTotalCost(m1, m2, m3, t1, t2, t3);
        setTotalTime(t1, t2, t3);
    }
    public void setTotalCost(Machine m1, Machine m2, Machine m3, int t1, int t2, int t3){
        totalCost = m1.getDepreciation() * t1 + m2.getDepreciation() *t2 + m3.getDepreciation() * t3;
    }
    public void setTotalTime(int t1, int t2, int t3){
        totalTime = t1 + t2 + t3;
    }
    public int calcTime(){
        return totalTime;
    }
    public int calcCost(){
        return totalCost;
    }
}
