package org.truk;
import org.kendaraan.Kendaraan;


/**
 * File: Truk.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 */

public class Truk extends Kendaraan{
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getKapasitasMuatan() {
        return this.kapasitasMuatan;
    }
    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }
    public int getBeratMuatan(){
        return this.beratMuatan;
    }

    public void setBeratMuatan(int beratMuatan){
        this.beratMuatan = beratMuatan;
    }



    public void cetakInfo(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Kecepatan : " + this.kecepatan);
        System.out.println("Kapasitas Muatan : " + this.kapasitasMuatan);
        System.out.println("Berat Muatan : " + this.beratMuatan);
    }

    public void klakson(){
        System.out.println(this.nama + "berbunyi, Honk Honk!");
    }

}
