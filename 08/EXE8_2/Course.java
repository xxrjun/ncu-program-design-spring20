public class Course {
    private String CourseName;
    private Student [] StudentList = new Student [100];
    private int i = 0;
    public Course(String CourseName){
        setCourseName(CourseName);
    }

    public void setCourseName(String CourseName){
        this.CourseName = CourseName;
    }
    public String getCourseName(){
        return CourseName;
    }
    public void addStudent(Student s){
        StudentList[i] = s;
        i++;
    }
    public int getNum(){
        return i;
    }
    public String toString(){
        String output = "";
        for(int j = 0; j < getNum() ; j++){
            output += StudentList[j] + "\n";
        }
        return "課程:" + getCourseName() + "\n" + output; 
    }
}
