package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FrameMainMenu extends JFrame {

    final String[] NAMES = {"Start game", "Set players",
            "Get statistic of the player", "Show history", "Exit"};
    public static JButton btn;

    public FrameMainMenu() {
        super("Tic-Tac Toe");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        BoxLayout boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        this.setLayout(boxLayout);

        Font font = new Font("Arial", Font.PLAIN, 24);

        for (int i = 0; i < NAMES.length; i++) {
            JButton button = new JButton(NAMES[i]);
            button.setMaximumSize(new Dimension(350, 80));
            button.setFont(font);
            add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btn = (JButton) e.getSource();
                    MenuLogic.MainMenuFactory.makeSelect(btn.getText());
                    setVisible(false);
                }
            });
        }
    }
}
