package BmiCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class View {
    int width;
    int hight;
    JPanel panel;
    JFrame frame;
    JLabel label;
    JTextField height;
    JTextField weight;

    public View() {
        this.width = 200;
        this.hight = 200;
        frame = new JFrame();
        frame.setTitle("入力フォーム");
        frame.setBounds(100, 100, width, hight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        label = new JLabel();

        height = new JTextField("身長", 20);
        weight = new JTextField("体重");
        JButton button = new JButton("計算する");
//        button.addActionListener(this);

        panel.add(height);
        panel.add(weight);
        panel.add(button);

        panel.setLayout(null);

        Container contentPane = frame.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        label.setText(height.getText() + weight.getText());
    }
}
