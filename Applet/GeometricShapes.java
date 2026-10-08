import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GeometricShapesApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.WHITE);

        // Line
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 200, 50);

        // Rectangle
        g.setColor(Color.BLUE);
        g.drawRect(50, 80, 150, 80);

        // Circle
        g.setColor(Color.RED);
        g.drawOval(250, 50, 100, 100);

        // Square
        g.setColor(Color.GREEN);
        g.drawRect(250, 180, 100, 100);

        // Oval
        g.setColor(Color.ORANGE);
        g.drawOval(50, 200, 150, 80);

        // Triangle
        g.setColor(Color.MAGENTA);

        int[] xPoints = {250, 200, 300};
        int[] yPoints = {350, 280, 280};

        g.drawPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Geometric Shapes");

        GeometricShapesApplet shapes = new GeometricShapesApplet();

        frame.add(shapes);

        frame.setSize(400, 450);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
