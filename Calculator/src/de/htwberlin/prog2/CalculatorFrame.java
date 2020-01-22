package de.htwberlin.prog2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Mohammed AbuJarour (mohammed.abujarour@htw-berlin.de)
 *
 */
public class CalculatorFrame extends JFrame {

    public CalculatorFrame() {
        super();
        this.setSize(150,250);
        this.setLocation(200, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = initTopPanel();
        JPanel mainPanel = initMainPanel();
        
        this.getContentPane().add(topPanel, BorderLayout.NORTH);
        this.getContentPane().add(mainPanel, BorderLayout.CENTER);
    }

  
    private JPanel initMainPanel() {

        JPanel panel = new JPanel();
        panel.setBackground(new Color(231,255,190));
        return panel;
    }


    private JPanel initTopPanel() {
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(179,215,255));
        return panel;
    }
}
