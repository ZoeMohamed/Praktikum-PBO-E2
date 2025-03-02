/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/02/2025
 */
public class Kendaraan {
    private String noPlat;
    private String jenis;

    // Konstruktor tanpa parameter
    public Kendaraan() {
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Getter untuk noPlat
    public String getNoPlat() {
        return noPlat;
    }

    // Setter untuk noPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Getter untuk jenis
    public String getJenis() {
        return jenis;
    }

    // Setter untuk jenis
    public void setJenis(String jenis) {
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")) {
            this.jenis = jenis;
        } else {
            System.out.println("Jenis Kendaraan harus motor atau mobil 😎");
        }
    }
}
