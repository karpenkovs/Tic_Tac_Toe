package Game;

public class GameLogic {

    public static Board board;
    public static Players.Player playerX, playerO;


    public void runGame() {
        if (playerX == null || playerO == null) {
            setThePlayers();
            newGame();
        } else {
            newGame();
        }
        WorkWithBoard workWithBoard = new WorkWithBoard(board);

        while (!workWithBoard.isGameFinished()) {

            workWithBoard.changeCurrentPlayer();

           // workWithBoard.makeMove();

           // Communicator.printBoard(workWithBoard);
        }
        workWithBoard.getWinner();
    }

    public static void setThePlayers() {

    }

    private void newGame() {
        board = new Board(playerX, playerO);
    }
}
