

/**
* File: Asersi.java
* Nama: Daffa Aly Meganendra
* NIM : 24060122140140
* Deskripsi: Program untuk menunjukkan asersi
*/

public class Asersi{
  public static void main(String[] args){
    double jariJari = 0;

    assert jariJari > 0 : "Jari-jari harus lebih besar dari 0";    
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeliling();
    System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
  }
}