/* Nama File : Tendik.java
 * Deskripsi : Program Inheritance Pewarisan Tendik Terhadap Pegawai
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 14/03/2025
 */

 package Latihan;

 import java.time.LocalDate;
 import java.time.Period;
 
 public class Tendik extends Pegawai {
     private String bidang;  // Bidang/departemen tempat tenaga pendidik bekerja
 
     // Constructor default - Membuat objek tenaga pendidik tanpa nilai atribut awal
     public Tendik() {
     }
 
     // Constructor dengan parameter - Membuat objek tenaga pendidik dengan nilai atribut tertentu
     public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, String bidang, double gajiPokok) {
         // Memanggil constructor parent class (Pegawai)
         super(nip, nama, tanggalLahir, tmt, gajiPokok);
         this.bidang = bidang;
     }
 
     // Getter untuk bidang - Mengambil bidang tenaga pendidik
     public String getBidang() {
         return bidang;
     }
 
     // Setter untuk bidang - Mengatur bidang tenaga pendidik
     public void setBidang(String bidang) {
         this.bidang = bidang;
     }
 
     // Override method printInfo dari parent class untuk menampilkan informasi tenaga pendidik
     @Override
     public void printInfo() {
         Period masaKerja = hitungMasaKerja(); // Hitung masa kerja dari parent class
         double tunjangan = hitungTunjangan(0.01); // Hitung tunjangan 1% x masa kerja x gaji pokok
         LocalDate bup = hitungBUP(55); // Hitung usia pensiun (55 tahun)
 
         System.out.println("NIP                        : " + nip);
         System.out.println("Nama                       : " + nama);
         System.out.println("Tanggal Lahir              : " + formatTanggal(tanggalLahir));
         System.out.println("TMT                        : " + formatTanggal(tmt));
         System.out.println("Jabatan                    : Tenaga Kependidikan (Tendik)");
         System.out.println("Bidang                     : " + bidang);
         System.out.println(
                 "Masa Kerja                 : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
         System.out.println("BUP                        : " + formatTanggal(bup));
         System.out.println("Gaji Pokok                 : " + formatRupiah(gajiPokok));
         System.out.println(
                 "Tunjangan                  : 1% x " + masaKerja.getYears() + " X " + formatRupiah(gajiPokok) + " = "
                         + formatRupiah(tunjangan));
     }
 }