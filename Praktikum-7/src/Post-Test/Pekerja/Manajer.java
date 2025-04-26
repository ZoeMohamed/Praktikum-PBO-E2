/* Nama File : Manajer.java
 * Deskripsi : Kelas turunan Manajer yang mewarisi Pegawai untuk implementasi polimorfisme
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    // METHOD
    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}