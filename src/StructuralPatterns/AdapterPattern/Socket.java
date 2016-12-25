package StructuralPatterns.AdapterPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public interface Socket {
    int numberOfSocketPoints();
    boolean hasThreeMouthPoint();
    boolean hasTwoMouthPoint();
    boolean canConnect();
}
