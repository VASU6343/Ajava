import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnhancedCameraAppFrame extends JFrame {
    private JButton captureButton;
    private JButton clearButton;
    private JTextArea statusArea;
    private int captureCount = 0;

    public EnhancedCameraAppFrame() {
        setTitle("Camera App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Capture button
        captureButton = new JButton("Capture");
        captureButton.addActionListener(new CaptureButtonListener());

        // Clear button
        clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> statusArea.setText(""));

        // Status area
        statusArea = new JTextArea(10, 30);
        statusArea.setEditable(false);

        // Add components to the frame
        add(captureButton);
        add(clearButton);
        add(new JScrollPane(statusArea));

        setVisible(true);
    }

    private class CaptureButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            captureCount++;
            // Simulate capturing an image
            statusArea.append("Capture button pressed!\n");
            statusArea.append("Simulating image capture...\n");
            statusArea.append("Image captured (simulated). Capture count: " + captureCount + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EnhancedCameraAppFrame::new);
    }
}
