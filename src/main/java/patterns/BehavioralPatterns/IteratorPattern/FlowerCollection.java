package main.java.patterns.BehavioralPatterns.IteratorPattern;

import java.util.Iterator;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class FlowerCollection implements Iterator<Flower> {
    Flower[] flowers;
    int flowerPosition;

    public FlowerCollection(Flower[] flowers) {
        this.flowers = flowers;
    }

    @Override
    public boolean hasNext() {
        return (flowerPosition < flowers.length) && (flowers[flowerPosition] != null);
    }

    @Override
    public Flower next() {
        return flowers[flowerPosition++];
    }

    @Override
    public void remove() {
        if (flowerPosition < 0) {
            throw new IllegalStateException("Position " + flowerPosition + " is illegal");
        }
        if (flowers[flowerPosition] != null) {

            for (int i = flowerPosition - 1; i < (flowers.length - 1); i++) {
                flowers[i] = flowers[i + 1];
            }

            flowers[flowers.length - 1] = null;
        }
    }
}
