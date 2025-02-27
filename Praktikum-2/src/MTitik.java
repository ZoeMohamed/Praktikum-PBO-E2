/* Nama File : MTitik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Zoe Mohamed
 * Tanggal   : 20/02/2025
 */
public class MTitik {
    public static void main(String[] args) {
        // Membuat dua objek Titik
        Titik titik1 = new Titik(3, 4);
        Titik titik2 = new Titik(-2, 5);

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah objek Titik yang telah dibuat: " + Titik.getCounterTitik());

        // Menampilkan koordinat titik1 dan titik2
        System.out.println("Koordinat titik1:");
        titik1.printTitik();
        System.out.println("Koordinat titik2:");
        titik2.printTitik();

        // Mengubah koordinat titik1
        titik1.setAbsis(5);
        titik1.setOrdinat(6);
        System.out.println("Koordinat titik1 setelah diubah:");
        titik1.printTitik();

        // Menggeser titik1 sejauh (2, 3)
        titik1.geser(2, 3);
        System.out.println("Koordinat titik1 setelah digeser:");
        titik1.printTitik();

        // Menentukan kuadran titik1 dan titik2
        System.out.println("Kuadran titik1: " + titik1.getKuadran());
        System.out.println("Kuadran titik2: " + titik2.getKuadran());

        // Menghitung jarak titik1 ke pusat koordinat
        System.out.println("Jarak titik1 ke pusat koordinat: " + titik1.getJarakPusat());

        // Menghitung jarak titik1 ke titik2
        System.out.println("Jarak titik1 ke titik2: " + titik1.getJarak(titik2));

        // Melakukan refleksi titik1 terhadap sumbu X
        titik1.refleksiX();
        System.out.println("Koordinat titik1 setelah direfleksikan terhadap sumbu X:");
        titik1.printTitik();

        // Melakukan refleksi titik1 terhadap sumbu Y
        titik1.refleksiY();
        System.out.println("Koordinat titik1 setelah direfleksikan terhadap sumbu Y:");
        titik1.printTitik();

        // Mendapatkan refleksi titik2 terhadap sumbu X dan Y
        Titik refleksiX = titik2.getRefleksiX();
        Titik refleksiY = titik2.getRefleksiY();
        System.out.println("Refleksi titik2 terhadap sumbu X:");
        refleksiX.printTitik();
        System.out.println("Refleksi titik2 terhadap sumbu Y:");
        refleksiY.printTitik();
    }
}
