public class Student{
  private String name;
  private String major;
  private int credits = 0; //修過的學分數

  public Student(String name, String major){
    setName(name);
    setMajor(major);   
  }
  public void setName(String name){ this.name = name; }
  public String getName(){ return name; }
  public void setMajor(String major){ this.major = major; }
  public String getMajor(){ return major; }

  public void addCredits(int credits){ //寫出內容
    this.credits += credits;   }
  public int getCredits(){ return credits; }
}