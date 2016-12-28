package main.java.patterns.CreationalPatterns.FactoryPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class FactoryTest {

    public static void run() {
        SoftDrinkFactory pump = new SoftDrinkFactory();

        pump.setCoffeeVolume(10);
        pump.setCokeVolume(10);

        pump.brewCoffee(7);
    }
}
