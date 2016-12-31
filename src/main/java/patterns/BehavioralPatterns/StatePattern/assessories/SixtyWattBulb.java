package main.java.patterns.BehavioralPatterns.StatePattern.assessories;


/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class SixtyWattBulb implements Lamp {

    private boolean isOn;

    public SixtyWattBulb() {
        System.out.println("Sixty Watt Bulb enabled...");
    }

    @Override
    public void on() {
        isOn = true;
        System.out.println("Sixty Watt Bulb is on");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Sixty Watt Bulb is off");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
