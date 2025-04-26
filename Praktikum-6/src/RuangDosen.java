/* Nama File : RuangDosen.java
 * Deskripsi : Sub Class dari Ruang
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */

public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    private Departemen departemen;

    // Konstruktor
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, 
                     int kapasitas, String namaDosen, int jumlahKursi, 
                     int jumlahMeja, Departemen departemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        this.departemen = departemen;
    }

    // Getter methods
    public String getNamaDosen() {
        return namaDosen;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }
    
    public Departemen getDepartemen() {
        return departemen;
    }

    
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }



    // Implementasi method abstract dari Ruang
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuas() * departemen.getTarifKebersihan();
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Ruang Dosen: " + getKode());
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Kursi: " + jumlahKursi);
        System.out.println("Meja: " + jumlahMeja);
        System.out.println("Departemen: " + departemen.getNama());
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}