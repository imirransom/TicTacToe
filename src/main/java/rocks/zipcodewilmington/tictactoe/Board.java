package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */

public class Board {

    private Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    Boolean columnWinX() {
        Boolean winOrLose = false;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] == ('x') && matrix[i][1] == ('x') && matrix[i][2] == ('x')){
                winOrLose = true;
            }
        }
        return winOrLose;
    }

    Boolean columnWinO() {
        Boolean winOrLose = false;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] == ('o') && matrix[i][1] == ('o') && matrix[i][2] == ('o')){
                winOrLose = true;
            }
        }
        return winOrLose;
    }

    public Boolean isInFavorOfX() {
        return columnWinX();
    }

    public Boolean isInFavorOfO() {
        return columnWinO();
    }

    public Boolean isTie() {
        Boolean tie = false;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] != ('o') && matrix[i][1] != ('o') && matrix[i][2] != ('o')){
                tie = true;
            }
        }
        return tie;
    }

    public String getWinner() {
        return null;
    }

}
