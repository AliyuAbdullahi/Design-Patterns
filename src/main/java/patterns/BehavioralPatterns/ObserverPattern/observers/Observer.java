package main.java.patterns.BehavioralPatterns.ObserverPattern.observers;

/**
 * Created by aliyuabdullahi on 12/26/16.
 */
public interface Observer<T> {

    void subscribe();

    void unSubscribe();

    void update(T content);
}
