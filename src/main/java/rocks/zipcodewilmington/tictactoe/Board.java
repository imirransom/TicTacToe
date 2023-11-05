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
            if (matrix[0].equals('x') && matrix[1].equals('x') && matrix[2].equals('x')){
                winOrLose = true;
            } else {
                winOrLose = false;
            }
        }
        return winOrLose;
    }

    Boolean columnWinO() {
        Boolean winOrLose = false;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[0].equals('o') && matrix[1].equals('o') && matrix[2].equals('o')){
                winOrLose = true;
            } else{
                winOrLose = false;
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
        return null;
    }

    public String getWinner() {
        return null;
    }

}
