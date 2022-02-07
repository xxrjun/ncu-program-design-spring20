public class Registration{
  public static void main(String [] args){
    Graduate g1 = new Graduate("John", "MIS", "Dr.Chen");
    UnderGraduate u1 = new UnderGraduate("Mary", "MIS");
    u1.addCredits(21);
    u1.addCredits(15);
    u1.setHonor(true);
    System.out.println(u1.tuition());
  }
}