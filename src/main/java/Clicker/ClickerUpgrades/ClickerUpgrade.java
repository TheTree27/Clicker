package Clicker.ClickerUpgrades;

import Clicker.Upgrade;

public abstract class ClickerUpgrade extends Upgrade {

    public double multiplier;

    public ClickerUpgrade(String name, String description, double multiplier) {
        super(name, description);
        this.name = name;
        this.description = description;
        this.multiplier = multiplier;
    }
}
