public class A{
  public static void ma(){
    System.out.println("from ma");
   //below trying to call mb() 
   mb();
  }
  public void mb(){
    System.out.println("from mb");
  }
  public void mc(){
    mb();
  }    

}
  