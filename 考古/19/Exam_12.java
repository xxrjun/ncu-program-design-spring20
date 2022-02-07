import java.util.Scanner;

public class Exam_12 {
    public static void main(String [] args){
        int grade = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("輸入成績(0~100)，若無成績請輸入ctrl+z: ");
        while(input.hasNext()){
            System.out.print("輸入成績(0~100)，若無成績請輸入ctrl+z: ");
            grade =input.nextInt();
            if(grade > 100 || grade < 0){
                System.out.print("輸入成績(0~100)，若無成績請輸入ctrl+z: ");
                grade =input.nextInt();
            }
            switch(grade / 10){
                case 9:
                case 10:
                    System.out.printf("你的成績等級為： Ａ\n");
                    break;
                case 8:
                    System.out.printf("你的成績等級為： B\n");
                    break;
                case 7:
                    System.out.printf("你的成績等級為： C\n");
                    break;
                case 6:
                    System.out.printf("你的成績等級為： D\n");
                    break;
                default:
                    System.out.printf("你的成績等級為： F\n");
            }
        }
        input.close();
    }   
}