/* Nama File : RuangDepartemen.java
 * Deskripsi : Sub Class dari Ruang
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */

public class RuangDepartemen extends Ruang {
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private Departemen departemen;

    // Konstruktor
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, 
                          int kapasitas, int jumlahMeja, int jumlahKursi, 
                          int jumlahLemari, Departemen departemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.departemen = departemen;
    }

    // Getter methods
    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getJumlahLemari() {
        return jumlahLemari;
    }
    
    public Departemen getDepartemen() {
        return departemen;
    }
    

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }
    // Method untuk menghitung total furnitur
    public int hitungTotalFurnitur() {
        return jumlahMeja + jumlahKursi + jumlahLemari;
    }

    // Implementasi method abstract dari Ruang
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * departemen.getTarifKebersihan();
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Departemen: " + getKode());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Meja: " + jumlahMeja);
        System.out.println("Kursi: " + jumlahKursi);
        System.out.println("Lemari: " + jumlahLemari);
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}