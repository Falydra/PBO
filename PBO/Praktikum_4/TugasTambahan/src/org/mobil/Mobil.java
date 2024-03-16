package org.mobil;

import org.kendaraan.Kendaraan;

/**
 * File: Mobil.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */

public class Mobil extends Kendaraan{
    private int jumlahPintu;


    public Mobil(String nama, int jumlahPintu){
    super(nama);
        this.jumlahPintu = jumlahPintu;

    }

    public int getJumlahPintu(){
        return this.jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;
    }
    public void cetakInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("Jumlah Pintu : " + this.jumlahPintu);
    }

    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu nomor " + nomorPintu + " dibuka");
    }
    public void klakson(){
        System.out.println(this.nama + "berbunyi, Vroom Vroom!");
    }
}