import java.util.Random;
import java.util.Scanner;
public class Exercise3_2{
  public static void main(String [] args){
    Random r = new Random();
    Scanner scanner = new Scanner(System.in);
    int answer=0, correct=0, count=1;

    System.out.println("�u�W����}�l(�@���D)...");
    do{
        int a = r.nextInt(9) + 1;
        int b = r.nextInt(9) + 1;
        System.out.printf("%d x %d = ?", a, b);
        answer = scanner.nextInt();
        if (a*b == answer){ correct += 1;  }
        count++;
    }while(count <=5);

    if (correct >= 4){ System.out.println("�ƾǸ��u�ͳ�"); }
    else { System.out.println("�n�A�[�o�I"); }
  }
}
    