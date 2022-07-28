package Clicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cookie extends Component {
    public static double cookiesClicked = 0;
    public static double cookiesToAdd = 1;

    public static JPanel cookiePanel() {
        JPanel panel = new JPanel();
        JButton cookieButton = new JButton("Cookie");
        cookieButton.setBounds(955, 540, 400, 400);

        JLabel cookieCounter= new JLabel("Cookies:" + cookiesClicked);
        cookieCounter.setBounds(1000, 1000, 400, 100);
        //
        cookieButton.addActionListener(e -> {
            cookiesClicked += cookiesToAdd;
            cookieCounter.setText("Cookies:" + cookiesClicked);
        });
        panel.add(cookieButton);
        panel.add(cookieCounter);
        panel.setOpaque(false);
        return panel;
    }
}
