/**
* File: Lingkaran.java
* Nama: Daffa Aly Meganendra
* NIM : 24060122140140
* Deskripsi: Program untuk menunjukkan asersi pada atribut jarijari pada sebuah lingkaran
*/

class Lingkaran {
  private double jariJari;

  public Lingkaran(double jariJari) {
    this.jariJari = jariJari;
  }

  public double hitungKeliling() {
    double keliling = 2 * Math.PI * this.jariJari;
    return keliling;
  }



}

