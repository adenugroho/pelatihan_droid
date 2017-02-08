package com.example.d2j_00.multifunctionapp;

import android.content.Intent;
import android.content.IntentSender;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String Extra ="com.example";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMessage(View view){
        //contoh explicit intent
        Intent intent=new Intent(this, ShowMessage.class);
        TextView txtMessage=(TextView) findViewById((R.id.txt_message));
        intent.putExtra(Extra,txtMessage.getText().toString());
        startActivity(intent);

    }
    public void showEmail(View view){
        //contoh explicit intent
        Intent intent=new Intent(this, activity_send_email.class);
        TextView txtMessage=(TextView) findViewById((R.id.txt_message));
        intent.putExtra(Extra,txtMessage.getText().toString());
        startActivity(intent);

    }
    public void openBrowser(View view){
        //membuka activity yang akan di buka di ekplisit intent

        Intent intent=new Intent(this,IntenExecutor.class);
        intent.putExtra(Extra,"browse");
        startActivity(intent);

    }
    public void  openPhone(View view){
        //membuka activity yang akan mengeksukusi implicit intent
        Intent intent=new Intent(this,IntenExecutor.class);
        intent.putExtra(Extra,"phone");
        startActivity(intent);
    }
    public void  openPeta(View view){
        //membuka activity yang akan mengeksukusi implicit intent
        Intent intent=new Intent(this,IntenExecutor.class);
        intent.putExtra(Extra,"map");
        startActivity(intent);
    }

}
