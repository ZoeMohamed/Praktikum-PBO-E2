/* Nama File : Datum.java
 * Deskripsi : Kelas generik Datum untuk menyimpan data dengan tipe generik
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 04/05/2025
 */

// Kelas Datum menggunakan parameter tipe generik G untuk mewakili tipe data yang fleksibel
class Datum<G> {
    G isi; // Variabel bertipe generik G, dapat menyimpan objek dari tipe apapun sesuai
           // parameter tipe

    // Method untuk mengambil nilai isi dengan tipe generik G
    G getIsi() {
        return isi;
    }

    // Method untuk mengatur nilai isi dengan parameter bertipe generik G
    void setIsi(G isi) {
        this.isi = isi;
    }

    // Constructor default
    Datum() {
        // Default constructor
    }

    // Constructor dengan parameter bertipe generik G
    Datum(G x) {
        isi = x;
    }
}