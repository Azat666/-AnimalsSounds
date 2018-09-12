package com.example.azat.sounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView cat, dog;
    private MediaPlayer catSound, dogSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFindViews();
        createMediaPlayer();
        imageClice();
    }

    private void setFindViews() {
        cat = findViewById(R.id.image1);
        dog = findViewById(R.id.image2);
    }

    private void createMediaPlayer() {
        catSound = MediaPlayer.create(this, R.raw.cat);
        dogSound = MediaPlayer.create(this, R.raw.dog);
    }

    private void imageClice() {
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                sounds(catSound);
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                sounds(dogSound);
            }
        });
    }

    private void sounds(final MediaPlayer s) {
        s.start();
    }
}
