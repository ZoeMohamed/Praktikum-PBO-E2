public class RuangDepartemen extends Ruang {
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private Departemen departemen;

    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas,
            int jumlahMeja, int jumlahKursi, int jumlahLemari, Departemen departemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.departemen = departemen;
    }

    // Getters and Setters
    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahLemari() {
        return jumlahLemari;
    }

    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    // Method to calculate total furniture
    public int hitungTotalFurnitur() {
        return jumlahMeja + jumlahKursi + jumlahLemari;
    }

    // Override method from Ruang class
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("Informasi Ruang Departemen:");
        System.out.println("Kode: " + getKode());
        System.out.println("Panjang: " + getPanjang() + " m");
        System.out.println("Lebar: " + getLebar() + " m");
        System.out.println("Tinggi: " + getTinggi() + " m");
        System.out.println("Kapasitas: " + getKapasitas() + " orang");
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Volume: " + hitungVolume() + " m³");
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Total Furnitur: " + hitungTotalFurnitur());
        System.out.println("Departemen: " + departemen.getNama());
    }

    // Override method from Ruang class
    @Override
    public double hitungBiayaKebersihan() {
        // Calculate cleaning cost based on the area and department rate
        return hitungLuas() * departemen.getTarifBiayaKebersihan();
    }
}