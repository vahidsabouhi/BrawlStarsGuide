package com.example.vm2team.brawlstarsguide;

import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class wlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wlc);

        Animation animation1= AnimationUtils.loadAnimation(wlc.this,R.anim.wlcanimation);
        ImageView rahnama=(ImageView)findViewById(R.id.rahnama);
        ImageView version=(ImageView)findViewById(R.id.version);
        rahnama.startAnimation(animation1);
        version.startAnimation(animation1);

        Animation animation2= AnimationUtils.loadAnimation(wlc.this,R.anim.wlcanimationn);
        ImageView the=(ImageView)findViewById(R.id.the);
        the.startAnimation(animation2);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(wlc.this,menu.class));
            }
        }, 4000);
    }
}
