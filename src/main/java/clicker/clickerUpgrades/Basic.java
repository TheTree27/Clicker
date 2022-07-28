package clicker.clickerUpgrades;

import clicker.Cookie;

import javax.swing.*;

public class Basic extends ClickerUpgrade {

    static String name = "Basic";
    static String description = "A Test Upgrade";
    static double multiplier = 2;
    static int timesBought = 0;

    public Basic(String name, String description, double multiplier) {
        super(name, description, multiplier);
        this.name = name;
        this.description = description;
        this.multiplier = multiplier;
    }

    public static JButton upgradeButton() {
        JButton upgradeButton = new JButton("Basic");
        upgradeButton.setBounds(955, 540, 400, 400);

        JLabel upgradeLabel= new JLabel("Basic " + timesBought);
        //
        upgradeButton.addActionListener(e -> {
            timesBought++;
            upgradeLabel.setText("Basic " + timesBought);
            Cookie.cookiesToAdd *= multiplier;
       });
        return upgradeButton;
    }
}
