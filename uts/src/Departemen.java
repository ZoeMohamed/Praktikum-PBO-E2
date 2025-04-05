import java.util.ArrayList;
import java.util.List;

public class Departemen {
    private String nama;
    private double tarifBiayaKebersihan;
    private List<RuangDepartemen> daftarRuangDepartemen;
    private List<RuangDosen> daftarRuangDosen;

    public Departemen(String nama, double tarifBiayaKebersihan) {
        this.nama = nama;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
        this.daftarRuangDepartemen = new ArrayList<>();
        this.daftarRuangDosen = new ArrayList<>();
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifBiayaKebersihan() {
        return tarifBiayaKebersihan;
    }

    public void setTarifBiayaKebersihan(double tarifBiayaKebersihan) {
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }

    // Methods for RuangDepartemen (Composition)
    public void tambahRuangDepartemen(String kode, double panjang, double lebar, double tinggi,
            int kapasitas, int jumlahMeja, int jumlahKursi, int jumlahLemari) {
        RuangDepartemen ruangDept = new RuangDepartemen(kode, panjang, lebar, tinggi, kapasitas,
                jumlahMeja, jumlahKursi, jumlahLemari, this);
        daftarRuangDepartemen.add(ruangDept);
    }

    // Overloaded method with fewer parameters
    public void tambahRuangDepartemen(String kode, double panjang, double lebar, double tinggi,
            int kapasitas) {
        tambahRuangDepartemen(kode, panjang, lebar, tinggi, kapasitas, 0, 0, 0);
    }

    public void hapusRuangDepartemen(String kode) {
        daftarRuangDepartemen.removeIf(ruang -> ruang.getKode().equals(kode));
    }

    public List<RuangDepartemen> getDaftarRuangDepartemen() {
        return daftarRuangDepartemen;
    }

    // Methods for RuangDosen (Composition)
    public void tambahRuangDosen(String kode, double panjang, double lebar, double tinggi,
            int kapasitas, String namaDosen, int jumlahKursi, int jumlahMeja) {
        RuangDosen ruangDosen = new RuangDosen(kode, panjang, lebar, tinggi, kapasitas,
                namaDosen, jumlahKursi, jumlahMeja, this);
        daftarRuangDosen.add(ruangDosen);
    }

    // Overloaded method with fewer parameters
    public void tambahRuangDosen(String kode, double panjang, double lebar, double tinggi,
            int kapasitas, String namaDosen) {
        tambahRuangDosen(kode, panjang, lebar, tinggi, kapasitas, namaDosen, 1, 1);
    }

    public void hapusRuangDosen(String kode) {
        daftarRuangDosen.removeIf(ruang -> ruang.getKode().equals(kode));
    }

    public List<RuangDosen> getDaftarRuangDosen() {
        return daftarRuangDosen;
    }

    // Calculate total cleaning cost for all rooms in the department
    public double hitungTotalBiayaKebersihan() {
        double total = 0;

        for (RuangDepartemen ruang : daftarRuangDepartemen) {
            total += ruang.hitungBiayaKebersihan();
        }

        for (RuangDosen ruang : daftarRuangDosen) {
            total += ruang.hitungBiayaKebersihan();
        }

        return total;
    }

    // Display information about the department
    public void tampilkanInfoDepartemen() {
        System.out.println("Departemen: " + nama);
        System.out.println("Tarif Biaya Kebersihan: " + tarifBiayaKebersihan);
        System.out.println("Jumlah Ruang Departemen: " + daftarRuangDepartemen.size());
        System.out.println("Jumlah Ruang Dosen: " + daftarRuangDosen.size());
    }
}