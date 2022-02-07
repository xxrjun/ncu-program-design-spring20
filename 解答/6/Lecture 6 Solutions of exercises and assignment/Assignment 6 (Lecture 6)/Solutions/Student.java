public class Student{
  private String name, address;
  int [] grades = new int[5];

  public Student(String name, String address){
    setName(name);
    setAddress(address);
  }

  public void setName(String name){ this.name = name;  }
  public String getName(){ return name;  }

  public void setAddress(String address){  this.address = address;  }
  public String getAddress(){ return address;  }

  public void setGrades(int[] grades){
      for(int i=0; i<grades.length; i++){  this.grades[i] = grades[i]; }
  }
  public int [] getGrades(){ return grades; }

  public String printAvg(){
      int total=0;
      for(int i=0; i<grades.length; i++){ total += grades[i]; }
      return "學生姓名：" + getName() + " 總平均為："+ (double) total/grades.length;
  }
}