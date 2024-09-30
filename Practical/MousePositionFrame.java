import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousePositionFrame extends JPanel implements MouseMotionListener {
    private int mouseX = 0;
    private int mouseY = 0;

    public MousePositionFrame() {
        // Set the size of the panel
        setPreferredSize(new Dimension(500, 300));
        // Add mouse motion listener to the panel
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Clear the panel
        g.clearRect(0, 0, getWidth(), getHeight());
        // Display the mouse position
        g.setColor(Color.BLACK);
        g.drawString("Mouse Position: (" + mouseX + ", " + mouseY + ")", 10, 20);
        // Draw a 15x10 pixel rectangle filled with black at the current mouse position
        g.fillRect(mouseX, mouseY, 15, 10);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Update mouse position
        mouseX = e.getX();
        mouseY = e.getY();
        // Repaint the panel
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Update mouse position
        mouseX = e.getX();
        mouseY = e.getY();
        // Repaint the panel
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Position Tracker");
        MousePositionFrame mousePositionFrame = new MousePositionFrame();
        frame.add(mousePositionFrame);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
