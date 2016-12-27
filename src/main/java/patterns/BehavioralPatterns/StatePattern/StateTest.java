package main.java.patterns.BehavioralPatterns.StatePattern;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class StateTest {
    public static void run(String[] args) {
       BedRoom room = new BedRoom(new BrightRoomState(), new SixtyWattBulb());
       room.setLamp(new Lantern());
       room.setRoomState(new NoPowerRoomState());
       room.setRoomState(new LowPoweredRoomState());
    }
}
