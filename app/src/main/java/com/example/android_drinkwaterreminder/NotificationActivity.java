package com.example.android_drinkwaterreminder;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        TextView textView = findViewById(R.id.text_vieuw);

        String message = getIntent().getStringExtra("message");
        textView.setText(message);
    }
}