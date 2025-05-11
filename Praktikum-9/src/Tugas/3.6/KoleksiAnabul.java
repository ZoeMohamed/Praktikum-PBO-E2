
/**
 * Nama File : KoleksiAnabul.java
 * Deskripsi : Kelas KoleksiAnabul yang menggunakan kelas generik Koleksi untuk Anabul
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 11/05/2025
 */

import java.util.ArrayList;

public class KoleksiAnabul {
    private int nbelm;
    private ArrayList<Anabul> wadah;

    // Konstruktor
    public KoleksiAnabul() {
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

    // Method untuk menambahkan anabul ke koleksi
    public void add(Anabul anabul) {
        wadah.add(anabul);
        nbelm++;
    }

    // Method untuk menghapus anabul terakhir dari koleksi
    public Anabul delete() {
        if (nbelm > 0) {
            Anabul anabul = wadah.remove(nbelm - 1);
            nbelm--;
            return anabul;
        }
        return null;
    }

    // Method untuk mengambil jumlah anabul dalam koleksi
    public int getNbelm() {
        return nbelm;
    }

    // Method untuk mengambil anabul pada indeks tertentu
    public Anabul getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        }
        return null;
    }

    // Method untuk menampilkan semua anabul beserta suara dan gerakannya
    public void showAll() {
        System.out.println("=== KOLEKSI ANABUL ===");
        System.out.println("Jumlah anabul: " + nbelm);
        System.out.println("=====================");

        for (int i = 0; i < nbelm; i++) {
            Anabul anabul = wadah.get(i);
            System.out.println("Anabul ke-" + (i + 1) + ":");
            System.out.println("Nama: " + anabul.getNama());
            System.out.print("Suara: ");
            anabul.Bersuara();
            System.out.print("Gerakan: ");
            anabul.Gerak();
            System.out.println("---------------------");
        }
    }
}