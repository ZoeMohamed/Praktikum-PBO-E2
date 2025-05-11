/**
 * Nama File : MKoleksi.java
 * Deskripsi : Main class untuk generic Koleksi
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 11/05/2025
 */
public class MKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        for (char c = 'A'; c <= 'J'; c++) {
            koleksiKarakter.add(c);
        }

        System.out.println("Koleksi Karakter");
        koleksiKarakter.showAll();

        koleksiKarakter.setIsi(1, 'Z');
        System.out.println("Koleksi Karakter setelah dilakukan setIsi");
        koleksiKarakter.showAll();
        System.out.println("Elemen koleksi saat ini :" + koleksiKarakter.getNbelm());

        Character hapus = koleksiKarakter.delete();
        System.out.println("Koleksi Karakter setelah dilakukan delete");
        koleksiKarakter.showAll();
        System.out.println("Elemen yang terhapus :" + hapus);
        System.out.println("Elemen koleksi saat ini :" + koleksiKarakter.getNbelm());

        // Demonstrasi penggunaan setSize
        System.out.println("\nDemo penggunaan setSize untuk mengubah ukuran koleksi:");
        System.out.println("Mengubah ukuran koleksi menjadi 5 elemen");
        koleksiKarakter.setSize(5);
        koleksiKarakter.showAll();
        System.out.println("Elemen koleksi saat ini :" + koleksiKarakter.getNbelm());

        System.out.println("\nMengubah ukuran koleksi menjadi 8 elemen");
        koleksiKarakter.setSize(8);
        koleksiKarakter.showAll();
        System.out.println("Elemen koleksi saat ini :" + koleksiKarakter.getNbelm());
    }
}
