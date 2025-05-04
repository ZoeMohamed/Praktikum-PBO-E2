/* Nama File : KontrolSenjata.java
 * Deskripsi : kelas untuk mengontrol senjata dengan tingkat kesulitan medium
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 01/05/2025
 */

package latihanMedium;

public class KontrolSenjata {
    Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public boolean isAdaPeluru() {
        if (senjata.getPeluru() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println("Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()) {
            for (int i = jumlah; i > 0; i--) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa : " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Ojeb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

}