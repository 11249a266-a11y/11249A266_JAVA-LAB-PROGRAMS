import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class HumanFace extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 250, 250);

        // Eyes
        g.setColor(Color.BLACK);
        g.fillOval(160, 120, 30, 40);
        g.fillOval(260, 120, 30, 40);

        // Nose
        g.drawLine(225, 150, 210, 210);
        g.drawLine(210, 210, 230, 210);

        // Mouth
        g.drawArc(170, 190, 110, 70, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");

        frame.add(new HumanFace());
        frame.setSize(450, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
