package Game;

public  class WorkWithBoard {

    static Board board;
    static int x,y;

    public WorkWithBoard(Board board) {
        this.board = board;
    }

    public static char makeMove(String str) {

        board.board[x][y] = board.currentPlayer.getType();
        board.countMove++;
        return board.currentPlayer.getType();
    }

    public void changeCurrentPlayer() {
        if (board.currentPlayer.getType() == 'X') {
            board.currentPlayer = board.playerO;
        } else {
            board.currentPlayer = board.playerX;
        }
    }


    public static boolean isGameFinished() {
        return (isGameHasWinner() || isBoardFull());
    }

    private static boolean isGameHasWinner() {

        if (board.countMove < 5) {
            return false;
        }

        for (int i = 0; i < 3; i++) {

            if (checkHorizontalLine(i)) {
                return true;
            } else if (checkVerticalLine(i)) {
                return true;
            }
        }

        if (checkDiagonalLine()) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull() {
        if (board.countMove == 9) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkHorizontalLine(int i) {
        if (board.board[i][0] != ' ' && board.board[i][0] == board.board[i][1]
                && board.board[i][0] == board.board[i][2]) {
            return true;
        }
        return false;
    }

    private static boolean checkVerticalLine(int i) {
        if (board.board[0][i] != ' ' && board.board[0][i] == board.board[1][i]
                && board.board[0][i] == board.board[2][i]) {
            return true;
        }
        return false;
    }

    private static boolean checkDiagonalLine() {
        if (board.board[0][0] != ' ' && board.board[0][0] == board.board[1][1]
                && board.board[0][0] == board.board[2][2]) {
            return true;
        } else if (board.board[0][2] != ' ' && board.board[0][2] == board.board[1][1]
                && board.board[0][2] == board.board[2][0]) {
            return true;
        } else {
            return false;
        }
    }

    public char[][] getBoard() {
        return board.board;
    }

    public void getWinner() {
        if (isGameHasWinner()) {
            System.out.println("The winner is " + board.currentPlayer.getNickName() +
                    "(" + board.currentPlayer.getType() + ").");
        } else {
            System.out.println("Dead head.");
            board.currentPlayer = null;
        }
    }


}
