package main.java.patterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public interface Player {
    void play();
    void setHandler(Handler handler);
    String getName();
}
