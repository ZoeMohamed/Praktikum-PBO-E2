/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/02/2025
 */

// Atribut titik awal, titik akhir, dan counter garis
public class Garis {
    private Titik titikawal;
    private Titik titikakhir;
    static int counterGaris = 0;

    // Konstruktor dengan parameter
    public Garis(Titik titikawal, Titik titikakhir) {
        this.titikawal = titikawal;
        this.titikakhir = titikakhir;
        counterGaris++;
    }

    // Konstruktor default (0,0) dan (1,1)
    public Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // Selektor (getter) untuk setiap atribut pada class garis
    public Titik getTitikAwal() {
        return titikawal;
    }

    public Titik getTitikAkhir() {
        return titikakhir;
    }

    // Mutator (setter) untuk setiap atribut pada class garis
    public void setTitikAwal(Titik titikawal) {
        this.titikawal = titikawal;
    }

    public void setTitikAkhir(Titik titikakhir) {
        this.titikakhir = titikakhir;
    }

    // Selektor atribut static counterGaris
    public int getcounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    public double panjangGaris() {
        double titikakhirabsis = this.getTitikAkhir().getAbsis();
        double titikakhirordinat = this.getTitikAkhir().getOrdinat();
        double titikawalabsis = this.getTitikAwal().getAbsis();
        double titikawalordinat = this.getTitikAwal().getOrdinat();

        return Math
                .sqrt(Math.pow(titikakhirordinat - titikawalordinat, 2.0)
                        + Math.pow(titikakhirabsis - titikawalabsis, 2.0));
    }

    // Menghitung gradien garis
    public double getGradient() {
        double titikakhirabsis = this.getTitikAkhir().getAbsis();
        double titikakhirordinat = this.getTitikAkhir().getOrdinat();
        double titikawalabsis = this.getTitikAwal().getAbsis();
        double titikawalordinat = this.getTitikAwal().getOrdinat();
        return (titikakhirordinat - titikawalordinat) / (titikakhirabsis - titikawalabsis);
    }

    // Mendapatkan titik tengah
    public Titik getTitikTengah() {
        double titikakhirabsis = this.getTitikAkhir().getAbsis();
        double titikakhirordinat = this.getTitikAkhir().getOrdinat();
        double titikawalabsis = this.getTitikAwal().getAbsis();
        double titikawalordinat = this.getTitikAwal().getOrdinat();
        return new Titik((titikawalabsis + titikakhirabsis) / 2.0,
                (titikawalordinat + titikakhirordinat) / 2.0);
    }

    // Cek apakah sejajar dengan garis lain
    public boolean isSejajar(Garis G) {
        return (this.getGradient() == G.getGradient());
    }

    // Cek apakah tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis G) {
        return (this.getGradient() * G.getGradient()) == -1;
    }

    // Menampilkan titik awal dan akhir
    public void printGaris() {
        System.out.println("Titik awal: ");
        titikawal.printTitik();
        System.out.println("Titik akhir: ");
        titikakhir.printTitik();
    }

    // Menampilkan persamaan garis (y = mx + c)
    public void printPersamaanGaris() {
        double m = this.getGradient();
        double c = titikawal.getOrdinat() - m * titikawal.getAbsis();
        System.out.println("y = " + m + "x + " + c);

    }

    // end class garis
}