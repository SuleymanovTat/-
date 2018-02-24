package ru.suleymanovtat.testtaskapplication;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String MESSAGE_KEY = "MESSAGE_KEY";
    private TextView tvShowMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvShowMessage = findViewById(R.id.tvShowMessage);
        Button btnSearchInternet = findViewById(R.id.btnSearchInternet);
        btnSearchInternet.setOnClickListener(this);
        Intent intentMessage = getIntent();
        if (intentMessage != null) {
            tvShowMessage.setText(intentMessage.getStringExtra(MESSAGE_KEY));
        }
    }

    @Override
    public void onClick(View v) {
        Intent searchIntent = new Intent(Intent.ACTION_WEB_SEARCH);
        searchIntent.putExtra(SearchManager.QUERY, tvShowMessage.getText());
        startActivity(searchIntent);
    }
}
