package com.example.vm2team.brawlstarsguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class gamemodes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamemodes);
        Intent in13=getIntent();

        final ImageButton overview = (ImageButton) findViewById(R.id.overview);
        overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(gamemodes.this, overview.class);
                startActivity(in1);
            }
        });

        final ImageButton bounty = (ImageButton) findViewById(R.id.bounty);
        bounty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(gamemodes.this, bounty.class);
                startActivity(in2);
            }
        });
        final ImageButton heist = (ImageButton) findViewById(R.id.heist);
        heist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(gamemodes.this, heist.class);
                startActivity(in3);
            }
        });
        final ImageButton showdown = (ImageButton) findViewById(R.id.showdown);
        showdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in4 = new Intent(gamemodes.this, showdown.class);
                startActivity(in4);
            }
        });
        final ImageButton smashgrab = (ImageButton) findViewById(R.id.smashgrab);
        smashgrab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in5 = new Intent(gamemodes.this, smashgrab.class);
                startActivity(in5);
            }
        });


    }
}
