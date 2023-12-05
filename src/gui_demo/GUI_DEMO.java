package gui_demo;

import javax.swing.*;
import java.awt.*;

public class GUI_DEMO {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Students Registration System");
        JPanel panel = createPanel();
        frame.getContentPane().add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    private static JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 1));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel label = new JLabel("Students Registration System");
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(label);

        JLabel nameLabel = new JLabel("Full name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(nameLabel);

        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(300, 50));
        panel.add(field);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(genderLabel);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel.add(radioPanel);

        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 30));
        radioPanel.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 30));
        radioPanel.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel subjectLabel = new JLabel("Favorite Subject");
        subjectLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(subjectLabel);

        JCheckBox math = new JCheckBox("Maths");
        math.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(math);

        JCheckBox phy = new JCheckBox("Physics");
        phy.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(phy);

        JCheckBox pro = new JCheckBox("Programming");
        pro.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(pro);

        JButton button = new JButton("Submit");
        button.setPreferredSize(new Dimension(300, 50));
        button.setFocusPainted(false);
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        panel.add(button);

        return panel;
    }
}

