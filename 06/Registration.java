import javax.swing.JOptionPane;

public class Registration {
    public static void main(String[] args){
        
        String inputN = JOptionPane.showInputDialog(null,"學生姓名：");
        String inputAdd = JOptionPane.showInputDialog(null,"學生地址：");
        int [] grades = new int[6];
       
        for(int i = 1 ; i < grades.length ; i++){
            String inputGrade1 = JOptionPane.showInputDialog(null,"成績 " + i +": ");
            grades[i] = Integer.parseInt(inputGrade1);
        }
        Student student = new Student(inputN,inputAdd,grades);
        JOptionPane.showMessageDialog(null,"學生姓名： " + student.getName() + " 總平均為： "+ student.printAvg() +"\n成績將寄到: " + student.getAddress());
        
    }
}
