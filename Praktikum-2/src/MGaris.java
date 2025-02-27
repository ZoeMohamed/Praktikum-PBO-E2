/* Nama File : MGaris.java
 * Deskripsi : File Main Untuk Menguji Garis.java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 22/02/2025
 */

public class MGaris {
    public static void main(String[] args) {
        // Uji konstruktor default
        Garis g1 = new Garis();
        System.out.println("Garis 1 (konstruktor default):");
        g1.printGaris();

        // Uji konstruktor dengan parameter
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g2 = new Garis(t1, t2);
        System.out.println("\nGaris 2 (konstruktor dengan parameter):");
        g2.printGaris();

        // Uji getter dan setter
        System.out.println("\nMengubah titik pada Garis 1:");
        g1.setTitikAwal(t1);
        g1.setTitikAkhir(t2);
        g1.printGaris();

        // Uji panjang garis
        System.out.println("\nPanjang Garis 2: " + g2.panjangGaris());

        // Uji gradien
        System.out.println("Gradien Garis 2: " + g2.getGradient());

        // Uji titik tengah
        System.out.println("\nTitik tengah Garis 2:");
        g2.getTitikTengah().printTitik(); // Penerapan Method Chaining (Tidak menyimpan hasil dari titik tengah dalam
                                          // variable)

        // Uji garis sejajar
        Titik t3 = new Titik(1, 3);
        Titik t4 = new Titik(3, 7);
        Garis g3 = new Garis(t3, t4);
        System.out.println("\nUji garis sejajar:");
        System.out.println("Gradien Garis 2: " + g2.getGradient());
        System.out.println("Gradien Garis 3: " + g3.getGradient());
        System.out.println("Garis 2 sejajar dengan Garis 3: " + g2.isSejajar(g3));

        // Uji garis tegak lurus
        Titik t5 = new Titik(0, 0);
        Titik t6 = new Titik(2, -1);
        Garis g4 = new Garis(t5, t6);
        System.out.println("\nUji garis tegak lurus:");
        System.out.println("Gradien Garis 2: " + g2.getGradient());
        System.out.println("Gradien Garis 4: " + g4.getGradient());
        System.out.println("Garis 2 tegak lurus dengan Garis 4: " + g2.isTegakLurus(g4));

        // Uji persamaan garis
        System.out.println("\nPersamaan Garis 3:");
        g3.printPersamaanGaris();

        // Tampilkan jumlah objek garis
        System.out.println("\nJumlah objek Garis: " + Garis.counterGaris);
    }
    // end MGaris
}