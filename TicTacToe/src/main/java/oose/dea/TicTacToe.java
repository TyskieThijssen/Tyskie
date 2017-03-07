package oose.dea;

/**
 * Created by tyskie on 3/3/17.
 */
public class TicTacToe {
    private static String[][] multi = new String[][] {  {"_","_","_"},
                                                        {"_","_","_"},
                                                        {"_","_","_"}};

    public static void main(String[] args) {

    }

    public static boolean setMove(int row, int col, String player) {
        if(multi[row - 1][col - 1] == "_"){
            multi[row - 1][col - 1] = player;
            return true;
        }
        return false;
    }

    public static void printGrid(){
        for(int i = 0; i < 3; i++){
            System.out.print("|");
            for(int j = 0; j < 3; j++){
                System.out.print(multi[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }
}
