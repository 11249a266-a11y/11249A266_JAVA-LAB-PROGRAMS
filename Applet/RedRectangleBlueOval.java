import javax.swing.*;
import java.awt.*;

public class AppletMessage extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Red rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 200, 100);

        // Blue oval
        g.setColor(Color.BLUE);
        g.fillOval(300, 50, 150, 100);

        // Message in bold
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 100, 220);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet Message");
        AppletMessage panel = new AppletMessage();

        frame.add(panel);
        frame.setSize(550, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
