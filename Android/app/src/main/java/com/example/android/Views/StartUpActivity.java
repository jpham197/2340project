package com.example.android.Views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.android.Entity.Player;
import com.example.android.Model.Repository;
import com.example.android.R;
import com.example.android.ViewModels.PlayerViewModel;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

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
