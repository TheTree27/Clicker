package Clicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cookie extends Component {
    public static int cookiesClicked = 0;

    public static JPanel cookiePanel() {
        JPanel panel = new JPanel();
        JButton cookieButton = new JButton("Cookie");
        cookieButton.setBounds(955, 540, 400, 400);

        JLabel cookieCounter= new JLabel("Cookies:" + cookiesClicked);
        cookieCounter.setBounds(1000, 1000, 400, 100);
        //
        cookieButton.addActionListener(e -> {
            cookiesClicked++;
            cookieCounter.setText("Cookies:" + cookiesClicked);
        });
        panel.add(cookieButton);
        panel.add(cookieCounter);
        return panel;
    }
}
