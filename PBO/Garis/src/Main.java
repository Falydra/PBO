public class Main {
    public static void main(String[] args) {
      
        Titik t1 = new Titik(3, 4);
        Titik t2 = new Titik(5, 12);

        System.out.println("Titik 1 absis: " + t1.getAbsis());
        System.out.println("Titik 1 ordinat: " + t1.getOrdinat());
        System.out.println("Jarak Titik 1 ke pusat: " + t1.getJarakPusat());

        t1.refleksiX();
        System.out.println("Titik 1 setelah direfleksikan terhadap sumbu X: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        Titik titikRefleksiY = t1.getRefleksiY();
        System.out.println("Titik refleksi terhadap sumbu Y dari Titik 1: (" + titikRefleksiY.getAbsis() + ", " + titikRefleksiY.getOrdinat() + ")");

      
        Garis garis1 = new Garis(t1, t2);

        System.out.println("Panjang garis: " + garis1.getPanjang());
        System.out.println("Gradien garis: " + garis1.getGradien());

        Garis garisRefleksiY = garis1.getRefleksiY();
        System.out.println("Garis refleksi terhadap sumbu Y: titikAwal=(" + garisRefleksiY.getTitikAwal().getAbsis() + ", " + garisRefleksiY.getTitikAwal().getOrdinat() + "), titikAkhir=(" + garisRefleksiY.getTitikAkhir().getAbsis() + ", " + garisRefleksiY.getTitikAkhir().getOrdinat() + ")");
    }
}
