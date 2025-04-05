public class RuangDosen extends Ruang {
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    private Departemen departemen;

    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas,
            String namaDosen, int jumlahKursi, int jumlahMeja, Departemen departemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        this.departemen = departemen;
    }

    // Getters and Setters
    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahMeja() {
        return jumlahMeja;
    }

    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }

    public Departemen getDepartemen() {
        return departemen;
    }

    // Method to calculate total furniture
    public int hitungTotalFurnitur() {
        return jumlahMeja + jumlahKursi;
    }

    // Override method from Ruang class
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("Informasi Ruang Dosen:");
        System.out.println("Kode: " + getKode());
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Panjang: " + getPanjang() + " m");
        System.out.println("Lebar: " + getLebar() + " m");
        System.out.println("Tinggi: " + getTinggi() + " m");
        System.out.println("Kapasitas: " + getKapasitas() + " orang");
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Volume: " + hitungVolume() + " m³");
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Total Furnitur: " + hitungTotalFurnitur());
        System.out.println("Departemen: " + departemen.getNama());
    }

    // Override method from Ruang class
    @Override
    public double hitungBiayaKebersihan() {
        // Calculate cleaning cost based on the area and department rate
        // Lecturer rooms are smaller but need more careful cleaning
        return hitungLuas() * departemen.getTarifBiayaKebersihan() * 1.2; // 20% more for lecturer rooms
    }
}