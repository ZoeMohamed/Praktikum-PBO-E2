/* Nama File : Fakultas.java
 * Deskripsi : Class untuk menampung data fakultas (Daftar Ruang kelas,Daftar Laboratorium)
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */

 import java.util.ArrayList;

 public class Fakultas {
     private String nama;
     private double tarifKebersihan;
     private ArrayList<RuangKelas> daftarRuangKelas;
     private ArrayList<Laboratorium> daftarLaboratorium;
 
     // Konstruktor
     public Fakultas(String nama, double tarifKebersihan) {
         this.nama = nama;
         this.tarifKebersihan = tarifKebersihan;
         this.daftarRuangKelas = new ArrayList<>();
         this.daftarLaboratorium = new ArrayList<>();
     }
 
     // Getter methods
     public String getNama() {
         return nama;
     }
     
     public double getTarifKebersihan() {
         return tarifKebersihan;
     }
 
     public void setNama(String nama) {
         this.nama = nama;
     }
     
     public void setTarifKebersihan(double tarifKebersihan) {
         this.tarifKebersihan = tarifKebersihan;
     }
     
     // Method untuk menambah ruang
     public void tambahRuangKelas(RuangKelas ruangKelas) {
         daftarRuangKelas.add(ruangKelas);
     }
     
     public void tambahLaboratorium(Laboratorium laboratorium) {
         daftarLaboratorium.add(laboratorium);
     }
     
     // Method untuk menampilkan informasi fakultas
     public void tampilkanInfo() {
         System.out.println("INFORMASI FAKULTAS");
         System.out.println("Nama: " + nama);
         System.out.println("Tarif Kebersihan: Rp " + tarifKebersihan + "/m²");
         System.out.println("Jumlah Ruang Kelas: " + daftarRuangKelas.size());
         System.out.println("Jumlah Laboratorium: " + daftarLaboratorium.size());
     }
     
     // Method untuk menampilkan informasi dan menghitung jumlah ruang
     public void tampilkanInfoRuangKelas() {
         System.out.println("=== DAFTAR RUANG KELAS ===");
         for (RuangKelas ruang : daftarRuangKelas) {
             ruang.tampilkanInfo();
             System.out.println("-------------------------");
         }
         System.out.println("Jumlah Ruang Kelas: " + daftarRuangKelas.size());
     }
     
     public void tampilkanInfoLaboratorium() {
         System.out.println("=== DAFTAR LABORATORIUM ===");
         
         int jumlahLabKomputer = 0;
         int jumlahLabNonKomputer = 0;
         
         for (Laboratorium lab : daftarLaboratorium) {
             lab.tampilkanInfo();
             System.out.println("-------------------------");
             
             if (lab instanceof LaboratoriumKomputer) {
                 jumlahLabKomputer++;
             } else if (lab instanceof LaboratoriumNonKomputer) {
                 jumlahLabNonKomputer++;
             }
         }
         
         System.out.println("Jumlah Total Laboratorium: " + daftarLaboratorium.size());
         System.out.println("Jumlah Laboratorium Komputer: " + jumlahLabKomputer);
         System.out.println("Jumlah Laboratorium Non-Komputer: " + jumlahLabNonKomputer);
     }
     
     // Method untuk menghitung total biaya kebersihan
     public double hitungTotalBiayaKebersihan() {
         double total = 0;
         
         for (RuangKelas ruang : daftarRuangKelas) {
             total += ruang.hitungBiayaKebersihan();
         }
         
         for (Laboratorium lab : daftarLaboratorium) {
             total += lab.hitungBiayaKebersihan();
         }
         
         return total;
     }
 }