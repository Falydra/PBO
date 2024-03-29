/**
 * File: Anggota.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 * Deskripsi: Program untuk class Anggota
 */

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama, Buku judul) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException {

        if (jumlahBukuPinjaman >= 3){
            throw new MaksimumBukuTerpinjamException("Jumlah buku yang dipinjam melebihi 3");
        }
        System.out.println( "Buku : "+ buku.getJudul()  );



    }

    public void bukuTersedia(Buku buku) throws BukuTidakTersediaException{
        if (buku.isTersedia() == false){
            throw new BukuTidakTersediaException("Buku tidak tersedia");
        } else {

            buku.setTersedia(false);
            bukuPinjaman[jumlahBukuPinjaman] = buku;
            jumlahBukuPinjaman++;
            System.out.println("Buku tersedia : " + buku.getJudul());
        }



    }

}
