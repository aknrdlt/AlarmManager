package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;


public class AlertReceiver extends BroadcastReceiver {
    public static MediaPlayer mediaPlayer;
    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer = MediaPlayer.create(context, R.raw.shapeofyou);
        if(MainActivity.isStopped){
            MainActivity.mTextView.setText("It's time!!!");
            mediaPlayer.start();
            MainActivity.isStopped = false;
        }
    }
}
