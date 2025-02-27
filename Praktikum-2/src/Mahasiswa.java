/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/02/2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    // Atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this();
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    // Getter untuk nim
    public String getNim() {
        return this.nim;
    }

    // Getter untuk prodi
    public String getProdi() {
        return this.prodi;
    }

    // Getter untuk dosenWali
    public Dosen getDosen() {
        return this.dosenWali;
    }

    // Getter untuk kendaraan
    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Setter untuk prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Setter untuk dosenWali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Setter untuk kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method untuk menambahkan mata kuliah ke listMatKul
    public void addMatKul(MataKuliah newMatKul) {
        if (this.listMatKul.size() < 50) {

            listMatKul.add(newMatKul);
        } else {
            System.out.println("List Mata Kuliah Sudah Penuh 🥲");
        }
    }

    // Method untuk menghitung total SKS
    public int getJumlahSKS() {
        int count = 0;
        // Loop Tipe Lainnya
        // for (MataKuliah matkul : this.listMatKul) {
        // count += matkul.getSks();
        // }
        for (int i = 0; i < listMatKul.size(); i++) {
            count += listMatKul.get(i).getSks();
        }
        return count;
    }

    // Method untuk menghitung jumlah mata kuliah
    public int getJumlahMatkul() {
        return this.listMatKul.size();
    }

    // Method untuk mencetak data dasar mahasiswa
    public void printMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk mencetak detail mahasiswa (termasuk mata kuliah, dosen wali, dan
    // kendaraan)
    public void printDetailMhs() {
        printMhs();
        System.out.println("Daftar Mata Kuliah");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());
        System.out.println("No Plat Kendaraan: " + kendaraan.getJenis());
    }
}
// end class Mahasiswa
