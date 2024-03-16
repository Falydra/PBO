package org.motor;
import org.kendaraan.Kendaraan;

/**
 * File: Motor.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */

public class Motor extends Kendaraan{
    private int cc;


    public Motor(String nama, int cc){
        super(nama);
        this.cc = cc;
    }

    public void SepedaMotor(int cc){
        this.nama = getNama();
        this.cc = cc;
    }

    public int getCc(){
        return this.cc;
    }
    public void setCc(int cc){
        this.cc = cc;
    }

    public void cetakInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("CC : " + this.cc);
    }

    public void klakson(){
        System.out.println(this.nama + "berbunyi, Womp Womp!");
    }

}
