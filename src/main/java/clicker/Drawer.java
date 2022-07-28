package clicker;

import clicker.clickerUpgrades.ClickerUpgrade;
import clicker.passiveUpgrades.PassiveUpgrade;

import javax.swing.*;
import java.awt.*;
/*TODO
-arrange everything
-add "clicks per second" indicator
-add nicer ui
-balance upgrades
 */
public class Drawer {
    public static Cookie cookie = new Cookie();

    public static void main(String args[]) {
       run();
    }

    private static void run() {
            createFrame();
    }

    private static void createFrame() {
        JFrame frame = new JFrame("Clicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(1920, 1080));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.pack();
        //
        frame.add(Cookie.cookiePanel());
        frame.add(ClickerUpgrade.clickerUpgradePanel());
        frame.add(PassiveUpgrade.passiveUpgradePanel());
        frame.setVisible(true);
        //
    }
}
