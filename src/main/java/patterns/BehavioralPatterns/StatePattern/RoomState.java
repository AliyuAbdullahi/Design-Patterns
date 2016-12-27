package main.java.patterns.BehavioralPatterns.StatePattern;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public interface RoomState {
    boolean highPowerSupplied();
    boolean mediumPowerSupplied();
    boolean noPowerSupply();
    void setPower(boolean state);
    void printSate();
}
