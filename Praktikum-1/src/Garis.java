/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 22/02/2025
 */

// Atribut titik awal, titik akhir, dan counter garis
public class Garis {
    Titik titikawal;
    Titik titikakhir;
    static int counterGaris = 0;

    // Konstruktor dengan parameter
    Garis(Titik titikawal, Titik titikakhir) {
        this.titikawal = titikawal;
        this.titikakhir = titikakhir;
        counterGaris++;
    }

    // Konstruktor default (0,0) dan (1,1)
    Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // Selektor (getter) untuk setiap atribut pada class garis
    Titik getTitikAwal() {
        return titikawal;
    }

    Titik getTitikAkhir() {
        return titikakhir;
    }

    // Mutator (setter) untuk setiap atribut pada class garis
    void setTitikAwal(Titik titikawal) {
        this.titikawal = titikawal;
    }

    void setTitikAkhir(Titik titikakhir) {
        this.titikakhir = titikakhir;
    }

    // Selektor atribut static counterGaris
    int getcounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    double panjangGaris() {
        return Math
                .sqrt(Math.pow(titikakhir.absis - titikawal.absis, 2.0)
                        + Math.pow(titikakhir.ordinat - titikawal.ordinat, 2.0));
    }

    // Menghitung gradien garis
    double getGradient() {
        return (titikakhir.ordinat - titikawal.ordinat) / (titikakhir.absis - titikawal.absis);
    }

    // Mendapatkan titik tengah
    Titik getTitikTengah() {
        return new Titik((titikawal.absis + titikakhir.absis) / 2.0,
                (titikawal.ordinat + titikakhir.ordinat) / 2.0);
    }

    // Cek apakah sejajar dengan garis lain
    boolean isSejajar(Garis G) {
        return (this.getGradient() == G.getGradient());
    }

    // Cek apakah tegak lurus dengan garis lain
    boolean isTegakLurus(Garis G) {
        return (this.getGradient() * G.getGradient()) == -1;
    }

    // Menampilkan titik awal dan akhir
    void printGaris() {
        System.out.println("Titik awal: ");
        titikawal.printTitik();
        System.out.println("Titik akhir: ");
        titikakhir.printTitik();
    }

    // Menampilkan persamaan garis (y = mx + c)
    void printPersamaanGaris() {
        double m = this.getGradient();
        double c = titikawal.getOrdinat() - m * titikawal.getAbsis();
        System.out.println("y = " + m + "x + " + c);

    }

    // end class garis
}