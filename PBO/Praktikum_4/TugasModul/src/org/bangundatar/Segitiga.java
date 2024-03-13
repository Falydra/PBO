/**
 * File: Segitiga.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */
package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

}
