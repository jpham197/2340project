package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.example.android.Entity.Player;
import com.example.android.R;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StartUpActivity extends AppCompatActivity {
    private static final String TAG = "StartupActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FirebaseApp.initializeApp(this);
        setTitle("Space Traders");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final Repository repo = new Repository();
        final PlayerViewModel pvm = ViewModelProviders.of(this).get(PlayerViewModel.class);

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    final DatabaseReference ref = database.getReference();
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

        Button loadGame = findViewById(R.id.load_game_button);
        loadGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Read from the database
                ref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // This method is called once with the initial value and again
                        // whenever data at this location is updated.
                        Player value = dataSnapshot.getValue(Player.class);
                            pvm.addPlayer(value);
                            Log.d(TAG, "Value is: " + value);
                    }

                    @Override
                    public void onCancelled(DatabaseError error) {
                        // Failed to read value
                        Log.w(TAG, "Failed to read value.", error.toException());
                    }
                });
                Intent intent = new Intent (StartUpActivity.this, ConfigureCompleteActivity.class);
                startActivity(intent);
            }
        });
    }

}
