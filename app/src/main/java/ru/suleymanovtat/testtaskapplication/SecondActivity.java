package ru.suleymanovtat.testtaskapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String MESSAGE_KEY = "MESSAGE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tvShowText = findViewById(R.id.tvShowText);
        Intent intentMessage = getIntent();
        if (intentMessage != null) {
            tvShowText.setText(intentMessage.getStringExtra(MESSAGE_KEY));
        }
    }
}
