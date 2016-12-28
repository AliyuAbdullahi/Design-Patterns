package main.java.patterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public class MediaPlayer implements Media {

    private Handler handler;
    private String file;

    public MediaPlayer(String file) {
        this.file = file;
        this.handler = new Mp3Handler(file);
    }

    @Override
    public void play() {
        handler.processContent(file);
    }
}
