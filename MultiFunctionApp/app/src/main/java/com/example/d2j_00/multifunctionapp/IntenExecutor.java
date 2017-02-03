package com.example.d2j_00.multifunctionapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntenExecutor extends AppCompatActivity {
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inten_executor);

        Button btn = (Button) findViewById(R.id.btn_execute);
        Intent intent = getIntent();
        operator = intent.getStringExtra(MainActivity.Extra);
        if (operator.equals("browse")) {
            btn.setText("Buka Broser");

        } else if (operator.equals("phone")) {
            btn.setText("Hubungi no telp");
        }else if(operator.equals("map")){
            btn.setText("Buka Peta");
        }

    }

    public void execute(View view) {
        Intent exeIntent=null;
        EditText txtExec=(EditText) findViewById(R.id.text_exec);
        String exec=txtExec.getText().toString();

        if (operator.equals("browse")) {
            Uri webpage= Uri.parse("http://"+exec);
        exeIntent=new Intent(Intent.ACTION_VIEW,webpage);
        } else if (operator.equals("phone")) {
            Uri number= Uri.parse("tel:"+exec);
            exeIntent = new Intent(Intent.ACTION_DIAL, number);
        }else if(operator.equals("map")){
            Uri gmnIntenUri = Uri.parse("geo:"+exec);
            exeIntent=new Intent(Intent.ACTION_VIEW,gmnIntenUri);

        }
        startActivity(exeIntent);
    }

}