public class RuangKelas extends Ruang {
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    private Fakultas fakultas;

    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas,
            int jumlahKursiTersedia, int jumlahKursiRusak, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
        this.fakultas = fakultas;
    }

    // Getters and Setters
    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }

    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }

    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }

    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    // Method to calculate total available chairs
    public int hitungTotalKursi() {
        return jumlahKursiTersedia + jumlahKursiRusak;
    }

    // Override method from Ruang class
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("Informasi Ruang Kelas:");
        System.out.println("Kode: " + getKode());
        System.out.println("Panjang: " + getPanjang() + " m");
        System.out.println("Lebar: " + getLebar() + " m");
        System.out.println("Tinggi: " + getTinggi() + " m");
        System.out.println("Kapasitas: " + getKapasitas() + " orang");
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Volume: " + hitungVolume() + " m³");
        System.out.println("Jumlah Kursi Tersedia: " + jumlahKursiTersedia);
        System.out.println("Jumlah Kursi Rusak: " + jumlahKursiRusak);
        System.out.println("Total Kursi: " + hitungTotalKursi());
        System.out.println("Fakultas: " + fakultas.getNama());
    }

    // Override method from Ruang class
    @Override
    public double hitungBiayaKebersihan() {
        // Calculate cleaning cost based on the area and faculty rate
        return hitungLuas() * fakultas.getTarifBiayaKebersihan();
    }
}