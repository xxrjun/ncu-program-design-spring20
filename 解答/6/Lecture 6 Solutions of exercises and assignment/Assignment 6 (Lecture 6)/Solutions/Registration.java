import javax.swing.JOptionPane;
public class Registration{
  public static void main(String [] args){
    int [] grades = new int [5];
    String name = JOptionPane.showInputDialog("�ǥͩm�W:");
    String address = JOptionPane.showInputDialog("�a�}:");

    for (int i = 0; i<5; i++){
      grades[i] = Integer.parseInt(JOptionPane.showInputDialog("���Z "+ (i+1) +": "));
    }
    
    Student s1 = new Student(name, address);
    s1.setGrades(grades);
    JOptionPane.showMessageDialog(null, s1.printAvg());
  }
}
