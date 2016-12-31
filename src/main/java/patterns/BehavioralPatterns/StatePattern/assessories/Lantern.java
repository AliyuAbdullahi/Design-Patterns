package main.java.patterns.BehavioralPatterns.StatePattern.assessories;

import main.java.patterns.BehavioralPatterns.StatePattern.assessories.Lamp;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class Lantern implements Lamp {

    private boolean isOn;

    @Override
    public void on() {
        System.out.println("Lantern is on");
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Lantern is off");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
