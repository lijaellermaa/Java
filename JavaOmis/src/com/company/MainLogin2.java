package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainLogin2 extends JFrame {
    private JButton button = new JButton("Click");
    private JTextField input = new JTextField("");
    private JLabel label = new JLabel("Login:");
    private JTextField input1 = new JTextField("");
    private JLabel label1 = new JLabel("Password:");

    public MainLogin2() {
        super("Login form");
        this.setBounds(0, 0, 1920, 1080);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 0, 25));
        container.add(label);
        container.add(input);
        container.add(label1);
        container.add(input1);

        button.addActionListener(new ButtonEventListener1());
        container.add(button);
    }

    class ButtonEventListener1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button clicked\n";
            message += "Login is " + input.getText() + "\n";
            message += "Password is " + input1.getText() + "\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
