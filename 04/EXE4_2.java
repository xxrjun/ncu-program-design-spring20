import javax.swing.JOptionPane;

public class EXE4_2 {
    public static void main(String[] args){
        int  l = 0;//for length of sentence
        int num = 0;//for times of 'A'
        EXE4_2 count = new EXE4_2();
        String input = JOptionPane.showInputDialog(null,"Input a English sentence: ","Input",3);
        num = count.countA(input);
        l = input.length();
        JOptionPane.showMessageDialog(null,"The length of the sentence: " + l + 
                                            "\nThe numbers of times that \'A\' found in sentence: " + num );
    }   
    
    public int countA(String text){
        int count = 0;

        for(int i = 0 ; i < text.length(); i++){
            if(text.charAt(i) == 'A'){
                count ++;
            }
        }
        return count;
    } 
}
