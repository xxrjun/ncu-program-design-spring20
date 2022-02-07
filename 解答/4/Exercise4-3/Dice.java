import java.util.Random;
public class Dice{
  public int roll(){
     Random r = new Random();
     return (1 + r.nextInt(6));
   }
} 