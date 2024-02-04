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
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(1000, 700);
        
        DarkModeConfig.configureDarkMode(frame); // sets background to dark

        VideoUploaderApp.VideoUploaderButton(frame); // "Upload Video" button
        
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