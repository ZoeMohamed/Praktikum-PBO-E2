/* Nama File : DosenTamu.java
 * Deskripsi : Program Inheritance Sub class DosenTamu dari Parent pegawai
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 14/03/2025
 */

 package Latihan;

 import java.time.LocalDate;
 import java.time.Period;
 
 public class DosenTamu extends Pegawai {
     private String nidk;           // Nomor Induk Dosen Kontrak/Tamu
     private LocalDate masaKontrak; // Tanggal berakhirnya kontrak
     private String fakultas;       // Fakultas tempat dosen mengajar
 
     // Constructor default - Membuat objek dosen tamu tanpa nilai atribut awal
     DosenTamu() {
     }
 
     // Constructor dengan parameter - Membuat objek dosen tamu dengan nilai atribut tertentu
     public DosenTamu(String nidk, String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
             String fakultas, LocalDate masaKontrak) {
         // Memanggil constructor parent class (Pegawai)
         super(nip, nama, tanggalLahir, tmt, gajiPokok);
 
         this.nidk = nidk;
         this.masaKontrak = masaKontrak;
         this.fakultas = fakultas;
     }
 
     // Getter untuk NIDK - Mengambil nilai NIDK dosen tamu
     public String getNidk() {
         return nidk;
     }
 
     // Setter untuk NIDK - Mengatur nilai NIDK dosen tamu
     public void setNidk(String nidk) {
         this.nidk = nidk;
     }
 
     // Getter untuk masa kontrak - Mengambil tanggal berakhirnya kontrak
     public LocalDate getmasaKontrak() {
         return masaKontrak;
     }
 
     // Setter untuk masa kontrak - Mengatur tanggal berakhirnya kontrak
     public void setMasaKontrak(LocalDate masaKontrak) {
         this.masaKontrak = masaKontrak;
     }
 
     // Getter untuk fakultas - Mengambil fakultas dosen tamu
     public String getFakultas() {
         return fakultas;
     }
 
     // Setter untuk fakultas - Mengatur fakultas dosen tamu
     public void setFakultas(String fakultas) {
         this.fakultas = fakultas;
     }
 
     // Method overloading untuk menghitung tunjangan dosen tamu (2.5% dari gaji pokok)
     public double hitungTunjangan() {
         // 2,5% x gaji pokok
         return 0.025 * gajiPokok;
     }
 
     // Method untuk menghitung sisa masa kontrak dari sekarang hingga berakhirnya kontrak
     public Period hitungMasaKontrak() {
         Period periode = Period.between(LocalDate.now(), masaKontrak);
         return periode;
     }
 
     // Override method printInfo dari parent class untuk menampilkan informasi dosen tamu
     @Override
     public void printInfo() {
         Period masaKerja = hitungMasaKerja();  // Hitung masa kerja dari parent class
         Period kontrakBerakhir = hitungMasaKontrak();  // Hitung sisa masa kontrak
         double tunjangan = hitungTunjangan();  // Hitung tunjangan dosen tamu
 
         System.out.println("NIDK                       : " + nidk);
         System.out.println("NIP                        : " + nip);
         System.out.println("Nama                       : " + nama);
         System.out.println("Tanggal Lahir              : " + formatTanggal(tanggalLahir));
         System.out.println("TMT                        : " + formatTanggal(tmt));
         System.out.println("Jabatan                    : Dosen Tamu");
         System.out.println("Fakultas                   : " + fakultas);
         System.out.println(
                 "Masa Kerja                 : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
         System.out.println("Masa Kontrak Berakhir      : " + kontrakBerakhir.getMonths() + " bulan");
         System.out.println("Tanggal Berakhir Kontrak   : " + formatTanggal(masaKontrak));
         System.out.println("Gaji Pokok                 : " + formatRupiah(gajiPokok));
         System.out.println("Tunjangan                  : 2.5% x " + formatRupiah(gajiPokok) + " = "
                 + formatRupiah(tunjangan));
     }
 }