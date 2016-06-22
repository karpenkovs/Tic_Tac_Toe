package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameGame extends JFrame {

    Game.Board board;
    private JTextArea area;

    public void setTextArea(JTextArea area) {
        this.area = area;
    }

    public FrameGame() {
        super("Tic-Tac Toe");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);


        Font font = new Font("Arial", Font.PLAIN, 16);


        LayoutManager layoutManager = new GridBagLayout();
        setLayout(layoutManager);

        GridBagConstraints gc = new GridBagConstraints();
        Dimension dimension = new Dimension();
        dimension.width = 100;
        dimension.height = 100;
        for (int i = 0; i < 9; i++) {
            JButton button = new JButton("");
            button.setPreferredSize(dimension);

            int x = i / 3;
            int y = i % 3;

            gc.gridx = x;
            gc.gridy = y;

            button.setName(String.valueOf(x) + String.valueOf(y));

            add(button, gc);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton btn = (JButton) e.getSource();
                    String move = btn.getName();

                    char type = Game.WorkWithBoard.makeMove(move);
                    btn.setText(String.valueOf(type));

                    /*
                    if (Game.WorkWithBoard.isGameFinished()) {
                       Players.Player player = Game.GameLogic.calculateWinner();
                        JOptionPane.showMessageDialog(null, "Game Finished. Winner: " + player);
                        area.append("Winner is " + player);
                    }
                    */
                }
            });
        }
    }


}