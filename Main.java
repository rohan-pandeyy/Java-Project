// to compile the code, use: javac Main.java
// to execute: java Main

import javax.swing.filechooser.FileNameExtensionFilter;
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

        DarkModeConfig.configureDarkMode(frame); // sets background to dark

        VideoUploaderApp.VideoUploaderButton(frame);
        
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

class VideoUploaderApp {
    public static void VideoUploaderButton(JFrame frame) {
        JButton uploadButton = new JButton("Upload Video");
        uploadButton.addActionListener(e -> {
            // Open a file chooser dialog to select the MP4 file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("MP4 Videos", "mp4"));
            int result = fileChooser.showOpenDialog(frame);

             // If a file was selected, display its name
            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(frame, "Selected file: " + selectedFilePath);
            }
        });

        // Add the "Upload Video" button to the center of the frame
        frame.add(uploadButton, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}