package com.example.d2j_00.tipscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tips(View view)
    {
        EditText btn1=(EditText) findViewById(R.id.btn1);
        EditText btn2=(EditText) findViewById(R.id.btn2);
        EditText btn3=(EditText) findViewById(R.id.btn3);



        double angka1,angka2,angka3;
        angka1 = Double.parseDouble(btn1.getText().toString());
        angka2 = Double.parseDouble(btn2.getText().toString());
        angka3 = Double.parseDouble(btn3.getText().toString());
String btn="";

btn="Tips"+(angka1*(angka2/100))+"\n";
        btn +="Total"+(angka1+(angka1*(angka2/100)))+"\n";
        btn +="per orang"+((angka1+(angka1*(angka2/100)))/angka3)+"\n";


        //lengkapi perkalian dan pembagian
        //menambahkan elemen di layout dan main activity
        //logika kalkulasinya
        TextView result=(TextView) findViewById(R.id.txtbtn);
        result.setText(btn);
    }

}
