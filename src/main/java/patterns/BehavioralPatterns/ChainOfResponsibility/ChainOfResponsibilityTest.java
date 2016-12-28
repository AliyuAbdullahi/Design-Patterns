package main.java.patterns.BehavioralPatterns.ChainOfResponsibility;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public class ChainOfResponsibilityTest {

    public static void run() {
        MediaPlayer player = new MediaPlayer(PlayList.LOVE_SONG);
        player.play();
    }
}
