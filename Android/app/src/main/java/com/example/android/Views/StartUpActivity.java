package com.example.android.Views;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.android.Entity.Player;
import com.example.android.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Space Traders");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button startNew = findViewById(R.id.start_new_button);
        Button loadButton = findViewById(R.id.load_game_button);
        startNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (StartUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        loadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (StartUpActivity.this, ConfigureCompleteActivity.class);
                try {
                    System.out.println("trying to load");
                    File directory = new File(getCacheDir(), "Player.ser");
                    FileInputStream fileIn = new FileInputStream(directory);
                    ObjectInputStream in = new ObjectInputStream(fileIn);
                    Player player = (Player) in.readObject();
                    in.close();
                    fileIn.close();
                } catch (IOException i) {
                    System.out.println("IOException");
                } catch (ClassNotFoundException c) {
                    System.out.println("class not found");
                    c.printStackTrace();
                }

                startActivity(intent);
            }
        });
    }

}
