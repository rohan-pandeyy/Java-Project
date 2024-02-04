package com.ui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VideoUploaderApp {
    public static void VideoUploaderButton(JFrame frame) {
        JButton uploadButton = new JButton("Upload Video");
        uploadButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser(); // opens the file chooser dialog
            fileChooser.setFileFilter(new FileNameExtensionFilter("MP4 Videos", "mp4"));
            int result = fileChooser.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(frame, "Selected file: " + selectedFilePath); // temporary - needs to be replaced to show the actual video in the end.
            }
        });

        Box horizontalBox = Box.createHorizontalBox();
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(Box.createVerticalGlue());
        horizontalBox.add(Box.createHorizontalGlue());
        horizontalBox.add(uploadButton);
        horizontalBox.add(Box.createHorizontalGlue());
        verticalBox.add(horizontalBox);
        verticalBox.add(Box.createVerticalGlue());
        frame.add(verticalBox);
    }
}