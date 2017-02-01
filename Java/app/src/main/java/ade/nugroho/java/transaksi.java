package ade.nugroho.java;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 01/02/2017.
 */
public class transaksi {
    private ArrayList<barang> listbarang=new ArrayList<>();

    public void addBarang(barang Barang){
        this.listbarang.add(Barang);
    }
    public int totalTransalsi(){
        int hasil=0;
        for(int i=0; i< listbarang.size();i++){
            hasil+=listbarang.get(i).getHarga();

        }
        return hasil;
    }
    public  String  printTransaksi(){
        String text="BArang yang di beli:\n";
        text+="------------------\n";
        for(int i=0;i<listbarang.size();i++){
            text +=listbarang.get(i).toString();
        }
        text +="----------------\n";
        text +="total pembelian"+totalTransalsi()+"\n";
        text +="----------------\n";
return text;
    }

    public double averageTransaksi(){

        double hasil=0;
        //for(int i=0; i< listbarang.size();i++)
       // {
         //   hasil+=listbarang.get(i).getHarga();
       // }
        //hasil=hasil/listbarang.size();
        return  hasil=totalTransalsi()/listbarang.size();
    }
    public String maxBarang(){
        barang max;
        max=listbarang.get(0);
        for(int i=0;i< listbarang.size();i++)
        {
        if(listbarang.get(i).getHarga ()> max.getHarga()){
            max = listbarang.get(i);
        }
        }

String namabarang=max.getNama();
       // String namabarang="";
        String text="Barang termahal pada transaksi"+namabarang;
        return text;
    }

}
