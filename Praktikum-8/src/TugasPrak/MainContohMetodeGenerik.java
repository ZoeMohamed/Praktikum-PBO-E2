/* Nama File : MainContohMetodeGenerik.java
 * Deskripsi : Main Program untuk mendemonstrasikan penggunaan metode generik
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 04/05/2025
 */

public class MainContohMetodeGenerik {
    public static void main(String[] args) {
        ContohMetodeGenerik C = new ContohMetodeGenerik();

        Kucing kucing = new Kucing("Garfield");
        Anjing anjing = new Anjing("Maxxy");
        Burung burung = new Burung("Meraki");

    
        C.isiDatum(new Datum<>(kucing)).Gerak(); // Menggunakan inferensi tipe, compiler menentukan G sebagai Kucing
        C.TampilkanGerakdanSuara(new Datum<>(kucing)); // Menggunakan parameter tipe dibatasi (G extends Anabul)

        // Contoh pembuatan objek generik dan pemanggilan metode dalam satu baris
        (new ContohMetodeGenerik()).TampilkanGerakdanSuara(new Datum<>(anjing)); 
        (new ContohMetodeGenerik()).TampilkanGerakdanSuara(new Datum<>(burung)); 

        System.out.println("\n=== PERILAKU KHAS HEWAN DENGAN METODE GENERIK ===");
        // Menampilkan perilaku khas masing-masing hewan menggunakan metode generik
        C.TampilkanPerilakuKhas(new Datum<>(kucing)); 
        C.TampilkanPerilakuKhas(new Datum<>(anjing)); 
        C.TampilkanPerilakuKhas(new Datum<>(burung)); 

        // Contoh lainnya menggunakan objek sementara
        System.out.println("\n=== PERILAKU KHAS DENGAN INLINE INSTANTIATION ===");
        (new ContohMetodeGenerik()).TampilkanPerilakuKhas(new Datum<>(new Kucing("Kuciang"))); // Inline dengan Kucing baru
        (new ContohMetodeGenerik()).TampilkanPerilakuKhas(new Datum<>(new Anjing("Sparky"))); // Inline dengan Anjing
                                                                                             // baru
        (new ContohMetodeGenerik()).TampilkanPerilakuKhas(new Datum<>(new Burung("Twitter"))); // Inline dengan Burung
                                                                                              // baru
    }
}