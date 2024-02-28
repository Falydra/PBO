public class Main {
    public static void main(String[] args) {
        Titik t1, t2;
        Titik t3, t4;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);
        t4 = new Titik(0, 0);
        t2.setAbsis(4);
        t2.setOrdinat(7);


        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
        t3.refleksiY(t1);
        System.out.println(t1);
        System.out.println(t3.getRefleksiY());

    }
}
