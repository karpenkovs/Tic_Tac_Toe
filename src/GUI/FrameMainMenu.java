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
    //private List<JButton> buttons = new ArrayList<>();
    public static JButton btn;

    public FrameMainMenu() {
        super("Tic-Tac Toe");

        Dimension dimension = new Dimension(250,80);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,400);
        setLocationRelativeTo(null);
        setVisible(true);

        BoxLayout boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        this.setLayout(boxLayout);

        Font font = new Font("Arial", Font.PLAIN, 16);

        for (int i = 0; i < NAMES.length; i++) {
            JButton button = new JButton(NAMES[i]);
            button.setMaximumSize(dimension);
            //button.setAlignmentX(CENTER_ALIGNMENT);
            button.setFont(font);
            this.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    btn = (JButton) e.getSource();
                    MenuLogic.MainMenuFactory.makeSelect(btn.getText());
                    setVisible(false);
                }
            });
           // buttons.add(button);
        }
    }
}
