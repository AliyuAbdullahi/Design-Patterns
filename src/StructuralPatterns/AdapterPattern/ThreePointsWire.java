package StructuralPatterns.AdapterPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class ThreePointsWire implements Wire {
    @Override
    public int numberOfPoints() {
        return 3;
    }

    private boolean compatible() {
        return numberOfPoints() == 3;
    }

    @Override
    public void connectToSocket(Socket socket) {
        if (socket.canConnect() && compatible()) {
            System.out.println("Three points wire plugged ---|=");
        }
    }
}
