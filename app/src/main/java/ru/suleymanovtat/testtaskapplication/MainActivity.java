package ru.suleymanovtat.testtaskapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edText = findViewById(R.id.edText);
        Button btnShowText = findViewById(R.id.btnShowText);
        btnShowText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (isTextValid()) {
            showMessage(edText.getText().toString());
            Intent intentMessage = new Intent(this, SecondActivity.class);
            intentMessage.putExtra(SecondActivity.MESSAGE_KEY, edText.getText().toString());
            startActivity(intentMessage);
        }
    }

    private boolean isTextValid() {
        return !TextUtils.isEmpty(edText.getText().toString().trim());
    }

    private void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
