package com.example.android.Views;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.example.android.R;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Space Traders");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ImageView background1 = findViewById(R.id.background1);
        final ImageView background2 = findViewById(R.id.background2);
        final ImageView background3 = findViewById(R.id.background3);
        final ImageView background4 = findViewById(R.id.background4);
        final ValueAnimator animate = ValueAnimator.ofFloat(0.0f, 1.0f);
        animate.setRepeatCount(ValueAnimator.INFINITE);
        animate.setInterpolator(new LinearInterpolator());
        animate.setDuration(40000L);
        animate.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                final float progress = (float) animation.getAnimatedValue();
                final float width = background1.getWidth();
                final float translationX = width * progress;
                background1.setTranslationX(translationX);
                background2.setTranslationX(translationX - width);
                background3.setTranslationX(translationX);
                background4.setTranslationX(translationX - width);
            }
        });
        animate.start();

        Button startNew = findViewById(R.id.start_new_button);
        startNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (StartUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
