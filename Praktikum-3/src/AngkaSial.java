/* Nama File : AngkaSial.java
 * Deskripsi : Progam penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 06/03/2025
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException { // throws dengan s digunakan pada method
        if (angka == 13) {
            throw new AngkaSialException(); // membentuk objek baru
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati hati memasukkan angka");
        }
    }
}

/*
 * 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas
 * dieksekusi?
 * Tidak dieksekusi, Dikarenakan ketika exception dilempar dengan throw new
 * AngkaSialException()
 * alur program langsung melompat ke blok catch dan melewati semua kode yang ada
 * di bawah statement throw.
 * 
 * 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * Dieksekusi,Dikareknakan ketika exception terjadi pada pemanggilan
 * as.cobaAngka(13) pada baris 19, program akan mencari handler exception yang sesuai, dan menemukan
 * blok catch yang dimulai di baris 21. Baris ini adalah bagian dari struktur
 * penanganan exception dan dieksekusi untuk memulai proses penanganan
 * exception.
 */