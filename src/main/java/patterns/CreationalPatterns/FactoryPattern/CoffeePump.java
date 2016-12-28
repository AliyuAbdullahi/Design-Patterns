package main.java.patterns.CreationalPatterns.FactoryPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public interface CoffeePump {

    void brewCoffee(double volume);

    void pumpCoffee(double volume);

    boolean canPumpCoffee();
}
