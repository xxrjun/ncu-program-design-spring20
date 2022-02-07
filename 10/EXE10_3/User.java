package EXE10_3;

public class User {
    public static void main(String[] args){
        C c = new A();
        //c = new B();  // Not ok, because B is an abstract class
        c.ma();
        c.mb();
        //c.mc(); //Not ok, since C does not have mc()
    }
}
