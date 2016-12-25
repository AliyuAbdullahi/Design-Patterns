package CreationalPatterns.FactoryPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class FactoryTest {
    public static void main(String... args) {
        SoftDrinkPump pump = new SoftDrinkPump();

        pump.setCoffeeVolume(10);
        pump.setCokeVolume(10);

        pump.brewCoffee(7);
    }
}
