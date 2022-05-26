package Clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CookieListener extends JFrame implements ActionListener {

    public CookieListener() {
        this.setTitle("Cookie");
        this.setSize(400, 400);
        JPanel panel = new JPanel();
    }

    @Override
    public void actionPerformed(ActionEvent cookieClicked) {
        Drawer.cookiesClicked++;
        Drawer.cookieCounter();
    }
}
