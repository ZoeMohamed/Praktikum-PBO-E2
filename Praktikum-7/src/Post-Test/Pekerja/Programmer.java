/* Nama File : Programmer.java
 * Deskripsi : Kelas turunan Programmer yang mewarisi Pegawai untuk implementasi polimorfisme
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

public class Programmer extends Pegawai {
    private int bonus = 4500000;

    // Konstruktor
    public Programmer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
} 