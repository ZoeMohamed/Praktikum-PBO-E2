/* Nama File : Main.java
 * Deskripsi : Menguji semua class yang sudah dibuat
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 27/03/2025
 */

 public class Main {
    public static void main(String[] args) {
        // Membuat objek Fakultas
        Fakultas fsm = new Fakultas("Fakultas Sains dan Matematika", 50000);

        // Membuat dan menambahkan Ruang Kelas ke Fakultas,padsa soal ruang kelas dan lab terkait dengan fakultas
        RuangKelas rk1 = new RuangKelas("RK001", 10, 8, 3, 40, 38, 2, fsm);
        RuangKelas rk2 = new RuangKelas("RK002", 12, 10, 3, 60, 55, 5, fsm);
        fsm.tambahRuangKelas(rk1);
        fsm.tambahRuangKelas(rk2);

        // Membuat dan menambahkan Laboratorium ke Fakultas
        LaboratoriumKomputer labKom1 = new LaboratoriumKomputer(
                "LK001", 15, 12, 3, 30, "Lab Pemrograman", 150000, 25, fsm);

        String[] mataKuliah = { "Biologi Sel", "Mikrobiologi", "Anatomi Tumbuhan" };
        LaboratoriumNonKomputer labBio = new LaboratoriumNonKomputer(
                "LB001", 12, 10, 3, 25, "Lab Biologi", 125000, mataKuliah, fsm);

        fsm.tambahLaboratorium(labKom1);
        fsm.tambahLaboratorium(labBio);

        // Membuat objek Departemen
        Departemen deptiMat = new Departemen("Departemen Matematika", "Dr. Bambang", 40000);

        // Membuat dan menambahkan Ruang Departemen ke Departemen
        RuangDepartemen rdMat = new RuangDepartemen(
                "RD001", 8, 6, 3, 20, 5, 15, 8, deptiMat);
        deptiMat.tambahRuangDepartemen(rdMat);

        // Membuat dan menambahkan Ruang Dosen ke Departemen
        RuangDosen rdosen1 = new RuangDosen(
                "RDS001", 5, 4, 3, 5, "Dr. Siti", 4, 2, deptiMat);
        RuangDosen rdosen2 = new RuangDosen(
                "RDS002", 5, 4, 3, 5, "Dr. Joko", 3, 2, deptiMat);
        deptiMat.tambahRuangDosen(rdosen1);
        deptiMat.tambahRuangDosen(rdosen2);

        // Menampilkan Informasi Fakultas dan Departemen
        System.out.println("======= INFORMASI FSM =======\n");
        
        // Tampilkan informasi fakultas dengan method tampilkanInfo()
        fsm.tampilkanInfo();
        System.out.println();

        fsm.tampilkanInfoRuangKelas();
        System.out.println();

        fsm.tampilkanInfoLaboratorium();
        System.out.println();

        System.out.println("Total Biaya Kebersihan Fakultas: Rp " + fsm.hitungTotalBiayaKebersihan());
        System.out.println("\n--------------------------------\n");

        // Tampilkan informasi departemen dengan method tampilkanInfo()
        deptiMat.tampilkanInfo();
        System.out.println();

        deptiMat.tampilkanInfoRuangDepartemen();
        System.out.println();

        deptiMat.tampilkanInfoRuangDosen();
        System.out.println();

        System.out.println("Total Biaya Kebersihan Departemen: Rp " + deptiMat.hitungTotalBiayaKebersihan());
        
        // Demonstrasi penggunaan setter
        System.out.println("\n======= DEMONSTRASI PERUBAHAN DATA =======\n");
        
        // Perbaikan kursi rusak di ruang kelas RK001
        System.out.println("1. Perbaikan kursi rusak di Ruang Kelas RK001");
        System.out.println("Sebelum perbaikan:");
        rk1.tampilkanInfo();
        
        // Update jumlah kursi
        rk1.setKursiTersedia(40);
        rk1.setKursiRusak(0);
        
        System.out.println("\nSetelah perbaikan:");
        rk1.tampilkanInfo();
        System.out.println();
        
        // Kenaikan tarif kebersihan fakultas
        System.out.println("2. Kenaikan tarif kebersihan Fakultas");
        System.out.println("Sebelum kenaikan:");
        fsm.tampilkanInfo();
        
        // Update tarif kebersihan
        fsm.setTarifKebersihan(50100);
        fsm.tampilkanInfo();
        System.out.println("Total Biaya Kebersihan Fakultas (baru): Rp " + fsm.hitungTotalBiayaKebersihan());

    }
}