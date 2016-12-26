package main.StructuralPatterns.AdapterPattern;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public class SocketTest {
    public static void main(String... args) {
        Socket threeMouthWallSocket = new ThreeMouthWallSocket();
        Wire wire = new TwoPointsWire();

        SocketAdapter adapter = new SocketAdapter(4);

        adapter.adaptTo(wire, threeMouthWallSocket);

        wire.connectToSocket(adapter);
    }
}
