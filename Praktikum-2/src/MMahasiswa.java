/* Nama File : MMahasiswa.java
 * Deskripsi : Menguji Class Mahasiswa,Dosen,Kendaraan,MataKuliah
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/02/2025
 */
public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("234", "Citra", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }

}
