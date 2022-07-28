package Clicker.PassiveUpgrades;

import Clicker.Upgrade;

import javax.swing.*;
import java.awt.*;

public abstract class PassiveUpgrade extends Upgrade {

    public double cookiesToAdd;

    public PassiveUpgrade(String name, String description, double cookiesToAdd) {
        super(name, description);
        this.name = name;
        this.description = description;
        this.cookiesToAdd = cookiesToAdd;
    }

    public static JPanel passiveUpgradePanel() {
        return new JPanel(new FlowLayout(FlowLayout.RIGHT));
    }
}
