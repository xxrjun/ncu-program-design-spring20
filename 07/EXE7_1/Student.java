package EXE7_1;

public class Student{
    private  String name;
    private  String major;

    public Student(String name, String major){
        setName(name);
        setMajor(major);       
    }

    public Student(String name){
        setName(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    public String toString(){
        return "學生姓名: " + getName() + (getMajor() != null ? " 系級：" + getMajor() : " 不分系");
    }
}