//package Titik;
import java.lang.Math;


//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2

public class Titik {
    public double absis;
    public double ordinat;

    public  Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;

    }

    public Titik () {
        this(0,0 );
    }

    void setAbsis(double abs){
        absis = abs;
    }

    void setOrdinat(double ord) {
        ordinat = ord;
    }

    double getOrdinat() {
        return ordinat;
    }

    double getAbsis () {
        return absis;
    }

    double getJarakPusat(Titik P1, Titik P2) {
        double A = (P2.absis - P1.absis);
        double B = (P2.ordinat - P1.ordinat);
        return Math.sqrt(Math.pow(A, 2) +  Math.pow(B, 2));
    }

    void refleksiX(Titik titik) {
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * (-1);
        titik.setOrdinat(ordinat);
    }

     void refleksiY(Titik titik) {
         double absis = titik.getAbsis();
         absis = absis * (-1);
         titik.setAbsis(absis);
    }

    double getRefleksiX() {
        return this.ordinat = ordinat * (-1);
    }

    double getRefleksiY(){
        return this.absis = absis * (-1);
    }

}





