import java.util.Random;

public class Dice{
	public static int diceNum = 0;
	public static void rollDice(){
		Random r = new Random();
		diceNum = r.nextInt(6) + 1;
	}
}