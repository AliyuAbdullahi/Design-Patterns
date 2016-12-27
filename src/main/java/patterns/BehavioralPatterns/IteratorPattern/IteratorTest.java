package main.java.patterns.BehavioralPatterns.IteratorPattern;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class IteratorTest {
    public static void run(String[] args) {
       Flower[] flowers = FlowerGenerator.generateFlowers(7);

       FlowerCollection collection = new FlowerCollection(flowers);

       while (collection.hasNext()) {
           System.out.println(collection.next());
       }
    }
}
