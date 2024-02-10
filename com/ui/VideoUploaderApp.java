package com.ui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

public class VideoUploaderApp {
    public static void VideoUploaderButton(JFrame frame) {
        JButton uploadButton = new JButton("Upload Video");

        Color ceruleanBlue = new Color(8, 124, 167);
        Color aeroBlue = new Color(5, 178, 220);

        uploadButton.setBackground(ceruleanBlue);
        uploadButton.setForeground(Color.WHITE); // text color
        uploadButton.setFont(new Font("Arial", Font.BOLD, 16));
        uploadButton.setBorderPainted(false);

        uploadButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                uploadButton.setBackground(aeroBlue); // change color on hover
            }

            @Override
            public void mouseExited(MouseEvent e) {
                uploadButton.setBackground(ceruleanBlue); // revert to default color when not hovered
            }
        });

        frame.getContentPane().add(uploadButton);

        uploadButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser(); // opens the file chooser dialog
            fileChooser.setFileFilter(new FileNameExtensionFilter("MP4 Videos", "mp4"));
            int result = fileChooser.showOpenDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
                JOptionPane.showMessageDialog(frame, "Selected file: " + selectedFilePath); // temporary - needs to be replaced to show the actual video in the end.
            }
        });

        frame.revalidate();
        frame.repaint();

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