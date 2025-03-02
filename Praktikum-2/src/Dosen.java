/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/02/2025
 */
public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor tanpa parameter
    public Dosen() {
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Getter untuk nip
    public String getNip() {
        return this.nip;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    // Getter untuk prodi
    public String getProdi() {
        return this.prodi;
    }

    // Setter untuk nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter untuk prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
