package clicker;

import javax.swing.*;
import java.awt.*;

public class Cookie extends Component {
    public static double cookiesClicked = 0;
    public static double cookiesToAdd = 1;

    //Refactoring: Components spaced with // could be own methods
    public static JPanel cookiePanel() {
        JPanel panel = new JPanel();
        GridBagLayout gbl = new GridBagLayout();
        panel.setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();
        JButton cookieButton = new JButton("Cookie");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 40;
        gbc.weightx = 0.0;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(cookieButton, gbc);
        //
        JLabel cookieCounter= new JLabel("Cookies:" + cookiesClicked);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 40;
        gbc.weightx = 0.0;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(cookieCounter, gbc);
        //
        cookieButton.addActionListener(e -> {
            cookiesClicked += cookiesToAdd;
            cookieCounter.setText("Cookies:" + cookiesClicked);
        });
        //
        panel.setBounds(685, 0, 1920/3, 1080);
        panel.setOpaque(false);
        return panel;
    }
}
