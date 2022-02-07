public class A{

    public static void ma(){
        System.out.println("from ma");
        //mb(); error static cannot call non-static method
    }
    public void mb(){
        System.out.println("from mb");
        ma();//non-static can call static method
    }
    public void mc(){
        mb();
    }
}