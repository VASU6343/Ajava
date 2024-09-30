import javax.swing.*;
import java.awt.*;

public class RectangleFrame extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Dimensions of the panel
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Rectangle properties
        int rectWidth = 300;
        int rectHeight = 100;
        int startX = (panelWidth - rectWidth) / 2;
        int startY = (panelHeight - rectHeight) / 2;

        // Fill the rectangle with color from left to right
        for (int i = 0; i < rectWidth; i++) {
            // Calculate the color gradient from black to red
            g.setColor(new Color(i * 255 / rectWidth, 0, 0));
            g.drawLine(startX + i, startY, startX + i, startY + rectHeight);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Gradient Rectangle");
        RectangleFrame rectangleFrame = new RectangleFrame();
        frame.add(rectangleFrame);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
