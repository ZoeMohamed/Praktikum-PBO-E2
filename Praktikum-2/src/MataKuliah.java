/* Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class MataKuliah
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/02/2025
 */
public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    // Konstruktor tanpa parameter
    public MataKuliah() {
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Getter untuk idMatkul
    public String getIdMatkul() {
        return this.idMatkul;
    }

    // Setter untuk idMatkul
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk sks
    public int getSks() {
        return this.sks;
    }

    // Setter untuk sks
    public void setSks(int sks) {
        this.sks = sks;
    }
}
