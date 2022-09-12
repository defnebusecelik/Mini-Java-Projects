import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("\nLet's play tic tac toe!");
        char[][] board= {
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
        };
        printBoard(board);
    }
    
    public static void printBoard(char[][] board){
        System.out.print("\n");
        for(int i=0; i<board.length; i++){
            System.out.print("\t");
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.print("\n\n");
        }
    }
}
