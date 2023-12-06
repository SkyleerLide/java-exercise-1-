/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpanesample;

/**
 *
 * @author 14
 */
import javax.swing.*;

public class JOptionPaneSample {

    
    public static void main(String[] args) {
        
        String x = JOptionPane.showInputDialog("Enter a value of x: ");
        String y = JOptionPane.showInputDialog("Enter a value of y: ");
        double x2= Double.parseDouble(x);
        double y2= Double.parseDouble(y);
        
        double z = x2 + y2;
        
        JOptionPane.showMessageDialog(null, "Z = x + y = " + z);
        }
        
    }
