import java.util.ArrayList;
import java.util.List;

public class Fakultas {
    private String nama;
    private double tarifBiayaKebersihan;
    private List<RuangKelas> daftarRuangKelas;
    private List<Laboratorium> daftarLaboratorium;
    private List<Departemen> daftarDepartemen;

    public Fakultas(String nama, double tarifBiayaKebersihan) {
        this.nama = nama;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
        this.daftarRuangKelas = new ArrayList<>();
        this.daftarLaboratorium = new ArrayList<>();
        this.daftarDepartemen = new ArrayList<>();
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

    // Methods for RuangKelas (Composition)
    public void tambahRuangKelas(String kode, double panjang, double lebar, double tinggi,
            int kapasitas, int jumlahKursiTersedia, int jumlahKursiRusak) {
        RuangKelas ruangKelas = new RuangKelas(kode, panjang, lebar, tinggi, kapasitas,
                jumlahKursiTersedia, jumlahKursiRusak, this);
        daftarRuangKelas.add(ruangKelas);
    }

    public void hapusRuangKelas(String kode) {
        daftarRuangKelas.removeIf(ruang -> ruang.getKode().equals(kode));
    }

    public List<RuangKelas> getDaftarRuangKelas() {
        return daftarRuangKelas;
    }

    // Methods for Laboratorium (Composition)
    public void tambahLaboratorium(String kode, double panjang, double lebar, double tinggi,
            int kapasitas, String namaLab, double hargaSewa) {
        Laboratorium lab = new Laboratorium(kode, panjang, lebar, tinggi, kapasitas,
                namaLab, hargaSewa, this);
        daftarLaboratorium.add(lab);
    }

    public void hapusLaboratorium(String kode) {
        daftarLaboratorium.removeIf(lab -> lab.getKode().equals(kode));
    }

    public List<Laboratorium> getDaftarLaboratorium() {
        return daftarLaboratorium;
    }

    // Methods for Departemen (Aggregation)
    public void tambahDepartemen(Departemen departemen) {
        if (!daftarDepartemen.contains(departemen)) {
            daftarDepartemen.add(departemen);
        }
    }

    public void hapusDepartemen(Departemen departemen) {
        daftarDepartemen.remove(departemen);
    }

    public List<Departemen> getDaftarDepartemen() {
        return daftarDepartemen;
    }

    // Calculate total cleaning cost for all rooms in the faculty
    public double hitungTotalBiayaKebersihan() {
        double total = 0;

        for (RuangKelas ruang : daftarRuangKelas) {
            total += ruang.hitungBiayaKebersihan();
        }

        for (Laboratorium lab : daftarLaboratorium) {
            total += lab.hitungBiayaKebersihan();
        }

        return total;
    }

    // Display information about the faculty
    public void tampilkanInfoFakultas() {
        System.out.println("Fakultas: " + nama);
        System.out.println("Tarif Biaya Kebersihan: " + tarifBiayaKebersihan);
        System.out.println("Jumlah Ruang Kelas: " + daftarRuangKelas.size());
        System.out.println("Jumlah Laboratorium: " + daftarLaboratorium.size());
        System.out.println("Jumlah Departemen: " + daftarDepartemen.size());
    }
}