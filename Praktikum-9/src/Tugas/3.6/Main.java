
/**
 * Nama File : Main.java
 * Deskripsi : Main program untuk mendemonstrasikan KoleksiAnabul
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 11/05/2025
 */

import java.util.Random;

public class Main {
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek KoleksiAnabul
        KoleksiAnabul koleksi = new KoleksiAnabul();

        // Membuat 10 anabul acak dan menambahkannya ke koleksi
        String[] namaKucing = { "Kitty", "Milo", "Garfield", "Tom", "Felix" };
        String[] namaAnjing = { "Max", "Rocky", "Buddy", "Cooper", "Charlie" };
        String[] namaBurung = { "Tweety", "Rio", "Zazu", "Blu", "Jewel" };

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int jenisAnabul = random.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung

            switch (jenisAnabul) {
                case 0: // Kucing
                    koleksi.add(new Kucing(namaKucing[random.nextInt(namaKucing.length)]));
                    break;
                case 1: // Anjing
                    koleksi.add(new Anjing(namaAnjing[random.nextInt(namaAnjing.length)]));
                    break;
                case 2: // Burung
                    koleksi.add(new Burung(namaBurung[random.nextInt(namaBurung.length)]));
                    break;
            }
        }

        // Menampilkan semua anabul dalam koleksi
        koleksi.showAll();
    }
}