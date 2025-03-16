/* Nama File : BangunDatar.java
 * Deskripsi : Program Inheritance Dengan Parent BangunDater
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 13/03/2025
 */
package Materi;

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;

    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);

        System.out.println("Border : " + border);

    }

    public static void printcounterBangunDatar() {
        System.out.println("Counter Bangun Datar : " + counterBangunDatar);
    }

}
