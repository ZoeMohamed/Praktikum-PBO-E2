/**
 * Nama File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 01/05/2025
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        // Test Lingkaran
        double jariLingkaran = 2;
        Lingkaran l = new Lingkaran(jariLingkaran);
        BangunDatarGenerik<Lingkaran> bdg = new BangunDatarGenerik<Lingkaran>();
        bdg.set(l);
        System.out.println("=== LINGKARAN ===");
        System.out.println("Jari-jari: " + jariLingkaran);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("Luas lingkaran: " + bdg.hitungLuas());
        System.out.println("Tipe generic: " + bdg.get().getClass().getName());

        // Test Persegi
        double sisiPersegi = 4;
        Persegi p = new Persegi(sisiPersegi);
        BangunDatarGenerik<Persegi> bdgP = new BangunDatarGenerik<Persegi>();
        bdgP.set(p);
        System.out.println("\n=== PERSEGI ===");
        System.out.println("Sisi: " + sisiPersegi);
        System.out.println("Keliling persegi: " + bdgP.hitungKeliling());
        System.out.println("Luas persegi: " + bdgP.hitungLuas());
        System.out.println("Tipe generic: " + bdgP.get().getClass().getName());

        // Test PersegiPanjang
        double panjang = 5;
        double lebar = 3;
        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
        BangunDatarGenerik<PersegiPanjang> bdgPP = new BangunDatarGenerik<PersegiPanjang>();
        bdgPP.set(pp);
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Keliling persegi panjang: " + bdgPP.hitungKeliling());
        System.out.println("Luas persegi panjang: " + bdgPP.hitungLuas());
        System.out.println("Tipe generic: " + bdgPP.get().getClass().getName());

        // Test Segitiga
        double alas = 3;
        double tinggi = 4;
        double sisiB = 5;
        double sisiC = 5;
        Segitiga s = new Segitiga(alas, tinggi, sisiB, sisiC);
        BangunDatarGenerik<Segitiga> bdgS = new BangunDatarGenerik<Segitiga>();
        bdgS.set(s);
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi B: " + sisiB);
        System.out.println("Sisi C: " + sisiC);
        System.out.println("Keliling segitiga: " + bdgS.hitungKeliling());
        System.out.println("Luas segitiga: " + bdgS.hitungLuas());
        System.out.println("Tipe generic: " + bdgS.get().getClass().getName());
    }
}