package com.example.d2j_00.listfilm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Formpilihan extends AppCompatActivity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formpilihan);

        Spinner spinner = (Spinner) findViewById(R.id.rating);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ratings, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

    }
    public void tambah(View view){
        String title=((EditText)findViewById(R.id.btn1)).getText().toString();
        int year=Integer.parseInt((((EditText)findViewById(R.id.btn2)).getText().toString()));
        double rating=Double.parseDouble(((Spinner)findViewById(R.id.rating)).getSelectedItem().toString());
        String description=((EditText)findViewById(R.id.btn3)).getText().toString();
        Movie movie=new Movie(title,description,rating,year);

        Intent intent=new Intent();
        intent.putExtra("film result",movie);
        setResult(Activity.RESULT_OK,intent);
        finish();
    }
}
