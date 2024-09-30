import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSelectionApp extends JFrame implements ActionListener {
    private JTextArea textArea;

    public MenuSelectionApp() {
        // Set up the frame
        setTitle("Menu Selection App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize the text area
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create menus
        JMenu fileMenu = createFileMenu();
        JMenu editMenu = createEditMenu();
        JMenu helpMenu = createHelpMenu();

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Add menu bar to the frame
        setJMenuBar(menuBar);
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");

        // Create menu items
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");

        // Add action listeners
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);

        // Add menu items to file menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        return fileMenu;
    }

    private JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Edit");

        // Create menu items
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        // Add action listeners
        cutItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        // Add menu items to edit menu
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        return editMenu;
    }

    private JMenu createHelpMenu() {
        JMenu helpMenu = new JMenu("Help");

        // Create menu item
        JMenuItem aboutItem = new JMenuItem("About");

        // Add action listener
        aboutItem.addActionListener(this);

        // Add menu item to help menu
        helpMenu.add(aboutItem);

        return helpMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the action command (the text of the menu item)
        String actionCommand = e.getActionCommand();
        // Display the action command in the text area
        textArea.append("Selected: " + actionCommand + "\n");
    }

    public static void main(String[] args) {
        // Create and display the frame
        MenuSelectionApp frame = new MenuSelectionApp();
        frame.setVisible(true);
    }
}
