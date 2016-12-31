package main.java.patterns.StructuralPatterns.FacadePattern.guns;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class Ak47 implements Gun {

    private boolean isJammed;
    private static double BULLET_IMPACT = 100;
    int numberOfBullets = 60;

    @Override
    public int numberOfBullets() {
        return numberOfBullets;
    }

    @Override
    public void loadBullets() {
        numberOfBullets = 60;
    }

    @Override
    public void addBullet(int numberOfBullets) {
        if (numberOfBullets + numberOfBullets > 60) {
            numberOfBullets = 60;
        } else
            numberOfBullets += numberOfBullets;
    }

    @Override
    public void unJam() {
        this.isJammed = false;
    }

    @Override
    public void shoot() {
        if (numberOfBullets > 0) {
            System.out.println("Shooting...");
        } else {
            isJammed = true;
            try {
                System.out.println("Click!");
                Thread.sleep(500);
                System.out.println("Click!");
                Thread.sleep(500);
                System.out.println("Gun is jammed, check the cartridge for bullets");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void clean() {
        System.out.print("Cleaning Gun");
        try {
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Gun cleaned and ready to go!");
    }

    @Override
    public void cock() {
        System.out.println("Crack! Gun is ready to fire...");
    }

    @Override
    public void aim() {
        try {
            System.out.print("Acquiring target");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            System.out.println();
            System.out.println("Target Acquired[ -|- ]");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void drop() {
        System.out.println("Gun dropped");
    }

    @Override
    public void removeBullet(int numberOfBullets) {
        this.numberOfBullets -= numberOfBullets;
    }

    @Override
    public void emptyBullets() {
        this.numberOfBullets = 0;
    }

    @Override
    public boolean isJammed() {
        return isJammed;
    }

    @Override
    public void setJammed(boolean jam) {
        isJammed = jam;
    }

    @Override
    public double bulletImpact() {
        return BULLET_IMPACT;
    }
}
