import javax.swing.JOptionPane;
public class Exercise4_2{

   public static void main(String [] args){
     String input = JOptionPane.showInputDialog("Enter a sentence: ");
     JOptionPane.showMessageDialog(null, "The length of the sentence is: " + input.length());
     JOptionPane.showMessageDialog(null, "The number of As is: " + countA(input));
   }

  public static int countA (String text){
     int count = 0;
     for (int p=0; p< text.length(); p++){
         if (text.charAt(p) == 'A'){ count++; }
     }
     return count;
  }
}