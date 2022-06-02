package Clicker.ClickerUpgrades;

import Clicker.Upgrade;

import javax.swing.*;
import java.awt.*;

import static javax.swing.SwingConstants.LEFT;

public abstract class ClickerUpgrade extends Upgrade {

    public double multiplier;

    public ClickerUpgrade(String name, String description, double multiplier) {
        super(name, description);
        this.name = name;
        this.description = description;
        this.multiplier = multiplier;
    }

    public static JPanel clickerUpgradePanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(Basic.upgradeButton());
        panel.setOpaque(false);
        return panel;
    }
}
