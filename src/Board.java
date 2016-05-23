import java.util.Arrays;
import java.util.Date;

public class Board {

    char[][] board = new char[3][3];
    Player currentPlayer;
    int countMove = 0;
    Player playerX, playerO;
    Date date = new Date();

    public Board(Player playerX, Player playerO) {

        this.playerX = playerX;
        this.playerO = playerO;

        currentPlayer = playerO;

        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
    }

}
