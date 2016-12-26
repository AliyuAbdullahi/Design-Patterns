package main.java.patterns.StructuralPatterns.AdapterPattern;


/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class TwoPointsWire implements Wire {
    @Override
    public int numberOfPoints() {
        return 2;
    }

    private boolean compatible() {
        return numberOfPoints() == 2;
    }

    @Override
    public void connectToSocket(Socket socket) {
        if (socket.canConnect() && compatible()) {
            System.out.println("Two points wire plugged ---|=");
        }
    }
}
