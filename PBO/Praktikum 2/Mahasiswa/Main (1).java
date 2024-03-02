import org.mahasiswa.*;
import org.walimahasiswa.*;

//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2

class Main {
  public static void main(String[] args) {
      WaliMahasiswa wali = new WaliMahasiswa("Rizky", "123456789", "08123456789", "Jl. Ngesrep");
      Mahasiswa mahasiswa = new Mahasiswa("Budi", "123456789", "Jawa", "Sunda",  wali);
      mahasiswa.tampilkanData();
  }
}