/* Nama File : MBangunDatar.java
 * Deskripsi : Kelas utama untuk menguji fungsionalitas kelas BangunDatar, Persegi, Lingkaran dan implementasi interface IResize
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 23/03/2025
 */

package Materi;
public class MBangunDatar {
    public static void main(String[] args) {
        // Membuat Objek Persegi
        Persegi p = new Persegi(5, "Hijau", "Kuning");
        System.out.println("Info Persegi");
        p.printInfo();
        System.out.println("Luas Persegi: " + p.getLuas());
        System.out.println("Keliling Persegi: " + p.getKeliling());
        System.out.println("");

        // Membuat Objek Lingkaran
        Lingkaran l = new Lingkaran(5, "Biru", "Putih");
        System.out.println("Info Lingkaran");
        l.printInfo();
        System.out.println("Luas Lingkaran: " + l.getLuas());
        System.out.println("Keliling Lingkaran: " + l.getKeliling());
        System.out.println("");

        // Demonstrasi polymorphism dengan array dari tipe BangunDatar
        BangunDatar[] bangunArray = new BangunDatar[2];
        bangunArray[0] = p;
        bangunArray[1] = l;

        System.out.println("Info Semua Bangun Datar:");
        for (BangunDatar bangun : bangunArray) {
            bangun.printInfo();
            System.out.println("Luas: " + bangun.getLuas());
            System.out.println("Keliling: " + bangun.getKeliling());
            System.out.println("");
        }

        // Membuat bangun datar dengan luas yang sama
        Persegi p2 = new Persegi(Math.sqrt(Math.PI * 6.25), "Merah", "Hitam");
        Lingkaran l2 = new Lingkaran(5, "Kuning", "Hitam");

        // Membuat bangun datar dengan keliling yang sama
        double sisiPersegiSamaKeliling = (Math.PI * 5) / 2;
        Persegi p3 = new Persegi(sisiPersegiSamaKeliling, "Ungu", "Putih");
        Lingkaran l3 = new Lingkaran(5, "Orange", "Hitam");

        // Demonstrasi penggunaan method isEqualLuas dan isEqualKeliling
        System.out.println("\nPerbandingan Luas:");
        System.out.println("Luas Persegi p: " + p.getLuas());
        System.out.println("Luas Lingkaran l: " + l.getLuas());
        System.out.println("Luas Persegi p2: " + p2.getLuas());
        System.out.println("Luas Lingkaran l2: " + l2.getLuas());
        System.out.println("p.isEqualLuas(l): " + p.isEqualLuas(l));
        System.out.println("p2.isEqualLuas(l2): " + p2.isEqualLuas(l2));

        System.out.println("\nPerbandingan Keliling:");
        System.out.println("Keliling Persegi p: " + p.getKeliling());
        System.out.println("Keliling Lingkaran l: " + l.getKeliling());
        System.out.println("Keliling Persegi p3: " + p3.getKeliling());
        System.out.println("Keliling Lingkaran l3: " + l3.getKeliling());
        System.out.println("p.isEqualKeliling(l): " + p.isEqualKeliling(l));
        System.out.println("p3.isEqualKeliling(l3): " + p3.isEqualKeliling(l3));

        // Demonstrasi penggunaan interface IResize
        System.out.println("\nDemonstrasi IResize:");

        // Demonstrasi pada Persegi
        System.out.println("Persegi sebelum diubah ukuran:");
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas: " + p.getLuas());

        p.zoomIn();
        System.out.println("Persegi setelah zoomIn (10% lebih besar):");
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas: " + p.getLuas());

        p.zoomOut();
        System.out.println("Persegi setelah zoomOut (10% lebih kecil):");
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas: " + p.getLuas());

        p.zoom(150);
        System.out.println("Persegi setelah zoom(150) (150%):");
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas: " + p.getLuas());

        // Demonstrasi pada Lingkaran
        System.out.println("\nLingkaran sebelum diubah ukuran:");
        System.out.println("Jari-jari: " + l.getJari());
        System.out.println("Luas: " + l.getLuas());

        l.zoomIn();
        System.out.println("Lingkaran setelah zoomIn (10% lebih besar):");
        System.out.println("Jari-jari: " + l.getJari());
        System.out.println("Luas: " + l.getLuas());

        l.zoomOut();
        System.out.println("Lingkaran setelah zoomOut (10% lebih kecil):");
        System.out.println("Jari-jari: " + l.getJari());
        System.out.println("Luas: " + l.getLuas());

        l.zoom(200);
        System.out.println("Lingkaran setelah zoom(200) (200%):");
        System.out.println("Jari-jari: " + l.getJari());
        System.out.println("Luas: " + l.getLuas());

        // Demonstrasi polimorfisme dengan interface IResize
        System.out.println("\nDemonstrasi polimorfisme dengan interface IResize:");
        IResize[] resizableObjects = new IResize[2];
        resizableObjects[0] = p;
        resizableObjects[1] = l;

        for (IResize obj : resizableObjects) {
            System.out.println("Sebelum diubah:");
            if (obj instanceof Persegi) {
                Persegi persegi = (Persegi) obj;
                System.out.println("Persegi dengan sisi: " + persegi.getSisi());
            } else if (obj instanceof Lingkaran) {
                Lingkaran lingkaran = (Lingkaran) obj;
                System.out.println("Lingkaran dengan jari-jari: " + lingkaran.getJari());
            }

            obj.zoom(50); // Resize ke 50%

            System.out.println("Setelah diubah (50%):");
            if (obj instanceof Persegi) {
                Persegi persegi = (Persegi) obj;
                System.out.println("Persegi dengan sisi: " + persegi.getSisi());
            } else if (obj instanceof Lingkaran) {
                Lingkaran lingkaran = (Lingkaran) obj;
                System.out.println("Lingkaran dengan jari-jari: " + lingkaran.getJari());
            }
            System.out.println();
        }

        // Menampilkan jumlah objek yang telah dibuat
        BangunDatar.printcounterBangunDatar();
    }
}
