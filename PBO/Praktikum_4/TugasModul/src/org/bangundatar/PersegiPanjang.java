/**
 * File: PersegiPanjang.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */

package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Panjang bersisi: " + this.getJumlahSisi());
    }
}