/* Nama File : Laboratorium.java
 * Deskripsi : Parent Class dari laboratorium komputer dan non-komputer
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */


public abstract class Laboratorium extends Ruang {
    private String namaLab;
    private double hargaSewa;
    private Fakultas fakultas;

    // Konstruktor
    public Laboratorium(String kode, double panjang, double lebar, double tinggi, 
                        int kapasitas, String namaLab, double hargaSewa, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        this.fakultas = fakultas;
    }

    // Getter methods
    public String getNamaLab() {
        return namaLab;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }
    
    public Fakultas getFakultas() {
        return fakultas;
    }
    
    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }
    
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    // Method overloading untuk menghitung biaya sewa
    public double hitungBiayaSewa() {
        return hargaSewa;
    }
    
    public double hitungBiayaSewa(int jam) {
        return hargaSewa * jam;
    }

    // Implementasi method abstract dari Ruang
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * fakultas.getTarifKebersihan();
    }
    
    // Method abstract untuk diimplementasi oleh subclass
    @Override
    public abstract void tampilkanInfo();
}