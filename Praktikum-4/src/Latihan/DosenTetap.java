/* Nama File : DosenTetap.java
 * Deskripsi : Program Inheritance Sub Class DosenTetap dari parent class pegawai
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 14/03/2025
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Pegawai {
    private String nidn; // Nomor Induk Dosen Nasional
    private String fakultas; // Fakultas tempat dosen mengajar

    // Constructor default - Membuat objek dosen tetap tanpa nilai atribut awal
    DosenTetap() {
    }

    // Constructor dengan parameter - Membuat objek dosen tetap dengan nilai atribut
    // tertentu
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
            String fakultas) {
        // Memanggil constructor parent class (Pegawai)
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidn = nidn;
        this.fakultas = fakultas;
    }

    // Getter untuk NIDN - Mengambil nilai NIDN dosen tetap
    public String getNidn() {
        return nidn;
    }

    // Setter untuk NIDN - Mengatur nilai NIDN dosen tetap
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    // Getter untuk fakultas - Mengambil fakultas dosen tetap
    public String getFakultas() {
        return fakultas;
    }

    // Setter untuk fakultas - Mengatur fakultas dosen tetap
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Override method printInfo dari parent class untuk menampilkan informasi dosen tetap
    @Override
    public void printInfo() {
        Period masaKerja = hitungMasaKerja(); // Memanggil method parent untuk hitung masa kerja
        double tunjangan = hitungTunjangan(0.02); // Hitung tunjangan 2% x masa kerja x gaji pokok
        LocalDate bup = hitungBUP(65); // Hitung usia pensiun (65 tahun)

        System.out.println("NIDN                       : " + nidn);
        System.out.println("NIP                        : " + nip);
        System.out.println("Nama                       : " + nama);
        System.out.println("Tanggal Lahir              : " + formatTanggal(tanggalLahir));
        System.out.println("TMT                        : " + formatTanggal(tmt));
        System.out.println("Jabatan                    : Dosen Tetap");
        System.out.println("Fakultas                   : " + fakultas);
        System.out.println(
                "Masa Kerja                 : " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP                        : " + formatTanggal(bup));
        System.out.println("Gaji Pokok                 : " + formatRupiah(gajiPokok));
        System.out.println(
                "Tunjangan                  : 2% x " + masaKerja.getYears() + " X " + formatRupiah(gajiPokok) + " = "
                        + formatRupiah(tunjangan));
    }
}