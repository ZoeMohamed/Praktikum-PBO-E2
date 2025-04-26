/* Nama File : LaboratoriumKomputer.java
 * Deskripsi : Sub Class dari laboratorium
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */


public class LaboratoriumKomputer extends Laboratorium {
    private int jumlahKomputer;

    // Konstruktor
    public LaboratoriumKomputer(String kode, double panjang, double lebar, double tinggi, 
                               int kapasitas, String namaLab, double hargaSewa, 
                               int jumlahKomputer, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, fakultas);
        this.jumlahKomputer = jumlahKomputer;
    }

    // Getter method
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }
    
    // Method overriding untuk menghitung biaya sewa dengan tambahan biaya komputer
    @Override
    public double hitungBiayaSewa() {
        return super.hitungBiayaSewa() + (jumlahKomputer * 10000);
    }
    
    @Override
    public double hitungBiayaSewa(int jam) {
        return super.hitungBiayaSewa(jam) + (jumlahKomputer * 10000 * jam);
    }

    // Implementasi method abstract dari Laboratorium
    @Override
    public void tampilkanInfo() {
        System.out.println("Laboratorium Komputer: " + getNamaLab());
        System.out.println("Kode: " + getKode());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Harga Sewa: Rp " + getHargaSewa() + "/jam");
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}