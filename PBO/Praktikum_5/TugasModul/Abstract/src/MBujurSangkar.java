import java.util.Scanner;

/**
 * File: MBujurSangkar.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */
public class MBujurSangkar {
    public static  void  main(String[]args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
