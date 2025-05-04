/* Nama File : Senjata.java
 * Deskripsi : kelas untuk merepresentasikan senjata dengan tingkat kesulitan sangat mudah
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 01/05/2025
 */
package latihanVeryEasy;


public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (this.getPeluru() > 0) {
            System.out.println(this.getBunyi());
            this.setPeluru(this.getPeluru() - 1);
            System.out.println("Sisa peluru: " + this.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }

}
