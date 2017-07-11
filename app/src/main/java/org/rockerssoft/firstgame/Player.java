package org.rockerssoft.firstgame;

import android.graphics.Bitmap;
import android.view.animation.Animation;

/**
 * Created by bobby on 10/20/15.
 */
public class Player extends GameObject {
    private Bitmap spritesheet;
    private int score;
    private int dya;
    private boolean playing;
    private Animation animation = new Animation();
    private long startTime;

    public Player(Bitmap res, int w, int h, int numFrames){
        x = 100;
        y = GamePanel.HEIGHT/2;
        dy = 0;
        score = 0;
        height = h;
        width = w;

        Bitmap[] image new Bitmap(numFrames);

        for(int i = 0; i < image.length; i++){

        }
    }

}
