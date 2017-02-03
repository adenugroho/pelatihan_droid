package com.example.d2j_00.multifunctionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent intent= getIntent();
        String message=intent.getStringExtra(MainActivity.Extra);
        TextView messageArea=(TextView) findViewById(R.id.message_area);
        messageArea.setText(message);
    }
}
