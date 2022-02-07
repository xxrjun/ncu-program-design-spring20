import javax.swing.JOptionPane;
public class Assignment3_B{
  public static void main(String [] args){

    int m = Integer.parseInt(JOptionPane.showInputDialog("Enter m=?"));
    int n = Integer.parseInt(JOptionPane.showInputDialog("Enter n=?"));
    int fa = 1, fb = 1, fc = 1;
    for (int i = 1; i <= m; i++){ fa *=i;}
    for (int i = 1; i <= n; i++){ fb*=i;}
    for (int i = 1; i <= m-n; i++){fc*=i;}    
    JOptionPane.showMessageDialog(null, "The result of C("+ m +"," + n +") is " + fa/fb/fc);
    System.exit(0);  //­Y¨S¼g¤£¦©¤À
  }
}