public class Registration{
   public static void main(String [] args){
      Student s1 = new Student("���j��", "���");
      Student s2 = new Student("�L�p��");
      Student s3 = new Student("�d���W", "�j��");
      Student s4 = new Student("���p��", "����"); 

      Course c1 = new Course("Java Programming");
      Course c2 = new Course("MIS");

      c1.addStudent(s1);
      c1.addStudent(s3);
      c1.addStudent(s4);
      c2.addStudent(s1);
      c2.addStudent(s2);

      System.out.println(c1);
      System.out.println(c2);
      System.out.println("�ثe�t�Τ��@��"+s1.getCount()+"��ǥ�");
   }
}

     
