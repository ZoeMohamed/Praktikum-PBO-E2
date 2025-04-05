public class Laboratorium extends Ruang {
    private String namaLab;
    private double hargaSewa;
    private Fakultas fakultas;

    public Laboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas,
            String namaLab, double hargaSewa, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
        this.hargaSewa = hargaSewa;
        this.fakultas = fakultas;
    }

    // Getters and Setters
    public String getNamaLab() {
        return namaLab;
    }

    public void setNamaLab(String namaLab) {
        this.namaLab = namaLab;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    // Method to calculate rental fee
    public double hitungSewa(int jamSewa) {
        return hargaSewa * jamSewa;
    }

    // Override method from Ruang class
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("Informasi Laboratorium:");
        System.out.println("Kode: " + getKode());
        System.out.println("Nama Lab: " + namaLab);
        System.out.println("Panjang: " + getPanjang() + " m");
        System.out.println("Lebar: " + getLebar() + " m");
        System.out.println("Tinggi: " + getTinggi() + " m");
        System.out.println("Kapasitas: " + getKapasitas() + " orang");
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Volume: " + hitungVolume() + " m³");
        System.out.println("Harga Sewa: Rp " + hargaSewa + " per jam");
        System.out.println("Fakultas: " + fakultas.getNama());
    }

    // Override method from Ruang class
    @Override
    public double hitungBiayaKebersihan() {
        // Calculate cleaning cost based on the area and faculty rate
        // Labs may have additional cleaning requirements
        return hitungLuas() * fakultas.getTarifBiayaKebersihan() * 1.5; // 50% more for labs
    }
}