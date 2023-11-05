package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
    }

    Boolean columnWinX(String input) {
        Boolean winOrLose = false;
        char[] chars = input.toCharArray();
        for (char c : chars){
            if (c == 'x') {
                winOrLose = true;
            } else {
                winOrLose = false;
            }
        }
        return  winOrLose;
    }

    Boolean columnWinO(String input) {
        Boolean winOrLose = false;
        char[] chars = input.toCharArray();
        for (char c : chars){
            if (c == 'o') {
                winOrLose = true;
            } else {
                winOrLose = false;
            }
        }
        return  winOrLose;
    }

    public Boolean isInFavorOfX() {
        return columnWinX("xxx");
    }

    public Boolean isInFavorOfO() {
        return columnWinO("ooo");
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
