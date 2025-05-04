/* Nama File : TestSenjata.java
 * Deskripsi : kelas untuk menguji senjata dengan tingkat kesulitan sangat mudah
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 01/05/2025
 */

package latihanVeryEasy;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        ak47.getPeluru();
        ak47.setPeluru(5);
        System.out.println("AK47 mengisi peluru ");
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}