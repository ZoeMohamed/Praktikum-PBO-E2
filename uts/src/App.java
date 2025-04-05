public class App {
    public static void main(String[] args) {
        // Create a faculty
        Fakultas fsm = new Fakultas("Fakultas Sains dan Matematika", 15000);

        // Create departments
        Departemen matematika = new Departemen("Matematika", 12000);
        Departemen fisika = new Departemen("Fisika", 13000);
        Departemen biologi = new Departemen("Biologi", 14000);

        // Add departments to faculty
        fsm.tambahDepartemen(matematika);
        fsm.tambahDepartemen(fisika);
        fsm.tambahDepartemen(biologi);

        // Add classrooms to faculty
        fsm.tambahRuangKelas("RK-01", 10, 8, 3, 40, 38, 2);
        fsm.tambahRuangKelas("RK-02", 12, 10, 3, 60, 58, 2);

        // Add laboratories to faculty
        fsm.tambahLaboratorium("LAB-KOMP-01", 15, 12, 3, 30, "Laboratorium Komputer 1", 100000);
        fsm.tambahLaboratorium("LAB-FISIKA", 20, 15, 3, 40, "Laboratorium Fisika", 150000);

        // Add department rooms to departments
        matematika.tambahRuangDepartemen("MTK-01", 8, 6, 3, 15, 5, 15, 8);
        fisika.tambahRuangDepartemen("FSK-01", 8, 7, 3, 20, 6, 20, 10);

        // Add lecturer rooms to departments
        matematika.tambahRuangDosen("DOS-MTK-01", 4, 3, 3, 3, "Dr. Ahmad", 3, 2);
        matematika.tambahRuangDosen("DOS-MTK-02", 4, 3, 3, 3, "Dr. Budi", 3, 2);
        fisika.tambahRuangDosen("DOS-FSK-01", 5, 4, 3, 4, "Dr. Charlie", 4, 2);

        // Get the rooms from faculty
        System.out.println("=== FSM ROOM DATA SYSTEM ===");
        System.out.println();

        // Display faculty information
        fsm.tampilkanInfoFakultas();
        System.out.println();

        // Display all classes in the faculty
        System.out.println("=== DAFTAR RUANG KELAS ===");
        for (RuangKelas ruangKelas : fsm.getDaftarRuangKelas()) {
            ruangKelas.tampilkanInfoRuang();
            System.out.println("Biaya Kebersihan: Rp " + ruangKelas.hitungBiayaKebersihan());
            System.out.println();
        }

        // Display all laboratories in the faculty
        System.out.println("=== DAFTAR LABORATORIUM ===");
        for (Laboratorium lab : fsm.getDaftarLaboratorium()) {
            lab.tampilkanInfoRuang();
            System.out.println("Biaya Kebersihan: Rp " + lab.hitungBiayaKebersihan());
            System.out.println("Biaya Sewa 3 Jam: Rp " + lab.hitungSewa(3));
            System.out.println();

            // Add a computer lab
            if (lab.getKode().equals("LAB-KOMP-01")) {
                LabKomputer labKomp = new LabKomputer(lab.getKode(), lab.getPanjang(), lab.getLebar(),
                        lab.getTinggi(), lab.getKapasitas(), lab.getNamaLab(),
                        lab.getHargaSewa(), fsm, 25);

                labKomp.tampilkanInfoRuang();
                System.out.println("Biaya Kebersihan: Rp " + labKomp.hitungBiayaKebersihan());
                System.out.println("Biaya Sewa 3 Jam: Rp " + labKomp.hitungSewa(3));
                System.out.println();
            }

            // Add a non-computer lab with courses
            if (lab.getKode().equals("LAB-FISIKA")) {
                LabNonKomputer labNonKomp = new LabNonKomputer(lab.getKode(), lab.getPanjang(), lab.getLebar(),
                        lab.getTinggi(), lab.getKapasitas(), lab.getNamaLab(),
                        lab.getHargaSewa(), fsm);

                labNonKomp.tambahMatakuliah("Fisika Dasar");
                labNonKomp.tambahMatakuliah("Fisika Modern");
                labNonKomp.tambahMatakuliah("Fisika Kuantum");

                labNonKomp.tampilkanInfoRuang();
                System.out.println("Biaya Kebersihan: Rp " + labNonKomp.hitungBiayaKebersihan());
                System.out.println("Biaya Sewa 3 Jam: Rp " + labNonKomp.hitungSewa(3));
                System.out.println();
            }
        }

        // Display all departments
        for (Departemen dept : fsm.getDaftarDepartemen()) {
            System.out.println("=== DEPARTEMEN " + dept.getNama().toUpperCase() + " ===");
            dept.tampilkanInfoDepartemen();
            System.out.println();

            // Display department rooms
            System.out.println("=== DAFTAR RUANG DEPARTEMEN " + dept.getNama().toUpperCase() + " ===");
            for (RuangDepartemen ruangDept : dept.getDaftarRuangDepartemen()) {
                ruangDept.tampilkanInfoRuang();
                System.out.println("Biaya Kebersihan: Rp " + ruangDept.hitungBiayaKebersihan());
                System.out.println();
            }

            // Display lecturer rooms
            System.out.println("=== DAFTAR RUANG DOSEN DEPARTEMEN " + dept.getNama().toUpperCase() + " ===");
            for (RuangDosen ruangDosen : dept.getDaftarRuangDosen()) {
                ruangDosen.tampilkanInfoRuang();
                System.out.println("Biaya Kebersihan: Rp " + ruangDosen.hitungBiayaKebersihan());
                System.out.println();
            }
        }

        // Calculate total cleaning cost
        System.out.println("=== BIAYA KEBERSIHAN ===");
        System.out.println("Total Biaya Kebersihan Fakultas: Rp " + fsm.hitungTotalBiayaKebersihan());

        for (Departemen dept : fsm.getDaftarDepartemen()) {
            System.out.println("Total Biaya Kebersihan Departemen " + dept.getNama() + ": Rp " +
                    dept.hitungTotalBiayaKebersihan());
        }
    }
}
