/* Nama File : TestPolimorfisme.java
 * Deskripsi : Program utama untuk mendemonstrasikan konsep polimorfisme pada kelas Pegawai dan turunannya
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        Programmer pegawai4 = new Programmer("Rahmat");
        Programmer pegawai5 = new Programmer("Zikry");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}