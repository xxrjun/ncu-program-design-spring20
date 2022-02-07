package Assignment9;
public class Student {
    private String name;
    private String  major;
    private String advisor;
    private int credits = 0;

    public Student(String name, String major,String advisor) {
        setName(name);
        setMajor(major);
        setAdvisory(advisor);
    }
    public Student(String name, String major) {
        setName(name);
        setMajor(major);
    }
   
    public void setName(String name){ this.name = name;}
    public void setMajor(String major){ this.major = major;}
    public void setAdvisory(String advisor){ this.advisor = advisor;}

    
    
}
