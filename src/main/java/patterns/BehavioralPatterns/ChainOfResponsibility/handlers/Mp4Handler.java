package main.java.patterns.BehavioralPatterns.ChainOfResponsibility.handlers;

import main.java.patterns.BehavioralPatterns.ChainOfResponsibility.globals.Constants;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public class Mp4Handler implements Handler<String> {

    private Handler handler;
    private String fileContent;

    public Mp4Handler(String file) {
        this.fileContent = file;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
        handler.processContent(fileContent);
    }

    @Override
    public void processContent(String object) {
        this.fileContent = object;
        if (this.fileContent.endsWith(Constants.MP4_SUFFIX)) {
            System.out.println("|> Playing " + this.fileContent);
            System.out.println("   Media Format: mp4");
            try {
                Thread.sleep(500);
                System.out.print(" .");
                Thread.sleep(500);
                System.out.print(".:");
                Thread.sleep(500);
                System.out.print(":");
                Thread.sleep(500);
                System.out.print(":.");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(":.");
                Thread.sleep(500);
                System.out.print(".::");
                Thread.sleep(500);
                System.out.print(":");
                Thread.sleep(500);
                System.out.print(":.");
                Thread.sleep(500);
                System.out.print(".");
                System.out.print(":.");
                Thread.sleep(500);
                System.out.print(".::");
                Thread.sleep(500);
                System.out.print(":");
                Thread.sleep(500);
                System.out.print(":.");
                Thread.sleep(500);
                System.out.print(".");
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("::File " + this.fileContent + " not supported (`=´)");
        }
    }

    @Override
    public String getName() {
        return Constants.MP4_HANDLER;
    }
}
