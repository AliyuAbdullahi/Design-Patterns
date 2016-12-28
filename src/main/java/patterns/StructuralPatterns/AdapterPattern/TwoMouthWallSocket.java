package main.java.patterns.StructuralPatterns.AdapterPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class TwoMouthWallSocket implements Socket {

    @Override
    public int numberOfSocketPoints() {
        return 1;
    }

    @Override
    public boolean hasThreeMouthPoint() {
        return false;
    }

    @Override
    public boolean hasTwoMouthPoint() {
        return true;
    }

    @Override
    public boolean canConnect() {
        return hasTwoMouthPoint();
    }

}
