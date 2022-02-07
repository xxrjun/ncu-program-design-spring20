package Exe10_01;

public class EXE10_1 {
    public static void main(String[] args){
        Animal b1 = new Birds();

        b1.move(); // DMB
        //b1.layEgg(); error!
        ((Birds)b1).layEgg(); //casting
                
    }
}

abstract class Animal{
    public abstract void move();//no body
    //public abstract void skill();  if this line exist, its sub class must be implements all abstract method or declared abstrated also
}

class Birds extends Animal{

    public void move(){
        System.out.println("I fly.");
    }//implements

    public void layEgg(){
        System.out.println("I lay eggs.");
    }
}

class Dog extends Animal{
    @Override
    public void move(){
        System.out.println("I walk and run.");
    }
}