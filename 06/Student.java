public class Student {
    private String Name;
    private String Address;
    public int[] Grades = new int[6];
    public int i = 0 ;


    public Student(String name, String address,int grades[]){
        setName(name);
        getName();
        setAddress(address);
        getAddress();
        setGrades(grades);
        printAvg();

    }
    public void setName(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setAddress(String address){
        Address = address;
    }
    public String getAddress(){
        return Address;
    }
    public void setGrades(int grades[]){
        Grades[0] = 0;
        for(i = 1 ; i <=5 ; i++){
            Grades[i] = grades[i];
        }
    }
    

    public double printAvg(){ 
        int total = 0;
        for(int i : Grades){
            total += i;
        }
        return (double) total / 5;
    }
}
