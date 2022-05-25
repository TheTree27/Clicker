package Clicker;

import javax.swing.*;
import java.awt.*;

public class Drawer {
    public static void main(String args[]) {
        createFrame();
        
    }
    private static void createFrame() {
        JFrame frame = new JFrame("Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(1920, 1080));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
