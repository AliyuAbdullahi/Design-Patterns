package main.java.patterns.StructuralPatterns.AdapterPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class SocketAdapter implements Socket {
    private int numberOfTerminals;

    public SocketAdapter(int numberOfPoints) {
        this.numberOfTerminals = numberOfPoints;
    }

    @Override
    public int numberOfSocketPoints() {
        return numberOfTerminals;
    }

    @Override
    public boolean hasThreeMouthPoint() {
        return true;
    }

    @Override
    public boolean hasTwoMouthPoint() {
        return true;
    }

    @Override
    public boolean canConnect() {
        return numberOfTerminals > 0;
    }

    public void adaptTo(Wire wire, Socket socket) {
        if(canConnect()) {
            if (socket.hasTwoMouthPoint() && wire.numberOfPoints() == 3) {
                plugToSocket(3);
            }
            else if (socket.hasThreeMouthPoint() && wire.numberOfPoints() == 2) {
                plugToSocket(2);
            }
            else{
                System.out.println("It's a perfect match, you probably don't need adapter for this");
            }
        }else{
            System.out.println("Adapter is bad and cannot connect");
        }

    }

    public void plugToSocket(int numberOfPoints) {
        System.out.println("Adapter can be  Plugged to " + numberOfPoints + " points Socket");
        try {
            Thread.sleep(1000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void connectToWire(int numberOfPoints) {
        System.out.println("Connected to " + numberOfPoints + " wire");
    }
}
