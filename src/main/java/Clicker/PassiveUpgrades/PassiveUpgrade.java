package Clicker.PassiveUpgrades;

import Clicker.Upgrade;

public abstract class PassiveUpgrade extends Upgrade {

    public double cookiesToAdd;

    public PassiveUpgrade(String name, String description, double cookiesToAdd) {
        super(name, description);
        this.name = name;
        this.description = description;
        this.cookiesToAdd = cookiesToAdd;
    }
}
