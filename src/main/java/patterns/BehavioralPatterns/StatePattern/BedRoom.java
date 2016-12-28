package main.java.patterns.BehavioralPatterns.StatePattern;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class BedRoom  implements Room{

    private RoomState roomState;
    private Lamp lamp;
    private boolean hasElectricSupply;
    private boolean hasLowVoltage;

    public BedRoom(RoomState roomState , Lamp lamp) {
        this.roomState = roomState;
        this.lamp = lamp;
    }

    @Override
    public boolean hasElectricSupply() {
        return hasElectricSupply;
    }

    @Override
    public boolean hasLowVoltageSupply() {
        return hasLowVoltage;
    }

    @Override
    public void setLamp(Lamp lamp) {
        if(lamp instanceof Lantern) {
            System.out.println("Room light switched to lantern, bulb is off");
        } else if(lamp instanceof LowVoltageBulb){
            System.out.println("Room now powered by low power bulb");
        } else if(lamp instanceof SixtyWattBulb){
            if(hasLowVoltageSupply()){
                System.out.println("Sixty Watt bulb cannot be on, voltage is low");
            }else{
                System.out.println("Room powered by Sixty Watt bulb");
            }
        }
        this.lamp = lamp;
    }

    @Override
    public void setRoomState(RoomState roomState) {
        this.roomState = roomState;
        if(hasElectricSupply()){
            lamp.on();
        }else{
            System.out.println("Electric supply absent, lamp off");
            lamp.off();
        }
        roomState.printSate();
    }
}
