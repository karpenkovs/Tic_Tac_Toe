import java.util.ArrayList;
import java.util.List;

public class History {

    private List<Board> games = new ArrayList<>();

    private static History history = null;

    public static History getInstance() {
        if (history == null) {
            history = new History();
        }
        return history;
    }

    public void addResult(Board board) {
        games.add(board);
    }

    @Override
    public String toString() {

        String history = "";

        for (Board board : games) {

            WorkWithBoard wwb = new WorkWithBoard(board);

            String winner = "The winner is: ";

            if (board.currentPlayer.getType() == 'X') {
                winner += board.playerX.getNickName() + "(X).";
            } else if (board.currentPlayer.getType() == 'O') {
                winner += board.playerO.getNickName() + "(O).";
            } else {
                winner = "Dead head.";
            }

            history += board.date + ":\n" +
                    "Player X: " + (board.playerX.getNickName()) + "\n" +
                    "Player Y: " + (board.playerO.getNickName()) + "\n" +
                    winner + "\n" +
                    "The board is: \n" +
                    wwb.toString() +
                    "\n";
        }
        return history;
    }

    public String getStatistic(String name) {
        Statistic statistic = new Statistic(name);
        return statistic.toString();
    }

    private class Statistic {

        int matches = 0;
        int wins = 0;
        int looses = 0;
        int deadHeads = 0;
        String name;

        public Statistic(String name) {
            this.name = name;

            for (Board board : games) {
                if ((board.playerX.getNickName()).equals(name)) {
                    calculateStatistic(board, board.playerX);
                } else if ((board.playerO.getNickName()).equals(name)) {
                    calculateStatistic(board, board.playerO);
                }
            }
        }

        private void calculateStatistic(Board board, Player player) {
            matches++;
            if (player.equals(board.currentPlayer)) {
                wins++;
            } else if (board.currentPlayer == null) {
                deadHeads++;
            } else {
                looses++;
            }
        }

        @Override
        public String toString() {

            return name + " has " + matches + " matches.\n" +
                    wins + " wins.\n" +
                    looses + " looses.\n" +
                    deadHeads + " dead heads.\n\n";
        }
    }


}
