import javax.swing.JOptionPane;

public class UseDice{
	public static void main(String[] args){
		int times = 0;
		
		String input = JOptionPane.showInputDialog(null,"要擲幾次骰子?","輸入",3);
		times = Integer.parseInt(input);
		Dice dice = new Dice();
		int[] eachtime = {0,0,0,0,0,0};
		
		for(int i = 0;i < times;i++){
			dice.rollDice();
			switch(dice.diceNum){
				case 1:
					eachtime[1] ++;
					break;
				case 2:
					eachtime[2] ++;
					break;
				case 3:
					eachtime[3] ++;
					break;
				case 4:
					eachtime[4] ++;
					break;
				case 5:
					eachtime[5] ++;
					break;
				case 6:
					eachtime[6] ++;
					break;
			}
		}
		
		System.out.printf("點數  次數");
		for(int i = 1; i <= 6 ; i++){
			System.out.println(i + "  " + eachtime[i]);
		}
	}
}