package Clicker;

import javax.swing.*;
import java.awt.*;

public class Drawer {
    private static CookieListener cookieListener = new CookieListener();
    public static int cookiesClicked = 0;

    public static void main(String args[]) {
       run();
    }

    private static void run() {
            createFrame();
            SwingUtilities.invokeLater(Drawer::cookieButton);
    }

    private static void createFrame() {
        JFrame frame = new JFrame("Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(1920, 1080));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        //
        frame.add(cookieButton());
        //
        frame.add(cookieCounter());
        //
        frame.setVisible(true);
        //
    }
    private static JButton cookieButton() {
        JButton button = new JButton("Cookie");
        button.setBounds(955, 540, 400, 400);
        button.addActionListener(cookieListener);
        return button;
    }
    public static JLabel cookieCounter() {
        JLabel counter = new JLabel("Cookies:" + cookiesClicked);
        counter.setBounds(1000, 1000, 400, 100);
        counter.repaint();
        return counter;
    }
}
