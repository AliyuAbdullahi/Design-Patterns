package main.java.patterns.BehavioralPatterns.StatePattern;

import main.java.patterns.BehavioralPatterns.StatePattern.assessories.Lamp;
import main.java.patterns.BehavioralPatterns.StatePattern.states.RoomState;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public interface Room {

    boolean hasElectricSupply();

    boolean hasLowVoltageSupply();

    void setLamp(Lamp lamp);

    void setRoomState(RoomState roomState);

}
