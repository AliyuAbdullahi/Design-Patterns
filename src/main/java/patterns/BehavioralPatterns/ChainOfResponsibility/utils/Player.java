package main.java.patterns.BehavioralPatterns.ChainOfResponsibility.utils;

import main.java.patterns.BehavioralPatterns.ChainOfResponsibility.handlers.Handler;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public interface Player {

    void play();

    void setHandler(Handler handler);

    String getName();
}
