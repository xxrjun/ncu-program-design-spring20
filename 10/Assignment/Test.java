//109403019

package Assignment;

//DMB works only for the common method that are available in both super and sub class.
//if sub doesn't implement all abstract method from its super class.

public class Test{
    public static void main(String[] args){
        A a = new A();
        B b = a;
        C c = a;

        c.m2(); //ok
        //b.m3(); //not OK, m3() is only in A,which is a sub class to B.
    }
}