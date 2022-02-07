public class Course{
   private int numOfStudent;
   private Student enrollment [] = new Student[5];
   private String courseName;

   public Course(String name){  
     setCourseName(name); 
     numOfStudent = 0;  }
   
   public void setCourseName(String name){ courseName = name; }
   public String getCourseName(){ return courseName; }

   public void addStudent(Student s){
     if(numOfStudent < 5){
       enrollment[numOfStudent++] = s;   
     }
     else { System.out.println("No more students, come earlier next time!"); }
   }

   public String getStudents(){
     String output="";
     for (int i = 0; i <=4; i++){ 
       if(enrollment[i] != null){ output += enrollment[i] + "\n";  }
     }
     return output;
   }   
   public String toString(){ return "½Òµ{¡G"+ getCourseName() + "\n"+ getStudents(); }     
}