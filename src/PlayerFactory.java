public class PlayerFactory {

    public Player makePlayer(String name, char type){

        Player player;

        switch (name){
            case "PC":
                player = new AI(name, type);
                break;

            default:
                player = new Human(name, type);
                break;
        }

        return player;
    }
}
