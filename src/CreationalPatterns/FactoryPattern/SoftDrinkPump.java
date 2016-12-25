package CreationalPatterns.FactoryPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */

/**
 * {@code SoftDrinkPump} is an adapter that allows User to fetch either Coffee or Coke from drinking machine
 */
public class SoftDrinkPump implements CokePump, CoffeePump {
    private static final String COFFEE_DRINK = "Coffee";
    private static final String COKE_DRINK = "Coke";
    private double coffeeVolume;
    private double cokeVolume;

    public double getCoffeeVolume() {
        return coffeeVolume;
    }

    public void setCoffeeVolume(double coffeeVolume) {
        this.coffeeVolume = coffeeVolume;
    }

    public double getCokeVolume() {
        return cokeVolume;
    }

    public void setCokeVolume(double cokeVolume) {
        this.cokeVolume = cokeVolume;
    }

    @Override
    public void brewCoffee(double volume) {
        pumpDrink(this.coffeeVolume, volume, DrinkType.COFFEE);
    }

    @Override
    public void pumpCoffee(double volume) {
        this.coffeeVolume += volume;
    }

    @Override
    public boolean canPumpCoke() {
        return cokeVolume > 0;
    }

    @Override
    public void collectCoke(double volume) {
        pumpDrink(this.cokeVolume, volume, DrinkType.COKE);
    }

    @Override
    public boolean canPumpCoffee() {
        return coffeeVolume > 0;
    }

    private void pumpDrink(double totalVolume, double extractVolume, DrinkType drinkType) {
        if (totalVolume - extractVolume > 0) {
            try {
                System.out.print("Preparing " + drinkType.drinkType + ".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println();
                System.out.println("Volume of " + drinkType.drinkType + " available  :   " + totalVolume);
                Thread.sleep(300);
                System.out.println("Volume of " + drinkType.drinkType + " obtained   :   " + extractVolume);
                if (drinkType.drinkType.equals(COFFEE_DRINK)) {
                    this.coffeeVolume -= extractVolume;
                    System.out.println("Volume of " + drinkType.drinkType + " remaining  :   " + this.coffeeVolume);
                } else {
                    this.cokeVolume -= extractVolume;
                    System.out.println("Volume of " + drinkType.drinkType + " remaining  :   " + this.cokeVolume);
                }

                Thread.sleep(300);
                System.out.println("Enjoy your " + drinkType.drinkType);
                System.out.println();
                System.out.println("          `~ ");
                System.out.println("        `~ ~ `~");
                System.out.println("       /|------|");
                System.out.println("      | |      |");
                System.out.println("      \\ |      |");
                System.out.println("        |      |");
                System.out.println("        |      |");
                System.out.println("        \\______/");

            } catch (Exception e) {

            }
        } else {
            if (drinkType.drinkType.equals(COFFEE_DRINK)) {
                System.out.println(drinkType.drinkType + " is empty in tank, add some " + drinkType.drinkType + "and brew :)-");
            } else if (drinkType.drinkType.equals(COKE_DRINK)) {
                System.out.println(drinkType.drinkType + " is empty in tank, add some " + drinkType.drinkType + "and pump :)-");

            }
        }
    }

    private enum DrinkType {
        COFFEE("Coffee"),
        COKE("Coke");

        DrinkType(String type) {
            this.drinkType = type;
        }

        private String drinkType;
    }
}
