import static java.lang.Math.PI;

/**
 * File: Lingkaran.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */
public class Lingkaran {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return  PI*jejari*jejari;
    }
}
