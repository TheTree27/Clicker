package Clicker;

import javax.print.DocFlavor;

public abstract class Upgrade {
    public String name;
    public String description;

    public Upgrade(String name, String description) {
        this.name = name;
        this.description = description;
    }
}