package StructuralPatterns.AdapterPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class ThreeMouthWallSocket implements Socket {
    private boolean canPlugWire;

    @Override
    public int numberOfSocketPoints() {
        return 1;
    }

    @Override
    public boolean hasThreeMouthPoint() {
        return true;
    }

    @Override
    public boolean hasTwoMouthPoint() {
        return false;
    }

    @Override
    public boolean canConnect() {
        return hasThreeMouthPoint();
    }

    public void plugWire() {
        if (canPlugWire) {
            System.out.println("Wire plugged ---|=");
        }
    }
}
