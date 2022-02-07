public class Student {
    private String Name;
    private String Major;
    private static int count;

    public Student(String Name, String Major){
        setName(Name);
        setMajor(Major);
        addCount();
    }
    public Student(String Name){
        setName(Name);
        addCount();
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setMajor(String Major){
        this.Major = Major;
    }
    public String getMajor(){
        return Major;
    }
    public void addCount(){
        count++;
    }
    public int getCount(){
        return count;
    }
    public String toString(){
        return "    學生姓名：" + getName() + (getMajor() != null ? ("系級：" + getMajor()) : null);
    }
}
