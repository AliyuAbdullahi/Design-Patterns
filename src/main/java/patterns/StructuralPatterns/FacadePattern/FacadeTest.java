package main.java.patterns.StructuralPatterns.FacadePattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class FacadeTest {

    public static void run(String... args) {
        Gun ak47 = new Ak47();

        Soldier soldier = new Soldier(ak47);

        soldier.prepare();

        soldier.fire();
    }
}
