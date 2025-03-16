/* Nama File : Mpegawai.java
 * Deskripsi : MainProgram Untuk Menguji class yang sudah didefinisikan
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 14/03/2025
 */

package Latihan;

import java.time.LocalDate;

public class MPegawai {
        // Method main - Entry point program untuk menguji semua kelas
        public static void main(String[] args) {
                // Membuat objek pegawai dasar
                Pegawai pegawai = new Pegawai(
                                "123456", // NIP
                                "John Doe", // Nama
                                LocalDate.of(1985, 1, 15), // Tanggal lahir (15 Januari 1985)
                                LocalDate.of(2010, 2, 1), // TMT (1 Februari 2010)
                                5000000 // Gaji Pokok
                );

                // Membuat objek dosen tetap
                DosenTetap dosenTetap = new DosenTetap(
                                "9545647548", // NIP
                                "78647324", // NIDN
                                "Andi", // Nama
                                LocalDate.of(1990, 5, 5), // Tanggal lahir (5 Mei 1990)
                                LocalDate.of(2015, 1, 1), // TMT (1 Januari 2015)
                                5000000.0, // Gaji Pokok
                                "Fakultas Sains dan Matematika"); // Fakultas

                // Membuat objek dosen tamu
                DosenTamu dosenTamu = new DosenTamu(
                                "9545647549", // NIDK
                                "78647325", // NIP
                                "Budi", // Nama
                                LocalDate.of(1990, 3, 15), // Tanggal lahir (15 Maret 1990)
                                LocalDate.of(2020, 7, 1), // TMT (1 Juli 2020)
                                4500000.0, // Gaji Pokok
                                "Fakultas Teknik", // Fakultas
                                LocalDate.of(2025, 12, 31)); // Masa kontrak berakhir (31 Desember 2025)

                // Membuat objek tenaga pendidik
                Tendik tendik = new Tendik(
                                "9545647550", // NIP
                                "Citra", // Nama
                                LocalDate.of(2000, 5, 5), // Tanggal lahir (5 Mei 2000)
                                LocalDate.of(2015, 7, 1), // TMT (1 Juli 2015)
                                "Akademik", // Bidang
                                5000000); // Gaji Pokok

                // Demonstrasi penggunaan setter dan getter
                System.out.println("=== CONTOH PENGGUNAAN SETTER DAN GETTER ===");

                // Mengubah nama pegawai dasar dan menampilkan informasi
                pegawai.setNama("Jane Doe");
                System.out.println("\nSetelah mengubah nama pegawai:");
                pegawai.printInfo();

                // Mengubah dan menampilkan nama dosen tetap
                System.out.println("Nama Dosen Tetap sebelum diubah: " + dosenTetap.getNama());
                dosenTetap.setNama("Andi Wijaya");
                System.out.println("Nama Dosen Tetap setelah diubah: " + dosenTetap.getNama());

                // Mengubah dan menampilkan fakultas dosen tamu
                System.out.println("Fakultas Dosen Tamu sebelum diubah: " + dosenTamu.getFakultas());
                dosenTamu.setFakultas("Fakultas Ekonomi dan Bisnis");
                System.out.println("Fakultas Dosen Tamu setelah diubah: " + dosenTamu.getFakultas());

                // Mengubah dan menampilkan bidang tendik
                System.out.println("Bidang Tendik sebelum diubah: " + tendik.getBidang());
                tendik.setBidang("Kemahasiswaan");
                System.out.println("Bidang Tendik setelah diubah: " + tendik.getBidang());
                System.out.println("");

                // Menampilkan informasi lengkap untuk semua objek
                System.out.println("=== INFORMASI PEGAWAI ===");
                pegawai.printInfo();

                System.out.println("\n=== INFORMASI DOSEN TETAP ===");
                dosenTetap.printInfo();

                System.out.println("\n=== INFORMASI DOSEN TAMU ===");
                dosenTamu.printInfo();

                System.out.println("\n=== INFORMASI TENDIK ===");
                tendik.printInfo();
        }
}