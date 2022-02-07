public class Registration{
   public static void main(String [] args){
      Student s1 = new Student("王大明", "資管");
      Student s2 = new Student("林小華");
      Student s3 = new Student("吳忠名", "大氣");
      Student s4 = new Student("李小隆", "企管"); 

      Course c1 = new Course("Java Programming");
      Course c2 = new Course("MIS");

      c1.addStudent(s1);
      c1.addStudent(s3);
      c1.addStudent(s4);
      c2.addStudent(s1);
      c2.addStudent(s2);

      System.out.println(c1);
      System.out.println(c2);
      System.out.println("目前系統內共有"+s1.getCount()+"位學生");
   }
}

     
