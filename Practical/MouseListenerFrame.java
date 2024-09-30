import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListenerFrame extends JPanel {
    private boolean isPressed = false;
    private int mouseX = 0;
    private int mouseY = 0;

    public MouseListenerFrame() {
        setPreferredSize(new Dimension(500, 300));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                isPressed = true;
                mouseX = e.getX();
                mouseY = e.getY();
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                isPressed = false;
                mouseX = e.getX();
                mouseY = e.getY();
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Clear the panel
        g.clearRect(0, 0, getWidth(), getHeight());
        if (isPressed) {
            // Draw a red circle at the mouse position when pressed
            g.setColor(Color.yellow);
            g.fillOval(mouseX - 10, mouseY - 10, 20, 20);
        } else {
            // Draw a blue circle at the mouse position when released
            g.setColor(Color.BLACK);
            g.fillOval(mouseX - 10, mouseY - 10, 20, 20);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener Example");
        MouseListenerFrame mouseListenerFrame = new MouseListenerFrame();
        frame.add(mouseListenerFrame);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
