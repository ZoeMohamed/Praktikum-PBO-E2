public class LabKomputer extends Laboratorium {
    private int jumlahKomputer;

    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas,
            String namaLab, double hargaSewa, Fakultas fakultas, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, fakultas);
        this.jumlahKomputer = jumlahKomputer;
    }

    // Getter and Setter
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }

    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }

    // Override method from Laboratorium class
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("Informasi Lab Komputer:");
        System.out.println("Kode: " + getKode());
        System.out.println("Nama Lab: " + getNamaLab());
        System.out.println("Panjang: " + getPanjang() + " m");
        System.out.println("Lebar: " + getLebar() + " m");
        System.out.println("Tinggi: " + getTinggi() + " m");
        System.out.println("Kapasitas: " + getKapasitas() + " orang");
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Volume: " + hitungVolume() + " m³");
        System.out.println("Harga Sewa: Rp " + getHargaSewa() + " per jam");
        System.out.println("Jumlah Komputer: " + jumlahKomputer + " unit");
        System.out.println("Fakultas: " + getFakultas().getNama());
    }

    // Override method from Laboratorium class
    @Override
    public double hitungSewa(int jamSewa) {
        // Computer lab may have additional cost due to electricity and equipment
        return super.hitungSewa(jamSewa) + (jumlahKomputer * 500 * jamSewa); // 500 per computer per hour
    }

    // Override method from Ruang class
    @Override
    public double hitungBiayaKebersihan() {
        // Computer labs require more specialized cleaning
        return super.hitungBiayaKebersihan() + (jumlahKomputer * 5000); // Additional 5000 per computer
    }
}