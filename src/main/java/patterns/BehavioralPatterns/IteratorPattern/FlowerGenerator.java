package main.java.patterns.BehavioralPatterns.IteratorPattern;

import java.util.Random;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class FlowerGenerator {
    public static Flower[] generateFlowers(int numberOfFlowers) {
        String[] flowerNames = {"Rose", "Hibiscus", "Sun Flower", "Sun Rose", "Evil Flower"};
        Flower[] flowers = new Flower[numberOfFlowers];
        for (int i = 0; i < numberOfFlowers; i++) {
            int flowerType = new Random().nextInt(flowerNames.length - 1);
            Flower flower = new Flower(flowerNames[flowerType], String.valueOf(i));
            flowers[i] = flower;
        }

        return flowers;
    }
}
