package main.java.patterns.BehavioralPatterns.StatePattern.states;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class LowPoweredRoomState implements RoomState {

    private boolean hasPower;

    @Override
    public boolean highPowerSupplied() {
        return hasPower;
    }

    @Override
    public boolean mediumPowerSupplied() {
        return hasPower;
    }

    @Override
    public boolean noPowerSupply() {
        return hasPower;
    }

    @Override
    public void setPower(boolean state) {

    }

    @Override
    public void printSate() {
        System.out.println("Power is on");
        System.out.println("Room electric voltage is set to low");
    }
}
