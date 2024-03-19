/**
 * File: BangunDatar.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */
public abstract class BangunDatar{
    protected double luas;
    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return  luas;
    }
}