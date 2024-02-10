// to compile the code, use: javac Main.java
// to execute: java Main

import javax.swing.*;
import java.awt.*;
import com.ui.VideoUploaderApp;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Drive Gardian");
        
        ImageIcon customIcon = new ImageIcon("assets/icon.png");
        frame.setIconImage(customIcon.getImage());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(1000, 700);
        
        DarkModeConfig.configureDarkMode(frame); // sets background to dark

        // Set the layout manager for the content pane
        frame.setLayout(new BorderLayout());

        HeaderPanel headerPanel = new HeaderPanel();
        frame.getContentPane().add(headerPanel, BorderLayout.NORTH);

        VideoUploaderApp.VideoUploaderButton(frame); // "Upload Video" button
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make sure the frame is updated and visible
        frame.revalidate();
        frame.repaint();

        frame.setVisible(true);
    }
}

class DarkModeConfig {
    public static void configureDarkMode(JFrame frame) {
        Color darkColor = new Color(30, 30, 30);
        frame.getContentPane().setBackground(darkColor);

        UIManager.put("OptionPane.background", darkColor);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
    }
}

class HeaderPanel extends JPanel {

    public HeaderPanel() {
        setOpaque(false);
        
        // Add a JLabel for the header image
        JLabel headerLabel = new JLabel();
        ImageIcon headerImage = new ImageIcon("assets/header.png");
        headerLabel.setIcon(headerImage);

        // Set the preferred size of the header image
        headerLabel.setPreferredSize(new Dimension(500, 200));

        // Add the header label to this panel
        add(headerLabel);
    }
}