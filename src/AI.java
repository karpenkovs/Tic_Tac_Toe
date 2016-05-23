import java.util.Random;

public class AI extends Player {
    AI(String name, char type) {
        super(name, type);
    }

    @Override
    public String makeMove() {
        Random rnd = new Random();
        int x = rnd.nextInt(4);
        int y = rnd.nextInt(4);
        return String.valueOf(x) + String.valueOf(y);
    }
}
