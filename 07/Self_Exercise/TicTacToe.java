import java.util.*;

public class TicTacToe {
    private static String [][] Board = {{" "," "," "},{" "," "," "},{" "," "," "}};
    private int checkWinner = 0;
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        TicTacToe use = new TicTacToe();    
        printBoard();

        int choice = 0;//user input
        
        int row = 0;
        int column = 0;

        System.out.println("O or X first?\n 1 for O, 2 for X");
        choice = input.nextInt();
        int round = 0;

        switch(choice){    
            case 1:
                while(use.getCheckWinner() != 1){
                    for(int i = 0 ; i < 5 ; i++){
                        round++;
                        System.out.println("Round " + round);
                        System.out.println("Player O's turn.");
                        System.out.printf("Player O: Enter row(0 , 1 or 2): ");
                        row = input.nextInt();
                        System.out.printf("Player O: Enter colunm(0 , 1 or 2): ");
                        column = input.nextInt();
                        while(use.checkIfEmpty(row, column) == 1){
                            System.out.println("it's already entered. Enter other space");
                            System.out.printf("Player O: Enter row(0 , 1 or 2): ");
                            row = input.nextInt();
                            System.out.printf("Player O: Enter colunm(0 , 1 or 2): ");
                            column = input.nextInt();
                        }
                        use.setElement_O_first(row,column,round);
                        printBoard();
                        use.checkWinner();
                        if(use.getCheckWinner() == 1){
                            break;
                        }
                        else if(round == 9){
                            System.out.println("Game is end. No ones win!");
                        }  

                        round++;
                        System.out.println("Round " + round);
                        System.out.println("Player X's turn.");
                        System.out.printf("Player X: Enter row(0 , 1 or 2): ");
                        row = input.nextInt();
                        System.out.printf("Player X: Enter colunm(0 , 1 or 2): ");
                        column = input.nextInt();
                        while(use.checkIfEmpty(row, column) == 1){
                            System.out.println("it's already entered. Enter other space");
                            System.out.printf("Player X: Enter row(0 , 1 or 2): ");
                            row = input.nextInt();
                            System.out.printf("Player X: Enter colunm(0 , 1 or 2): ");
                            column = input.nextInt();
                        }
                        use.setElement_O_first(row,column,round);
                        printBoard();
                        use.checkWinner();

                        if(use.getCheckWinner() == 1){
                            break;
                        }
                        else if(round == 9){
                            System.out.println("Game is end. No ones win!");
                        }
                             
                    }
                }
                break;
            case 2:
                while(use.getCheckWinner() != 1){
                    for(int i = 0 ; i < 5 ; i++){
                        round++;
                        System.out.println("Round " + round);
                        System.out.println("Player X's turn.");
                        System.out.printf("Player X: Enter row(0 , 1 or 2): ");
                        row = input.nextInt();
                        System.out.printf("Player X: Enter colunm(0 , 1 or 2): ");
                        column = input.nextInt();
                        while(use.checkIfEmpty(row, column) == 1){
                            System.out.println("it's already entered. Enter other space");
                            System.out.printf("Player X: Enter row(0 , 1 or 2): ");
                            row = input.nextInt();
                            System.out.printf("Player X: Enter colunm(0 , 1 or 2): ");
                            column = input.nextInt();
                        }
                        use.setElement_X_first(row,column,round);
                        printBoard();
                        use.checkWinner();
                        if(use.getCheckWinner() == 1){
                            break;
                        }
                        else if(round == 9){
                            System.out.println("Game is end. No ones win!");
                        } 

                        round++;
                        System.out.println("Round " + round);
                        System.out.println("Player O's turn.");
                        System.out.printf("Player O: Enter row(0 , 1 or 2): ");
                        row = input.nextInt();
                        System.out.printf("Player O: Enter colunm(0 , 1 or 2): ");
                        column = input.nextInt();
                        while(use.checkIfEmpty(row, column) == 1){
                            System.out.println("it's already entered. Enter other space");
                            System.out.printf("Player O: Enter row(0 , 1 or 2): ");
                            row = input.nextInt();
                            System.out.printf("Player O: Enter colunm(0 , 1 or 2): ");
                            column = input.nextInt();
                        }
                        use.setElement_X_first(row,column,round);
                        printBoard();
                        use.checkWinner();
                        if(use.getCheckWinner() == 1){
                            break;
                        }
                        else if(round == 9){
                            System.out.println("Game is end. No ones win!");
                        }  
                    }
                }
                break;
            default:
                System.out.println("Wrong Enter!");
                break;
        }
        input.close();
    }
 
    public static void printBoard(){
        System.out.println(" ------- -------- -------- ");
        System.out.println("|       |        |        |");
        System.out.println("|  "+ Board[0][0] + "    |    " + Board[0][1] + "   |  " + Board[0][2]+ "     |");
        System.out.println("|       |        |        |");
        System.out.println(" ------- -------- -------- ");
        System.out.println("|       |        |        |");
        System.out.println("|  "+ Board[1][0] + "    |    " + Board[1][1] + "   |  " + Board[1][2]+ "     |");
        System.out.println("|       |        |        |");
        System.out.println(" ------- -------- -------- ");
        System.out.println("|       |        |        |");
        System.out.println("|  "+ Board[2][0] + "    |    " + Board[2][1] + "   |  " + Board[2][2]+ "     |");
        System.out.println("|       |        |        |");
        System.out.println(" ------- -------- -------- ");

    }
    public int checkIfEmpty(int row, int column){
        if(Board[row][column].compareTo(" ") == 0){
            return 0;
        }
        else {
            return 1;
        }
    }
    public void setElement_O_first(int row, int column, int round){
        if(round % 2 != 0){
            Board[row][column] = "O";
        }
        else if (round % 2 == 0){
            Board[row][column] = "X";
        }
    }
    public void setElement_X_first(int row, int column, int round){
        if(round % 2 != 0){
            Board[row][column] = "X";
        }
        else if (round % 2 == 0){
            Board[row][column] = "O";
        }
    }

    public void setEmpty(){   
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                Board[i][j] = null;
            }        
        }
    }
    public void checkWinner(){
        String line = null;

        for (int i = 0; i < 8; i++) {
            line = null;
            switch (i) {
            case 0:
                line = Board[0][1] + Board[0][1] + Board[0][2];
                break;
            case 1:
                line = Board[1][0] + Board[1][1] + Board[1][2];
                break;
            case 2:
                line = Board[2][0] + Board[2][1] + Board[2][2];
                break;
            case 3:
                line = Board[0][0] + Board[1][0] + Board[2][0];
                break;
            case 4:
                line = Board[0][1] + Board[1][1] + Board[2][1];
                break;
            case 5:
                line = Board[0][2] + Board[1][2] + Board[2][2];
                break;
            case 6:
                line = Board[0][0] + Board[1][1] + Board[2][2];
                break;
            case 7:
                line = Board[0][2] + Board[1][1] + Board[2][0];
                break;
            }

            if(line.equals("OOO")){
                System.out.println("Games over. Player O won!");
                setCheckWinner();
                break;                 
            }
            else if(line.equals("XXX")){
                System.out.println("Games over. Player X won!");
                setCheckWinner();
                break;
            }     
        }
        
    }

    public void setCheckWinner(){
        checkWinner = 1;
    }
    public int getCheckWinner(){
        return checkWinner;
    }
}
