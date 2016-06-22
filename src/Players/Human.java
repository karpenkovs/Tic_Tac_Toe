package Players;

import java.util.Scanner;

public class Human extends Player{


    Human(String name, char type) {
        super(name, type);
    }

    @Override
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getNickName() + ", please enter your move." );
        return scanner.next();
    }
}
