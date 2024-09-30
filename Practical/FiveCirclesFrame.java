import javax.swing.*;
import java.awt.*;

public class FiveCirclesFrame extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dimensions of the panel
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Circle properties
        int radius = 50;
        int diameter = radius * 2;
        int numCircles = 5;

        // Calculate the starting position for the first circle
        int startX = (panelWidth - diameter) / 2;
        int startY = (panelHeight - (numCircles * diameter)) / 2;

        // Set the color to green
        g.setColor(Color.GREEN);

        // Draw five circles in a vertical column
        for (int i = 0; i < numCircles; i++) {
            int y = startY + i * diameter;
            g.drawOval(startX, y, diameter, diameter);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Five Circles Example");
        FiveCirclesFrame circlesFrame = new FiveCirclesFrame();
        frame.add(circlesFrame);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
