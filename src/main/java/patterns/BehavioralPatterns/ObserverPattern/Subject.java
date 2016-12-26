package main.java.patterns.BehavioralPatterns.ObserverPattern;

/**
 * Created by aliyuabdullahi on 12/26/16.
 */
public interface Subject<T> {

    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notifyAllObservers();

    T subjectContent();

    void setContent(T newValue);
}
