import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

//Nama: Daffa Aly Meganendra
//NIM : 24060122140140
//LAB : C2

public class MKubus {
  public static void main(String[] args) {
    BujurSangkar bujurSangkar = new BujurSangkar(4);
    Kubus kubus = new Kubus(bujurSangkar);
    System.out.println("Luas: " + kubus.hitungLuasAlas());
    System.out.println("Volume kubus: " + kubus.hitungVolume());
  }
}
