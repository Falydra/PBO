/**
 * File: KeranjangBelanja.java
 * Nama: Daffa Aly Meganendra
 * NIM : 24060122140140
 * Deskripsi: Program untuk menunjukkan asersi pada KeranjangBelanja
 */

public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        // TO DO : Tambahkan logika untuk menambahkan item ke atribut keranjang berikan asersi jika keranjang sudah penuh
        assert(count < keranjang.length): "Keranjang sudah penuh";
        if (count < keranjang.length) {
            keranjang[count] = item;
            count++;
        }

    }

    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
