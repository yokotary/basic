package intro;

import javax.swing.*;
import java.awt.*;

public class  window1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("テスト");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        Container contentPane = frame.getContentPane();

        JLabel label = new JLabel("テスト");//文字列
        label.setHorizontalAlignment(JLabel.CENTER);//文字列中央ぞろえ
        JButton button = new JButton("OK");//ボタン

        contentPane.add(label, BorderLayout.NORTH);
        contentPane.add(button, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
