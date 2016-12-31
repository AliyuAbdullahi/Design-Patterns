package main.java.patterns.StructuralPatterns.AdapterPattern.assessories;

import main.java.patterns.StructuralPatterns.AdapterPattern.assessories.Socket;

/**
 * Created by aliyuabdullahi on 12/25/16.
 */
public interface Wire {

    int numberOfPoints();

    void connectToSocket(Socket socket);
}

