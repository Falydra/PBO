/**
 * File: Main.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 * Deskripsi: Program main untuk menunjukkan Exception pada Anggota
 */

public class Main{
    public static void main(String[] args) {

        Buku buku = new Buku("Hidden Dimension");
        Buku buku2 = new Buku("Leviathan");
        Buku buku3 = new Buku("Crime and Punishment");
        Buku buku4 = new Buku("Metamorphosis");
        Buku buku5 = new Buku("Note from the Dead House");
        Anggota anggota = new Anggota("Yanto", buku);



        try{
            anggota.pinjamBuku(buku);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);

        } catch (MaksimumBukuTerpinjamException e){
            System.out.println(e.getMessage());

        }

        try {
            anggota.bukuTersedia(buku);

        } catch (BukuTidakTersediaException e) {
            System.out.println(e.getMessage());
        }

    }
}
