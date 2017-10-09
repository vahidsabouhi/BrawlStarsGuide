package com.example.vm2team.brawlstarsguide;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final ImageButton brawlers = (ImageButton) findViewById(R.id.brawlers);
        brawlers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(menu.this, brawlers.class);
                startActivity(in1);
            }
        });
        final ImageButton gems = (ImageButton) findViewById(R.id.gems);
        gems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(menu.this, gems.class);
                startActivity(in2);

            }
        });
        final ImageButton chips = (ImageButton) findViewById(R.id.chips);
        chips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(menu.this, chips.class);
                startActivity(in3);
            }

        });
        final ImageButton coins = (ImageButton) findViewById(R.id.coins);
        coins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in4 = new Intent(menu.this, coins.class);
                startActivity(in4);
            }

        });
        final ImageButton elixir = (ImageButton) findViewById(R.id.elixir);
        elixir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in5 = new Intent(menu.this, elixir.class);
                startActivity(in5);
            }

        });
        final ImageButton trophies = (ImageButton) findViewById(R.id.trophies);
        trophies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in6 = new Intent(menu.this, trophies.class);
                startActivity(in6);
            }
        });
        final ImageButton brawlboxes = (ImageButton) findViewById(R.id.brawlboxes);
        brawlboxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in7 = new Intent(menu.this, brawlboxes.class);
                startActivity(in7);
            }
        });
        final ImageButton controlmodes = (ImageButton) findViewById(R.id.controlmodes);
        controlmodes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in8 = new Intent(menu.this, controlmodes.class);
                startActivity(in8);
            }
        });
        final ImageButton obtainingbrawlers = (ImageButton) findViewById(R.id.obtainingbrawlers);
        obtainingbrawlers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in9 = new Intent(menu.this, obtainingbrawlers.class);
                startActivity(in9);
            }
        });
        final ImageButton levelingupbrawlers = (ImageButton) findViewById(R.id.levelingupbrawlers);
        levelingupbrawlers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in10 = new Intent(menu.this, levelingupbrawlers.class);
                startActivity(in10);
            }
        });
        final ImageButton battlemodes = (ImageButton) findViewById(R.id.battlemodes);
        battlemodes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in11 = new Intent(menu.this, battlemodes.class);
                startActivity(in11);
            }
        });
        final ImageButton beginnersguide = (ImageButton) findViewById(R.id.beginnersguide);
        beginnersguide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in12 = new Intent(menu.this, beginnersguide.class);
                startActivity(in12);
            }
        });
        final ImageButton gamemodes = (ImageButton) findViewById(R.id.gamemodes);
        gamemodes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in13 = new Intent(menu.this, gamemodes.class);
                startActivity(in13);
            }
        });
    }


}





