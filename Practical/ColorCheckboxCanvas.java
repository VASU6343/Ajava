import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorCheckboxCanvas extends JFrame implements ItemListener {
    private JCheckBox redCheckbox;
    private JCheckBox greenCheckbox;
    private JCheckBox blueCheckbox;
    private JCheckBox grayCheckbox; // Corrected from JCheckbox to JCheckBox
    private JPanel canvas;

    public ColorCheckboxCanvas() {
        // Set up the frame
        setTitle("Color Checkbox Canvas");
        setSize(200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize checkboxes
        redCheckbox = new JCheckBox("Red");
        greenCheckbox = new JCheckBox("Green");
        blueCheckbox = new JCheckBox("Blue");
        grayCheckbox = new JCheckBox("Gray"); // Fixed name to grayCheckbox

        // Add item listeners to checkboxes
        redCheckbox.addItemListener(this);
        greenCheckbox.addItemListener(this);
        blueCheckbox.addItemListener(this);
        grayCheckbox.addItemListener(this); // Fixed to use grayCheckbox

        // Initialize canvas
        canvas = new JPanel();
        canvas.setPreferredSize(new Dimension(150, 150)); // Increased size for better visibility
        canvas.setBackground(Color.BLACK);

        // Add components to the frame
        add(redCheckbox);
        add(greenCheckbox);
        add(blueCheckbox);
        add(grayCheckbox);
        add(canvas);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        updateCanvasColor();
    }

    private void updateCanvasColor() {
        int red = redCheckbox.isSelected() ? 255 : 0;
        int green = greenCheckbox.isSelected() ? 255 : 0;
        int blue = blueCheckbox.isSelected() ? 255 : 0;

        // Set gray to be equal if all colors are not selected
        int gray = grayCheckbox.isSelected() ? 128 : 0; // Gray color intensity

        Color newColor = new Color(red, green, blue);
        // If gray is selected, set the background to gray, else set it to the chosen color
        canvas.setBackground(grayCheckbox.isSelected() ? new Color(gray, blue, red) : newColor);
    }

    public static void main(String[] args) {
        // Create and display the frame
        ColorCheckboxCanvas frame = new ColorCheckboxCanvas();
        frame.setVisible(true);
    }
}
