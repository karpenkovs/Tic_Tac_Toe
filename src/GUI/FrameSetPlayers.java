package GUI;

import sun.text.resources.cldr.ia.FormatData_ia;

import javax.swing.*;
import java.awt.*;

public class FrameSetPlayers extends JFrame {

    public FrameSetPlayers() {
        super("Tic-Tac Toe");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 300);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));


        Box box1 = Box.createHorizontalBox();
        ButtonGroup group1 = new ButtonGroup();
        JRadioButton radioButtonHumanPlayerX = new JRadioButton("Human");
        JRadioButton radioButtonPCPlayerX = new JRadioButton("PC");

        group1.add(radioButtonHumanPlayerX);
        group1.add(radioButtonPCPlayerX);
        box1.add(radioButtonHumanPlayerX);
        box1.add(radioButtonPCPlayerX);
        box1.setBorder(BorderFactory.createTitledBorder("Player X"));
        add(box1);
        box1.setAlignmentX(0);

        JTextField textField1 = new JTextField();
        textField1.setMaximumSize(new Dimension(180, 25));
        add(textField1);


        Box box2 = Box.createHorizontalBox();
        ButtonGroup group2 = new ButtonGroup();
        JRadioButton radioButtonHumanPlayerO = new JRadioButton("Human");
        JRadioButton radioButtonPCPlayerO = new JRadioButton("PC");

        group2.add(radioButtonHumanPlayerO);
        group2.add(radioButtonPCPlayerO);
        box2.add(radioButtonHumanPlayerO);
        box2.add(radioButtonPCPlayerO);
        box2.setBorder(BorderFactory.createTitledBorder("Player O"));
        add(box2);
        box2.setAlignmentX(0);


        JTextField textField2 = new JTextField();
        textField2.setMaximumSize(new Dimension(180, 25));
        add(textField2);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setAlignmentY(200);

        JButton buttonCancel = new JButton("Cancel");
        JButton buttonOK = new JButton("OK");
        panel.add(buttonCancel);
        panel.add(buttonOK);

        add(panel);

        setVisible(true);

    }


}
