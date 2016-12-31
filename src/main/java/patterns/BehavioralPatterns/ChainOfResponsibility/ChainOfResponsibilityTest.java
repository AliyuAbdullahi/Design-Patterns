package main.java.patterns.BehavioralPatterns.ChainOfResponsibility;

import main.java.patterns.BehavioralPatterns.ChainOfResponsibility.globals.PlayList;
import main.java.patterns.BehavioralPatterns.ChainOfResponsibility.utils.MediaPlayer;

/**
 * Created by aliyuabdullahi on 12/28/16.
 */
public class ChainOfResponsibilityTest {

    public static void run() {
        MediaPlayer player = new MediaPlayer(PlayList.LOVE_SONG);
        player.play();
    }
}
