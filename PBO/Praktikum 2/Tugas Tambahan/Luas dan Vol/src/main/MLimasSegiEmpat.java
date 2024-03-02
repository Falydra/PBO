import org.bangundatar.SegiTigaSamaSisi;
import org.bangunruang.LimasSegiempat;

//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2

public class MLimasSegiEmpat {
  public static void main(String[] args) {
    SegiTigaSamaSisi segiTigaSamaSisi = new SegiTigaSamaSisi(4, 5);
    LimasSegiempat limasSegiempat = new LimasSegiempat(4, 5, 6);
    System.out.println(
        "Luas: " + limasSegiempat.hitungLuasAlas());
    System.out
        .println("Volume limas segiempat: " + limasSegiempat.hitungVolume());
  }
}