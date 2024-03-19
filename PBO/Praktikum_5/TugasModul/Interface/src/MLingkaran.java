import java.util.Scanner;

/**
 * File: MLingkaran.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */
public class MLingkaran {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari: ");
        double jari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jari);
        System.out.println("Luas lingkaran dengan jari-jari " + jari + " adalah " + l.hitungLuas());
    }
}
