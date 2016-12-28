package main.java.patterns.BehavioralPatterns.StatePattern;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class NoPowerRoomState implements RoomState {

    @Override
    public boolean highPowerSupplied() {
        return false;
    }

    @Override
    public boolean mediumPowerSupplied() {
        return false;
    }

    @Override
    public boolean noPowerSupply() {
        return true;
    }

    @Override
    public void setPower(boolean state) {

    }

    @Override
    public void printSate() {
        System.out.println("All power is off in the room");
    }
}
