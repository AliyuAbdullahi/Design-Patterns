package main.java.patterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public class Mp3Handler implements Handler<String> {

    private Handler handler;
    private String fileContent;

    public Mp3Handler(String file) {
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
        if (object.endsWith(Constants.MP3_SUFFIX)) {
            System.out.println("|> Playing " + this.fileContent);
            System.out.println("   Media Format: mp3");
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
                System.out.print(".:");
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
            setHandler(new Mp4Handler(this.fileContent));
        }
    }

    @Override
    public String getName() {
        return Constants.MP3_HANDLER;
    }
}
