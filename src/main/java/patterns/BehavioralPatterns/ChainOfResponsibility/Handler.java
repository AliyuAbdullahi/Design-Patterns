package main.java.patterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public interface Handler<T> {

    void setHandler(Handler handler);
    void processContent(T object);
    String getName();
}
