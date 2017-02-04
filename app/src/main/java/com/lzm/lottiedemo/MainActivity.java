package com.lzm.lottiedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animationView = (LottieAnimationView) findViewById(R.id.animation_view);
        animationView.setAnimation("LottieLogo1.json");
        animationView.loop(true);


        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        animationView.setProgress(0f);
        animationView.playAnimation();
    }

    @Override
    protected void onStop() {
        super.onStop();
        animationView.cancelAnimation();
    }
}

