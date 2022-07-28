package clicker.passiveUpgrades;

import clicker.Upgrade;
import clicker.clickerUpgrades.Basic;

import javax.swing.*;
import java.awt.*;

public class PassiveUpgrade extends Upgrade {

    public double cookiesToAdd;

    public PassiveUpgrade(String name, String description, double cookiesToAdd) {
        super(name, description);
        this.name = name;
        this.description = description;
        this.cookiesToAdd = cookiesToAdd;
    }

    public static JPanel passiveUpgradePanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(Basic.upgradeButton());
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.setBounds(1370, 0, 1920/3, 1080);
        panel.setOpaque(true);

        return panel;
    }
}
