/* Nama File : BangunDatar.java
 * Deskripsi : Kelas abstrak yang merepresentasikan Bangun Datar dengan method-method abstrak untuk menghitung luas dan keliling
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */
package Materi;

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    // Konstruktor default
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Mengambil jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Mengatur jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengambil warna
    public String getWarna() {
        return warna;
    }

    // Mengatur warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengambil jenis border
    public String getBorder() {
        return border;
    }

    // Mengatur jenis border
    public void setBorder(String border) {
        this.border = border;
    }

    // Menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }

    // Menampilkan jumlah objek bangun datar yang telah dibuat
    public static void printcounterBangunDatar() {
        System.out.println("Counter Bangun Datar : " + counterBangunDatar);
    }

    // Method abstrak untuk menghitung luas
    public abstract double getLuas();

    // Method abstrak untuk menghitung keliling
    public abstract double getKeliling();

    // Memeriksa kesamaan luas dengan bangun datar lain
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Memeriksa kesamaan keliling dengan bangun datar lain
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}
