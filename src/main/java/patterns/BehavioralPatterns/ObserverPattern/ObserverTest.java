package main.java.patterns.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class ObserverTest {

    public static void run(String... args) {
        String testMail = "Subject: Test\nCC: \nBody:\n  Hello all\n How are you doing today? Just checking on you.\n\n";
        String testMail2 = "Subject: Test\nCC: \nBody:\n  Hello \n I am doing fine and thanks for asking.\n\n";
        Subject<String> subject = new MailSubject(new ArrayList<Observer>(), testMail);
        Observer observer = new MailUser(subject, "User: {\n Name: Greg\n Email: gregWon@gmail.com\n}");

        observer.subscribe();

        subject.setContent(testMail2);

        subject.unSubscribe(observer);
    }
}
