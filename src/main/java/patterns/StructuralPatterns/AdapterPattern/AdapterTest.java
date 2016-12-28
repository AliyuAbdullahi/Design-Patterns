package main.java.patterns.StructuralPatterns.AdapterPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class AdapterTest {
    public static void run(String... args) {
        Socket threeMouthWallSocket = new ThreeMouthWallSocket();
        Wire wire = new TwoPointsWire();

        SocketAdapter adapter = new SocketAdapter(4);

        adapter.adaptTo(wire, threeMouthWallSocket);

        wire.connectToSocket(adapter);
    }
}
