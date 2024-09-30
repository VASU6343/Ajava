import javax.swing.*;
import java.awt.*;

public class CircleFrame extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dimensions of the panel
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        // Circle properties
        int radius = 100;
        int diameter = radius * 2;
        int circleX = (panelWidth - diameter) / 2;
        int circleY = (panelHeight - diameter) / 2;

        // Draw the circle
        g.drawOval(circleX, circleY, diameter, diameter);

        // Text properties
        String name = "Vasu Sapariya";
        Font font = new Font("Arial", Font.PLAIN, 20);
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();

        // Calculate position for the text
        int textWidth = fm.stringWidth(name);
        int textX = (panelWidth - textWidth) / 2;
        int textY = (panelHeight + fm.getAscent()) / 2;

        // Draw the text
        g.drawString(name, textX, textY);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Example");
        CircleFrame circleFrame = new CircleFrame();
        frame.add(circleFrame);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
