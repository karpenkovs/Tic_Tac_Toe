package MenuLogic;

import GUI.FrameGame;
import GUI.FrameSetPlayers;
import Game.GameLogic;

public class MainMenuFactory {

    public static void makeSelect(String selection){

        switch (selection) {

            case "Start game":
                if(GameLogic.playerX == null || GameLogic.playerO == null)
                    GameLogic.setThePlayers();

                System.out.println("Start game");
                FrameGame frameGame = new FrameGame();
                break;

            case "Set players":
                System.out.println("Set players");
                FrameSetPlayers frameSetPlayers = new FrameSetPlayers();
                break;

            case "Get statistic of the player":
                System.out.println("Get statistic of the player");
                break;

            case "Show history":
                System.out.println("Show history");
                break;

            case "Exit":
                System.out.println("Exit");
                break;
        }
    }
}
