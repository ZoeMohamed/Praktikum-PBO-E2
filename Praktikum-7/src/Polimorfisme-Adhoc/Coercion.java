/* Nama File : Coercion.java
 * Deskripsi : Program untuk mendemonstrasikan konsep coercion pada Java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 24/04/2025
 */

public class Coercion {
    public static void main(String[] args) {
        // Program nomor 1
        int output1 = 'a';
        System.out.println(output1);

        /**
         * Output:
         * 97
         * Penjelasan:
         * Karakter 'a' secara otomatis di-coerce (diubah) menjadi nilai ASCII-nya,
         * yaitu 97.
         * Ini adalah contoh coercion dari tipe char ke tipe int.
         */

        // Program nomor 2
        double x = 15.5;
        int output2 = (int) x; // Perlu casting eksplisit
        System.out.println(output2);

        /**
         * Output:
         * 15
         * Penjelasan:
         * Nilai double 15.5 di-coerce menjadi int dengan casting eksplisit.
         * Bagian desimal (0.5) akan dibuang, sehingga hasilnya adalah 15.
         */

        // Program nomor 3
        int y = 25;
        double output3 = y; // Coercion otomatis
        System.out.println(output3);

        /**
         * Output:
         * 25.0
         * Penjelasan:
         * Nilai int 25 secara otomatis di-coerce menjadi double.
         * Ini adalah contoh coercion dari tipe int ke tipe double.
         */

        // Program nomor 4
        int z = 78;
        char output4 = (char) z;
        System.out.println(output4);

        // Output: N (berhasil)
        // Penjelasan: Casting, mengubah 78 ke character code
        // Ascii
        // *

        // Program nomor 5
        char a = 'a';
        double output5 = a;
        System.out.println(output5);

        /**
         * Output: 97.0 (Berhasil!)
         * Penjelasan: Coersion, dikonversi oleh compiler ke
         * kode ascii dan menjadi double jadi hasilnya adalah 97.0
         */
    }
}