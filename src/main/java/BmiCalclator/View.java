package BmiCalclator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class View implements ActionListener {
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

        height = new JTextField("身長を入力してください", 15);
        weight = new JTextField("体重を入力してください", 15);
        JButton button = new JButton("計算する");
        button.addActionListener(this);

        panel.add(height);
        panel.add(weight);
        panel.add(button);

        Container contentPane = frame.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void graf() {
        DataAccessor da = new DataAccessor();
        List<String[]> data = da.read();

        for (String[] line : data){
            for (String d : line) {
                System.out.println(d);
            }
        }
    }

    public void actionPerformed(ActionEvent e){
        Human human = new Human("guest", Double.parseDouble(height.getText()), Double.parseDouble(weight.getText()));
        double bmi = human.sayBMI();
        DataAccessor da = new DataAccessor();
        da.wright(height.getText(), weight.getText(), bmi);
        graf();
    }
}
