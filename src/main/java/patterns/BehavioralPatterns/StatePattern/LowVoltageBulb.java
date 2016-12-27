package main.java.patterns.BehavioralPatterns.StatePattern;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class LowVoltageBulb implements Lamp {

    private boolean isOn;

    LowVoltageBulb() {
        System.out.println("Low voltage bulb enabled");
    }

    @Override
    public void on() {
        isOn = true;
        System.out.println("Low voltag bulb is on");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Low voltage bulb is off");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
