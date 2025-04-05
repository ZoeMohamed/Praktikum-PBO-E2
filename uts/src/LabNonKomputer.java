import java.util.ArrayList;
import java.util.List;

public class LabNonKomputer extends Laboratorium {
    private List<String> daftarMatakuliah;

    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas,
            String namaLab, double hargaSewa, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, fakultas);
        this.daftarMatakuliah = new ArrayList<>();
    }

    // Methods for managing courses
    public void tambahMatakuliah(String matakuliah) {
        if (!daftarMatakuliah.contains(matakuliah)) {
            daftarMatakuliah.add(matakuliah);
        }
    }

    public void hapusMatakuliah(String matakuliah) {
        daftarMatakuliah.remove(matakuliah);
    }

    public List<String> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    // Override method from Laboratorium class
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("Informasi Lab Non-Komputer:");
        System.out.println("Kode: " + getKode());
        System.out.println("Nama Lab: " + getNamaLab());
        System.out.println("Panjang: " + getPanjang() + " m");
        System.out.println("Lebar: " + getLebar() + " m");
        System.out.println("Tinggi: " + getTinggi() + " m");
        System.out.println("Kapasitas: " + getKapasitas() + " orang");
        System.out.println("Luas: " + hitungLuas() + " m²");
        System.out.println("Volume: " + hitungVolume() + " m³");
        System.out.println("Harga Sewa: Rp " + getHargaSewa() + " per jam");
        System.out.println("Fakultas: " + getFakultas().getNama());

        // Display courses
        System.out.println("Daftar Matakuliah yang Menggunakan Lab:");
        if (daftarMatakuliah.isEmpty()) {
            System.out.println("- Belum ada matakuliah terdaftar");
        } else {
            for (String matakuliah : daftarMatakuliah) {
                System.out.println("- " + matakuliah);
            }
        }
    }

    // Override method from Laboratorium class
    @Override
    public double hitungSewa(int jamSewa) {
        // Non-computer lab may have different pricing based on the number of courses
        double baseSewa = super.hitungSewa(jamSewa);
        double discount = Math.min(0.2, daftarMatakuliah.size() * 0.05); // 5% discount per course, max 20%

        return baseSewa * (1 - discount);
    }
}