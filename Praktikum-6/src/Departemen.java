/* Nama File : Departemen.java
 * Deskripsi : Parent Class untuk ruang departemen dan ruang dosen
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */


 import java.util.ArrayList;

 public class Departemen {
     private String nama;
     private String ketua;
     private double tarifKebersihan;
     private ArrayList<RuangDepartemen> daftarRuangDepartemen;
     private ArrayList<RuangDosen> daftarRuangDosen;
 
     // Konstruktor
     public Departemen(String nama, String ketua, double tarifKebersihan) {
         this.nama = nama;
         this.ketua = ketua;
         this.tarifKebersihan = tarifKebersihan;
         this.daftarRuangDepartemen = new ArrayList<>();
         this.daftarRuangDosen = new ArrayList<>();
     }
 
     // Getter methods
     public String getNama() {
         return nama;
     }
     
     public String getKetua() {
         return ketua;
     }
     
     public double getTarifKebersihan() {
         return tarifKebersihan;
     }
 
     public void setNama(String nama) {
         this.nama = nama;
     }
     
     public void setKetua(String ketua) {
         this.ketua = ketua;
     }
     
     public void setTarifKebersihan(double tarifKebersihan) {
         this.tarifKebersihan = tarifKebersihan;
     }
     
     // Method untuk menampilkan informasi departemen
     public void tampilkanInfo() {
         System.out.println("INFORMASI DEPARTEMEN");
         System.out.println("Nama: " + nama);
         System.out.println("Ketua: " + ketua);
         System.out.println("Tarif Kebersihan: Rp " + tarifKebersihan + "/m²");
         System.out.println("Jumlah Ruang Departemen: " + daftarRuangDepartemen.size());
         System.out.println("Jumlah Ruang Dosen: " + daftarRuangDosen.size());
     }
     
     // Method untuk menambah ruang
     public void tambahRuangDepartemen(RuangDepartemen ruangDepartemen) {
         daftarRuangDepartemen.add(ruangDepartemen);
     }
     
     public void tambahRuangDosen(RuangDosen ruangDosen) {
         daftarRuangDosen.add(ruangDosen);
     }
     
     // Method untuk menampilkan informasi dan menghitung jumlah ruang
     public void tampilkanInfoRuangDepartemen() {
         System.out.println("=== DAFTAR RUANG DEPARTEMEN ===");
         for (RuangDepartemen ruang : daftarRuangDepartemen) {
             ruang.tampilkanInfo();
             System.out.println("-------------------------");
         }
         System.out.println("Jumlah Ruang Departemen: " + daftarRuangDepartemen.size());
     }
     
     public void tampilkanInfoRuangDosen() {
         System.out.println("=== DAFTAR RUANG DOSEN ===");
         for (RuangDosen ruang : daftarRuangDosen) {
             ruang.tampilkanInfo();
             System.out.println("-------------------------");
         }
         System.out.println("Jumlah Ruang Dosen: " + daftarRuangDosen.size());
     }
     
     // Method untuk menghitung total biaya kebersihan
     public double hitungTotalBiayaKebersihan() {
         double total = 0;
         
         for (RuangDepartemen ruang : daftarRuangDepartemen) {
             total += ruang.hitungBiayaKebersihan();
         }
         
         for (RuangDosen ruang : daftarRuangDosen) {
             total += ruang.hitungBiayaKebersihan();
         }
         
         return total;
     }
 }