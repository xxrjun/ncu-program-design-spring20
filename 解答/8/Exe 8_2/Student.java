public class Student{
  private static int count;
  private String name;
  private String major;

  public Student(String name, String major){
    setName(name);
    setMajor(major);
    addCount();
  }

  public Student(String name){
    setName(name);
    addCount();
  }

  public void setName(String name){ this.name = name; }
  public String getName(){ return name; }

  public void setMajor(String major){ this.major = major; }
  public String getMajor(){ return major; }

  public void addCount(){ count++; }
  public int getCount(){ return count;}

  public String toString(){ return "  �ǥͩm�W�G"+ getName() + (getMajor() != null ? (" �t�šG" + getMajor()) : ""); }

}