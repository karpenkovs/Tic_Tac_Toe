public class WorkWithBoard {

    Board board;
    int x,y;

    WorkWithBoard(Board board) {
        this.board = board;
    }

    public  void makeMove() {

        while (!isMoveValid(board.currentPlayer.makeMove())) {

            if (!(board.currentPlayer.getNickName()).equals("PC")) {
                System.out.println("Input was incorrect. Repeat your move.");
            }

        }

        board.board[x][y] = board.currentPlayer.getType();
        board.countMove++;
    }

    public void changeCurrentPlayer() {
        if (board.currentPlayer.getType() == 'X') {
            board.currentPlayer = board.playerO;
        } else {
            board.currentPlayer = board.playerX;
        }
    }

    private boolean isMoveValid(String move) {

        if (move.length() != 2) {
            return false;
        }

        try {
            x = Character.getNumericValue(move.charAt(0)) - 1;
            y = Character.getNumericValue(move.charAt(1)) - 1;
        } catch (Exception e) {
            return false;
        }

        if (x > 2 || y > 2 || x < 0 || y < 0) {
            return false;
        }

        if (board.board[x][y] != ' ') {
            return false;
        }

        return true;
    }


    public boolean isGameFinished() {
        return (isGameHasWinner() || isBoardFull());
    }

    private boolean isGameHasWinner() {

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

    private boolean isBoardFull() {
        if (board.countMove == 9) {
            return true;
        } else {
            return false;
        }
    }

    private boolean checkHorizontalLine(int i) {
        if (board.board[i][0] != ' ' && board.board[i][0] == board.board[i][1]
                && board.board[i][0] == board.board[i][2]) {
            return true;
        }
        return false;
    }

    private boolean checkVerticalLine(int i) {
        if (board.board[0][i] != ' ' && board.board[0][i] == board.board[1][i]
                && board.board[0][i] == board.board[2][i]) {
            return true;
        }
        return false;
    }

    private boolean checkDiagonalLine() {
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

    public String toString() {

        String str = "";

        for (int i = 0; i < 3; i++) {

            if (i == 0) {
                str = str + "   | 1 | 2 | 3\n";
            }

            str = str + "--- --- --- ---\n";

            for (int j = 0; j < 3; j++) {

                if (j == 0) {
                    str = str + " " + (i + 1) + " | " + board.board[i][j] + " ";
                } else {
                    str = str + "| " + board.board[i][j] + " ";
                }

                if (j == 2) {
                    str = str + "\n";
                }
            }
        }
        return str = str + "\n";
    }
}
