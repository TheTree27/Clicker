package clicker.clickerUpgrades;

import clicker.Upgrade;

import javax.swing.*;
import java.awt.*;

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
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.setBounds(0, 0, 1920/3, 1080);
        panel.setOpaque(true);
        return panel;
    }
}
