import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {

    public static void main(String[] args) {

        JFrame frame = new JFrame("BorderLayout Example");

        frame.setLayout(new BorderLayout());

        JLabel header = new JLabel("HEADER", SwingConstants.CENTER);
        JLabel footer = new JLabel("FOOTER", SwingConstants.CENTER);
        JButton menu = new JButton("MENU");
        JButton east = new JButton("EAST");
        JTextArea content = new JTextArea("CONTENT AREA");

        frame.add(header, BorderLayout.NORTH);
        frame.add(footer, BorderLayout.SOUTH);
        frame.add(menu, BorderLayout.WEST);
        frame.add(east, BorderLayout.EAST);
        frame.add(content, BorderLayout.CENTER);

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
