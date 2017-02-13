package com.adenugroho.aplikasikeuangan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class FormTransaksi extends AppCompatActivity {
    private String [] jenisStr={"Pemasukan","Pengeluaran",};
    private EditText edtNama,edtJumlah,edtKeterangan;
    private Spinner spnJenis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_transaksi);

        spnJenis=(Spinner) findViewById(R.id.spin);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,jenisStr);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spnJenis.setAdapter(adapter);

        edtNama=(EditText)findViewById(R.id.btn1);
        edtJumlah=(EditText)findViewById(R.id.btn2);
        edtKeterangan=(EditText)findViewById(R.id.btn3);

    }
    public void tambah(View view){
        TransaksiHelper dbHelper=new TransaksiHelper(this);
        String nama=edtNama.getText().toString();
        int jenis=spnJenis.getSelectedItemPosition()+1;
        int jumlah=Integer.parseInt(edtJumlah.getText().toString());
        String keterangan=edtKeterangan.getText().toString();

        dbHelper.insertTransaksi(nama,jenis,jumlah,keterangan);
        Log.d("form.transaksi",nama+"-"+Integer.toString(jenis)+"-"+Integer.toString(jumlah)+"-"+keterangan);
        Toast.makeText(this,"Transaksi"+nama+"berhasil di simpan",Toast.LENGTH_SHORT).show();

        startActivity(new Intent(this,MainActivity.class));
    }
}
