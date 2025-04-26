/* Nama File : LaboratoriumNonKomputer.java
 * Deskripsi : Sub Class dari laboratorium
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */

import java.util.ArrayList;
import java.util.Arrays;

public class LaboratoriumNonKomputer extends Laboratorium {
    private ArrayList<String> mataKuliahYangDikelola;

    // Konstruktor
    public LaboratoriumNonKomputer(String kode, double panjang, double lebar, double tinggi, 
                                  int kapasitas, String namaLab, double hargaSewa, 
                                  String[] mataKuliah, Fakultas fakultas) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab, hargaSewa, fakultas);
        this.mataKuliahYangDikelola = new ArrayList<>(Arrays.asList(mataKuliah));
    }

    // Getter method
    public ArrayList<String> getMataKuliahYangDikelola() {
        return new ArrayList<>(mataKuliahYangDikelola);
    }
    
    // Method untuk menambah dan menghapus mata kuliah
    public void tambahMataKuliah(String mataKuliah) {
        if (!mataKuliahYangDikelola.contains(mataKuliah)) {
            mataKuliahYangDikelola.add(mataKuliah);
        }
    }
    
    public boolean hapusMataKuliah(String mataKuliah) {
        return mataKuliahYangDikelola.remove(mataKuliah);
    }
    
    // Implementasi method abstract dari Laboratorium
    @Override
    public void tampilkanInfo() {
        System.out.println("Laboratorium Non-Komputer: " + getNamaLab());
        System.out.println("Kode: " + getKode());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Mata Kuliah yang Dikelola: " + String.join(", ", mataKuliahYangDikelola));
        System.out.println("Harga Sewa: Rp " + getHargaSewa() + "/jam");
        System.out.println("Biaya Kebersihan: Rp " + hitungBiayaKebersihan());
    }
}