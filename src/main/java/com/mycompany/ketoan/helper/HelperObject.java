/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ketoan.helper;

import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class HelperObject {
    
    private static ImageUploader imageElement = null;
    
    public static ImageUploader getInstance(JLabel imageLabel){
        imageElement = new ImageUploader(imageLabel);
        return imageElement;
    }
    
    public static String getPathImageUploader(){
         return imageElement != null ? imageElement.getImagePath().replaceAll("\\\\", "/") : null;
    }
    
    public static void resetImageUploader(){
         imageElement = null;
    }
}
