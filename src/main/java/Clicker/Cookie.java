package Clicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cookie {
    public static int cookiesClicked = 0;

    public Cookie() {
        JButton cookieButton = new JButton("Cookie");
        cookieButton.setBounds(955, 540, 400, 400);
        JLabel cookieCounter= new JLabel("Cookies:" + cookiesClicked);
        cookieCounter.setBounds(1000, 1000, 400, 100);
        //
        cookieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cookiesClicked++;
                cookieCounter.setText("Cookies:" + cookiesClicked);
            }
        });
    }
}
