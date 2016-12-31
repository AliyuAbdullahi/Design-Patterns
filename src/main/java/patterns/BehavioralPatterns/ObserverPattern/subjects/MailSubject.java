package main.java.patterns.BehavioralPatterns.ObserverPattern.subjects;

import main.java.patterns.BehavioralPatterns.ObserverPattern.observers.Observer;

import java.util.List;

/**
 * Created by aliyuabdullahi on 12/26/16.
 */
public class MailSubject implements Subject<String> {

    private String mail;
    private List<Observer> observers;

    public MailSubject(List<Observer> observers, String mail) {
        this.observers = observers;
        this.mail = mail;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        int observerPosition = observers.indexOf(observer);
        if (observerPosition >= 0 && observerPosition < observers.size()) {
            observers.remove(observerPosition);
            System.out.println("Observer at position " + observerPosition + " has been removed");
        } else {
            System.out.println("No observer at position " + observerPosition);
        }
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update(mail));
    }

    @Override
    public String subjectContent() {
        return mail;
    }

    @Override
    public void setContent(String mail) {
        this.mail = mail;
        notifyAllObservers();
    }
}
