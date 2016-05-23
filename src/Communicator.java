import java.util.Scanner;

public class Communicator {

    static Scanner scanner = new Scanner(System.in);

    public static void wrong() {
        System.out.println("Your enter was wrong.");
    }

    public static String enterFirstPlayer() {
        System.out.println("Please enter the name of first player(X).\n" +
                "If you want to first player was PC, enter \"PC\".");
        return scanner.next();
    }

    public static String enterSecondPlayer() {
        System.out.println("Please enter the name of second player(O).\n" +
                "If you want to second player was PC, enter \"PC\".");
        return scanner.next();
    }

    public static String mainMenu() {
        System.out.println("Main menu: \n" +
                "1.Start game.\n" +
                "2.Set the players.\n" +
                "3.Get statistic for the player.\n" +
                "4.Get history for all matches.\n" +
                "Please, enter your choice: ");
        return scanner.next();
    }

    public static void gameStarted() {
        System.out.println("Game started...");
    }

    public static void printBoard(WorkWithBoard workWithBoard) {
        System.out.println(workWithBoard);
    }

    public static void gameOver() {
        System.out.println();
        System.out.println("Game over.");
        System.out.println();
    }

    public static void welcome() {
        System.out.println("Welcome to Tic_Tac_Toe");
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static String playerForStatistic() {
        System.out.println("Please, enter the name of the player whose statistics you want to see:");
        return scanner.next();
    }

}
