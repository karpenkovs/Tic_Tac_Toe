public class Game {

    Board board;
    Player playerX, playerO;


    public void runGame() {
        if (playerX == null || playerO == null) {
            setThePlayers();
            newGame();
        } else {
            newGame();
        }
        WorkWithBoard workWithBoard = new WorkWithBoard(board);

        Communicator.gameStarted();

        Communicator.printBoard(workWithBoard);


        while (!workWithBoard.isGameFinished()) {

            workWithBoard.changeCurrentPlayer();

            workWithBoard.makeMove();

            Communicator.printBoard(workWithBoard);
        }
        workWithBoard.getWinner();
    }

    public void setThePlayers() {
        PlayerFactory factory = new PlayerFactory();
        playerX = factory.makePlayer(Communicator.enterFirstPlayer(), 'X');
        playerO = factory.makePlayer(Communicator.enterSecondPlayer(), 'O');
    }

    private void newGame() {
        board = new Board(playerX, playerO);
    }
}
