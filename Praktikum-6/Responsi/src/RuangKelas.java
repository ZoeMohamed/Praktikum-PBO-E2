/* Nama File : RuangKelas.java
 * Deskripsi : Sub Class dari Ruang
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */
public class RuangKelas extends Ruang {
    private int kursiTersedia;
    private int kursiRusak;
    private Fakultas fakultas;

    // Konstruktor
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, 
                      int kapasitas, int kursiTersedia, int kursiRusak, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.kursiTersedia = kursiTersedia;
        this.kursiRusak = kursiRusak;
        this.fakultas = fakultas;
    }

    // Getter methods
    public int getKursiTersedia() {
        return kursiTersedia;
    }

    public int getKursiRusak() {
        return kursiRusak;
    }
    
    public Fakultas getFakultas() {
        return fakultas;
    }
    
    public void setKursiTersedia(int kursiTersedia) {
        this.kursiTersedia = kursiTersedia;
    }
    
    public void setKursiRusak(int kursiRusak) {
        this.kursiRusak = kursiRusak;
    }
    
    // Method overloading untuk mendapatkan total kursi
    public int getTotalKursi() {
        return kursiTersedia + kursiRusak;
    }
    
    public int getTotalKursi(boolean hanyaYangTersedia) {
        if (hanyaYangTersedia) {
            return kursiTersedia;
        } else {
            return kursiTersedia + kursiRusak;
        }
    }

    // Implementasi method abstract dari Ruang
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * fakultas.getTarifKebersihan();
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Kelas " + getKode());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Kursi Tersedia: " + kursiTersedia);
        System.out.println("Kursi Rusak: " + kursiRusak);
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}