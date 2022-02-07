import javax.swing.JOptionPane;

public class AssignmentB 
{
    public static void main(String[] args)
    {
        int m1 = 0,n1 = 0;
        int m2 = 0,n2 = 0;//used to calculate
        int result;

        String inputm = JOptionPane.showInputDialog(null,"Enter m = ?","Input",3);
        m1 = Integer.parseInt(inputm);
        String inputn = JOptionPane.showInputDialog(null,"Enter n = ?","Input",3); 
        n1 = Integer.parseInt(inputn);

        m2 = m1;
        n2 = n1;

        for(int i = 1 ;i < n1 ;i++)
        {
            m2 *= (m2-i);
        }
        for(int j = 1 ; j < n1 ;j++)
        {
            n2 *= (n2-j);
        }
        result = m2/n2;

        JOptionPane.showMessageDialog(null,"The result of C(" + m1 + "," + n1 + ") is " + result,"Message",2);
    }
}
