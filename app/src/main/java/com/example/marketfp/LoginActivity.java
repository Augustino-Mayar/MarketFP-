package com.example.marketfp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(v -> {
            // Perform login authentication (you'll implement this part)
            // For demo, assume login is successful
            startActivity(new Intent(LoginActivity.this, MarketActivity.class));
            finish();
        });

        Button othersButton = findViewById(R.id.social_icons);
        othersButton.setOnClickListener(v -> startActivity(new Intent(LoginActivity.this, SlideshowActivity.class)));
    }
}
