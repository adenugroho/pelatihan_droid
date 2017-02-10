package com.example.d2j_00.listfilm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public final static String Extra ="com";
    private String [] filmTitles={
                                    };

    private ArrayList<Movie> movies=new ArrayList<>();
    ArrayAdapter<Movie> adapter;
    ListView listView;

//    private void initMovies(){
//        movies.add(new Movie("The Thor","Film tentang Palu yang di bawa orang aneh Untuk perang",7.9,2010));
//        movies.add(new Movie("Harry Phother","Film tentang seseorang yang pandai sulap",8.0,2011));
//        movies.add(new Movie("Inception","Film tentang Orang yang sedang berjalan",8.1,1999));
//        movies.add(new Movie("Angry birds","Film tentang burung yang sedang main",8.0,2018));
//
//
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initMovies();

        adapter=new ArrayAdapter<Movie>(this,android.R.layout.simple_list_item_1,movies);
        ListView listView=(ListView) findViewById(R.id.List_film);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void  onItemClick(AdapterView<?> parent, View view, int position, long id){
                Movie selectedMovie=movies.get(position);
                Intent intent=new Intent(getBaseContext(),DetailActivity.class);
                intent.putExtra("Ade",selectedMovie);
                startActivity(intent);
            }
        });
    }
    public void plus(View view)

    {
        Intent intent = new Intent(this, Formpilihan.class);
        startActivityForResult(intent,1);
    }

    protected void onActivityResult(int requestCode,int result,Intent data){
        if(requestCode==1){
            if(result == Activity.RESULT_OK){
                Movie newMoview=(Movie)data.getSerializableExtra("film result");
                movies.add(newMoview);
               adapter.notifyDataSetChanged();

            }
        }
    }
}
