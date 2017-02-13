package com.adenugroho.aplikasikeuangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    String strShow="";
    TextView txtShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtShow=(TextView)findViewById(R.id.txt_show);

        TransaksiHelper dbHelper=new TransaksiHelper(this);
        List<Transaksi> listTrans=dbHelper.getTransaksi();

        for (int i=0;i<listTrans.size();i++){
            Transaksi trans=listTrans.get(i);
            strShow +="Nama\n"+trans.nama+"\n";
            strShow +="Jenis\n"+trans.jumlah+"\n";
            strShow +="Keteragamnn"+trans.keterangan+"\n";


        }
        txtShow.setText(strShow);
    }
    public void tambahs (View view){
        Intent intent = new Intent(this, FormTransaksi.class);
        startActivityForResult(intent,1);
    }

}
