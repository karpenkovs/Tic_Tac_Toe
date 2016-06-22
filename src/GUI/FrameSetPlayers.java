package GUI;

import sun.text.resources.cldr.ia.FormatData_ia;

import javax.swing.*;
import java.awt.*;

public class FrameSetPlayers extends JFrame {

    private String[] PLAYERS = {"Player X", "Player O"};
    private JRadioButton human = new JRadioButton("Human");
    private JRadioButton pc = new JRadioButton("PC");

    public FrameSetPlayers() {
        super("Tic-Tac Toe");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        for (int i = 0; i < PLAYERS.length; i++) {

            JPanel panel = new JPanel();
            BorderLayout borderLayout = new BorderLayout();
            if (i == 0){
                add(panel, BorderLayout.NORTH);
            }else{
                add(panel, BorderLayout.CENTER);
            }


            Box box = getBox();
            box.setBorder(BorderFactory.createTitledBorder(PLAYERS[i]));

            panel.setLayout(borderLayout);
            panel.add(box, BorderLayout.NORTH);

            JTextField textField1 = new JTextField();

            panel.add(textField1, BorderLayout.CENTER);
        }

        add(new JButton("Back to main menu"),BorderLayout.SOUTH);
        setVisible(true);

    }

    private Box getBox(){
        Box box = Box.createHorizontalBox();
           /* ButtonGroup group = new ButtonGroup();
            group.add(human);
            group.add(pc);*/
        box.add(human);
        box.add(pc);
        return box;
    }

}
