public class UserClass {
    public static void main(String[] args){
        Machine a = new Machine(100);
        Machine b = new Machine(200);
        Machine e = new Machine(400);
        Production p1 = new Production(a, b, e, 5, 4, 7);
        System.out.println("The total production time required: "+ p1.calcTime());
        System.out.println("The total production cost for machines: "+ p1.calcCost());
    }
}
