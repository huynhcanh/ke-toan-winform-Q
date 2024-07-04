/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.helper;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ImageUploader extends JFrame {
    
    public static ImageUploader imageUploader = null;
    
    private String imagePath;
    private JLabel imageLabel;

    public String getImagePath() {
        return imagePath;
    }
    
    public ImageUploader(JLabel imageLabel) {

        // Create file chooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose an image file");

        // Set file filter to accept only image files
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String extension = getExtension(f);
                if (extension != null) {
                    if (extension.equals("jpeg") || extension.equals("jpg") || extension.equals("png") || extension.equals("gif") || extension.equals("bmp")) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }

            @Override
            public String getDescription() {
                return "Image files (*.jpeg, *.jpg, *.png, *.gif, *.bmp)";
            }

            private String getExtension(File f) {
                String ext = null;
                String s = f.getName();
                int i = s.lastIndexOf('.');

                if (i > 0 && i < s.length() - 1) {
                    ext = s.substring(i + 1).toLowerCase();
                }
                return ext;
            }
        });

        // Show open dialog and get the file
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            imagePath = selectedFile.getAbsolutePath(); // Save the image path

            try {
                // Read the image from the file
                BufferedImage bufferedImage = ImageIO.read(selectedFile);

                // Display the image in the label
                ImageIcon imageIcon = new ImageIcon(bufferedImage);
                imageLabel.setIcon(imageIcon);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error: Unable to open image file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}