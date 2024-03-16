package org.kendaraan;

/**
 * File: Kendaraan.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */


public class Kendaraan{
    protected String nama;
    protected int kecepatan;

    public Kendaraan(String nama){
        this.nama = nama;
        this.kecepatan = 0;

    }

    public String getNama(){
        return this.nama;
    }
    public int getKecepatan(){
        return this.kecepatan;
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void cetakInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Kecepatan : " + this.kecepatan);
    }

    public void gas(int kecepatan, int durasi) {
        this.kecepatan = kecepatan;
        this.kecepatan = this.kecepatan + durasi;
    }

    public void berhenti(){
        this.kecepatan = 0;
    }

    public void klakson(){
        System.out.println(this.nama + "berbunyi");
    }
}
