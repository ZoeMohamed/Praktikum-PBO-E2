/* Nama File : Pegawai.java
 * Deskripsi : Kelas dasar Pegawai untuk implementasi polimorfisme
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    // method
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + " , Gaji Pokok : " + gajiPokok);
    }
}