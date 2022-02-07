public class UserClass{
    public static void main(String[] args){
        Sub2 s2 = new Sub2();
    }
}

class Super{
    public Super(){
        methodA();
    }
    public void methodA(){
        System.out.println("form super");
    }
}
class Sub1 extends Super{
    public Sub1(){
        //super();
        System.out.println("this is form Sub1 constructor");
        this.methodB();  
    }
   
    public void methodB(){
        System.out.println("from  Sub1\n");
    }
}
class Sub2 extends Sub1{
    public Sub2(){
        //super();
        System.out.println("this is from Sub2 constructor");
        methodB();
    }

    @Override
    public void methodB(){
        super.methodB();
        System.out.println("from Sub2\n");
    }
  
}