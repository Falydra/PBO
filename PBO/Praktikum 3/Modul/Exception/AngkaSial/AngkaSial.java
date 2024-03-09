/**
* File: AngkaSial.java
* Nama: Daffa Aly Meganendra
* NIM : 24060122140140
* Deskripsi: Program untuk menunjukkan Exception pada program AngkaSial
*/
public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static  void  main (String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(11);
            as.cobaAngka(13);
        } catch (AngkaSialException e){
            System.out.println((e.getMessage()));
            System.out.println("Hati hati");
        }
    }
}
