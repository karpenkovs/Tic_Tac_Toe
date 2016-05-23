public class Main {

    static History history = History.getInstance();
    static Game game = new Game();


    public static void main(String[] args) {

        Communicator.welcome();

        while (true) {

            switch (Communicator.mainMenu()) {

                case "1":
                    game.runGame();
                    saveMatchToHistory();
                    break;

                case "2":
                    game.setThePlayers();
                    break;

                case "3":
                    Communicator.print(history.getStatistic(Communicator.playerForStatistic()));
                    break;

                case "4":
                    Communicator.print(history.toString());
                    break;

                default:
                    Communicator.wrong();
                    break;
            }
        }
    }


    private static void saveMatchToHistory() {
        history.addResult(game.board);
    }


}
