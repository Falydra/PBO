import java.lang.Math;

public class Garis {
    Titik P1 = new Titik();
    Titik P2 = new Titik();


    public Garis (Titik P1, Titik P2) {
        this.P1 = P1;
        this.P2 = P2;
    }


    double getPanjang(Titik A, Titik B){
        double P = Math.pow(B.absis - A.absis, 2);
        double Q = Math.pow(B.ordinat - A.ordinat, 2);
        return Math.sqrt(P + Q);


    }

    double getGradien(Titik A, Titik B) {
        double Pem = B.ordinat - A.ordinat;
        double Pen =  B.absis - A.absis;

        return  Pem/Pen;
    }

    double getRefleksiY(Titik A) {
        return A.absis * (-1);
    }

    boolean isTegakLurus(Garis G1, Garis G2) {
        return G1.getGradien(P1, P2) * G2.getGradien(P1, P2) == -1;
    }





}
