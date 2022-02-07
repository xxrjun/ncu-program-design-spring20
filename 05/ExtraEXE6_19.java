import java.util.Scanner;

public class ExtraEXE6_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean []seats = new boolean[11];
        int FirstClass = 0;
        int Economy = 5;
        int userInput = 0;

        while(FirstClass < 5 || Economy < 10){
            System.out.printf("Type 1 for First Class, 2 for Economy: ");
            userInput = input.nextInt();
        
            if(userInput == 1){
                seats[FirstClass] = true;
                FirstClass++;
                if(FirstClass <= 5){
                    System.out.println("First Class seat.#" + FirstClass);
                }
                else{
                    System.out.printf("First Class is full, assign Economy?\n");
                    System.out.printf("1 Yes , 2 No :");
                    userInput = input.nextInt();
                    
                    if(userInput == 1){
                        seats[Economy] = true;
                        Economy++;
                        if(Economy <= 10){
                            System.out.println("Economy seat.#" + Economy);
                        }
                    }
                    else if(userInput ==2){
                        System.out.println("Next flight leaves in 3 hours.");
                    }     
                }
            }
            else if (userInput == 2){
                seats[Economy] = true;
                Economy++;
                if(Economy <= 10){
                    System.out.println("Economy seat.#" + Economy);
                }
                else{
                    System.out.printf("Economy is full, assign First Class?\n");
                    System.out.printf("1 Yes , 2 No :");
                    userInput = input.nextInt();
        
                    if(userInput == 1){
                        seats[FirstClass] = true;
                        FirstClass++;
                        if(FirstClass <= 5){
                            System.out.println("First Class seat.#" + FirstClass);
                        }
                    }
                    else if(userInput ==2){
                        System.out.println("Next flight leaves in 3 hours.");
                    }    
                }
            }         
        }//end while
        
        System.out.println("All seats are full!");
        input.close();
    }//end main
}
