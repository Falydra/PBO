package org.bangundatar;
import org.poligon.Poligon;

//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2

public class BujurSangkar extends Poligon 
{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() 
    {
        return this.panjangSisi;
    }
}
