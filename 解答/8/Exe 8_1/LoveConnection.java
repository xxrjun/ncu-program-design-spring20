public class LoveConnection{
   public static void main(String [] args){
     Man m1 = new Man("John");
     Man m2 = new Man("Jay");
     Woman w1 = new Woman("Mary");
     Woman w2 = new Woman("Helen");

     Couple c1 = new Couple(m1, w1);
     System.out.println(c1);
     c1.changeMan(m2);
     System.out.println(c1);
   }
}     
     

