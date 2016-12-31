package main.java.patterns.StructuralPatterns.FacadePattern.gunusers;

import main.java.patterns.StructuralPatterns.FacadePattern.guns.Gun;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class Soldier {

    private boolean isPrepared = false;
    private Gun gun;

    public Soldier(Gun gun) {
        this.gun = gun;
    }

    public void prepare() {
        gun.clean();
        gun.loadBullets();
        gun.unJam();
        gun.cock();

        isPrepared = true;
    }

    public void fire() {
        if (isPrepared) {
            gun.aim();
            gun.shoot();
        } else {
            isPrepared = false;
            System.out.println("Solder is not ready yet, prepare and fire");
        }
    }
}
