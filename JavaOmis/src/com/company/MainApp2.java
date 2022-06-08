package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainApp2 extends JFrame {
    private JButton button = new JButton("Click");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("1");
    private JRadioButton radio2 = new JRadioButton("2");
    private JCheckBox check = new JCheckBox("Check", false);

    public MainApp2() {
        super("Example form");
        this.setBounds(0, 0, 1920, 1080);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 0, 25));
        Font myFont1 = new Font("Serif", Font.BOLD, 25);
        label.setFont(myFont1);
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        container.add(label, BorderLayout.CENTER);
        label.setBorder(BorderFactory.createMatteBorder(8, 4, 4, 4, Color.RED));

        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button clicked\n";
            message += "Text from input is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio1 " + "is selected\n" : "Radio2 " + "is selected\n");
            message += ("Checkbox " + (check.isSelected() ? "checked" + " status" : "unchecked" + " status"));
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
