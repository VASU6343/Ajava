import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToggleButtonFrame extends JFrame implements ActionListener {
    private JButton toggleButton;

    public ToggleButtonFrame() {
        // Initialize the button with the label "start"
        toggleButton = new JButton("start");
        // Add action listener to the button
        toggleButton.addActionListener(this);
        
        // Set up the frame
        setLayout(new java.awt.FlowLayout());
        add(toggleButton);
        setTitle("Toggle Button Example");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Toggle the button label between "start" and "stop"
        if (toggleButton.getText().equals("start")) {
            toggleButton.setText("stop");
        } else {
            toggleButton.setText("start");
        }
    }

    public static void main(String[] args) {
        // Create the frame
        SwingUtilities.invokeLater(ToggleButtonFrame::new);
    }
}
