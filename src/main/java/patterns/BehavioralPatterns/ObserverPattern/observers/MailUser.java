package main.java.patterns.BehavioralPatterns.ObserverPattern.observers;

import main.java.patterns.BehavioralPatterns.ObserverPattern.subjects.Subject;

/**
 * Created by aliyuabdullahi on 12/27/16.
 */
public class MailUser implements Observer<String> {

    private Subject subject;
    private String userIdentity;
    private String mail;

    public MailUser(Subject subject, String otherInfo) {
        if (subject == null) {
            throw new IllegalArgumentException("No Subject Mailing platform found");
        }
        this.subject = subject;
        this.userIdentity = otherInfo;
    }

    @Override
    public void subscribe() {
        try {
            System.out.print("Subscribing \n" + userIdentity + " to mail\n" + subject.subjectContent());
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(200);
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.subject.subscribe(this);
        System.out.println("Subscribed successfully!");
    }

    @Override
    public void unSubscribe() {
        try {
            System.out.print("Subscribing " + userIdentity + " to " + subject.subjectContent());
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(500);
            System.out.print(".");
            Thread.sleep(200);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.subject.unSubscribe(this);
        System.out.println("Subscribed successfully!");
    }

    @Override
    public void update(String content) {
        this.mail = content;
        showMailContent();
    }

    private void showMailContent() {
        System.out.println();
        System.out.println("New Mail available!\n");
        System.out.println("Mail: \n" + mail);
    }
}
