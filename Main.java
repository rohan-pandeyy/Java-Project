// to compile the code, use: javac Main.java
// to execute: java Main

import javax.swing.*;
import java.awt.*;

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
        
        frame.setLayout(new BorderLayout());

        DarkModeConfig.configureDarkMode(frame);
        
        frame.setVisible(true);
    }
}

class DarkModeConfig {
    public static void configureDarkMode(JFrame frame) {
        frame.getContentPane().setBackground(new Color(30, 30, 30)); 

        UIManager.put("OptionPane.background", new Color(30, 30, 30)); // sets background to dark
        UIManager.put("OptionPane.messageForeground", Color.WHITE); // sets text color to white
    }
}