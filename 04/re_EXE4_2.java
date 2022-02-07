import javax.swing.JOptionPane;

public class re_EXE4_2 {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null,"Input a sentence: ");
        
        if(countA(input) >=2){
            JOptionPane.showMessageDialog(null,"There are "+ countA(input)+" in your sentence");
        }
        else if(countA(input) < 2){
            JOptionPane.showMessageDialog(null,"There are "+ countA(input)+" in your sentence");
        }
        
        
    }
    public static int  countA(String text){
        int count = 0 ;

        for(int i = 0 ;i < text.length();i++){
            if(text.charAt(i) == 'A'){
                count++;
            }
        }

        return count;
    }
}
