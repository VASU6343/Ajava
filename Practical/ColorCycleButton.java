import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorCycleButton extends JFrame implements ActionListener {
    private JButton button;
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private int currentColorIndex = 0;

    public ColorCycleButton() {
        // Set up the frame
        setTitle("Color Cycle Button");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Use FlowLayout for better positioning

        // Initialize the button
        button = new JButton("Click me");
        button.setPreferredSize(new Dimension(100, 30)); // Set preferred size
        button.addActionListener(this);

        // Add the button to the frame
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Cycle through the colors
        currentColorIndex = (currentColorIndex + 1) % colors.length;
        button.setBackground(colors[currentColorIndex]);
    }

    public static void main(String[] args) {
        // Create and display the frame
        ColorCycleButton frame = new ColorCycleButton();
        frame.setVisible(true);
    }
}
