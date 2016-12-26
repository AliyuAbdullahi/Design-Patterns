package CreationalPatterns.BuilderPattern;

/**
 * Created by aliyuabdullahi on 12/26/16.
 */
public class BuilderTest {

    public static void main(String... args) {
        ArmouredTank monsterTank = new ArmouredTank.Builder()
                .setName("Monster Tank one")
                .setNumberOfPassengers(5)
                .setGrenadeLunchEnabled(false)
                .setWeightInPounds(50000)
                .setHasTopCover(false)
                .build();

        ArmouredTank violator = new ArmouredTank.Builder()
                .setName("ViolatorX")
                .setNumberOfPassengers(3)
                .setGrenadeLunchEnabled(true)
                .setWeightInPounds(40000)
                .setHasTopCover(true)
                .setMaximumGrenadeDamage(50000)
                .build();

        System.out.println(monsterTank);
        System.out.println();
        System.out.println(violator);
    }
}
