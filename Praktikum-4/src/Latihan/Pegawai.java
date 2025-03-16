/* Nama File : Pegawai.java
 * Deskripsi : Program Inheritance Parent dari 3 sub class berbeda
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 14/03/2025
 */

 package Latihan;

 import java.text.NumberFormat;
 import java.time.LocalDate;
 import java.time.Period;
 import java.time.format.DateTimeFormatter;
 import java.util.Locale;
 
 public class Pegawai {
     protected String nip;               // Nomor Induk Pegawai
     protected String nama;              // Nama pegawai
     protected LocalDate tanggalLahir;   // Tanggal lahir pegawai
     protected LocalDate tmt;            // Tanggal Mulai Tugas/kerja
     protected double gajiPokok;         // Gaji pokok pegawai
 
     // Constructor dengan parameter - Membuat objek pegawai dengan nilai atribut tertentu
     public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
         this.nip = nip;
         this.nama = nama;
         this.tanggalLahir = tanggalLahir;
         this.tmt = tmt;
         this.gajiPokok = gajiPokok;
     }
 
     // Constructor default - Membuat objek pegawai tanpa nilai atribut awal
     public Pegawai() {
     }
 
     // Getter untuk NIP - Mengambil nilai NIP pegawai
     public String getNip() {
         return nip;
     }
 
     // Setter untuk NIP - Mengatur nilai NIP pegawai
     public void setNip(String nip) {
         this.nip = nip;
     }
 
     // Getter untuk nama - Mengambil nama pegawai
     public String getNama() {
         return nama;
     }
 
     // Setter untuk nama - Mengatur nama pegawai
     public void setNama(String nama) {
         this.nama = nama;
     }
 
     // Getter untuk tanggal lahir - Mengambil tanggal lahir pegawai
     public LocalDate getTanggalLahir() {
         return tanggalLahir;
     }
 
     // Setter untuk tanggal lahir - Mengatur tanggal lahir pegawai
     public void setTanggalLahir(LocalDate tanggalLahir) {
         this.tanggalLahir = tanggalLahir;
     }
 
     // Getter untuk TMT - Mengambil tanggal mulai tugas
     public LocalDate getTmt() {
         return tmt;
     }
 
     // Setter untuk TMT - Mengatur tanggal mulai tugas
     public void setTmt(LocalDate tmt) {
         this.tmt = tmt;
     }
 
     // Getter untuk gaji pokok - Mengambil nilai gaji pokok
     public double getGajiPokok() {
         return gajiPokok;
     }
 
     // Setter untuk gaji pokok - Mengatur nilai gaji pokok
     public void setGajiPokok(double gajiPokok) {
         this.gajiPokok = gajiPokok;
     }
 
     // Method untuk memformat tanggal menjadi format "DD Bulan YYYY" dalam bahasa Indonesia
     protected String formatTanggal(LocalDate tanggal) {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.of("id", "ID"));
         return tanggal.format(formatter);
     }
 
     // Method untuk memformat nilai uang menjadi format Rupiah "Rp X.XXX.XXX,00"
     protected String formatRupiah(double nilai) {
         Locale localeID = Locale.of("id", "ID");
         NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
         return formatRupiah.format(nilai);
     }
 
     // Method untuk menghitung masa kerja dari TMT hingga sekarang
     protected Period hitungMasaKerja() {
         return Period.between(tmt, LocalDate.now());
     }
 
     // Method untuk menghitung tanggal Batas Usia Pensiun (BUP) berdasarkan umur
     protected LocalDate hitungBUP(int year) {
         LocalDate bupDate = tanggalLahir.plusYears(year);
         // Set ke tanggal 1 di bulan berikutnya
         return LocalDate.of(bupDate.getYear(), bupDate.getMonthValue(), 1).plusMonths(1);
     }
 
     // Method untuk menghitung tunjangan berdasarkan persentase, masa kerja, dan gaji pokok
     protected double hitungTunjangan(double percent) {
         // percent% x masa kerja (tahun) x gaji pokok
         int tahunKerja = hitungMasaKerja().getYears();
         return percent * tahunKerja * gajiPokok;
     }
 
     // Method untuk menampilkan informasi pegawai
     public void printInfo() {
         System.out.println("NIP           : " + nip);
         System.out.println("Nama          : " + nama);
         System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
         System.out.println("TMT           : " + formatTanggal(tmt));
         System.out.println("Gaji Pokok    : " + formatRupiah(gajiPokok));
     }
 }