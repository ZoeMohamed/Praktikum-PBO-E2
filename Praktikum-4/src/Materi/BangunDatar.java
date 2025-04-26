/* Nama File : BangunDatar.java
 * Deskripsi : Program Inheritance Dengan Parent BangunDater
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 13/03/2025
 */
package Materi;

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;

    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);

        System.out.println("Border : " + border);

    }

    public static void printcounterBangunDatar() {
        System.out.println("Counter Bangun Datar : " + counterBangunDatar);
    }

}



def solve(N, K, sizes):
    sizes.sort()
    
    left, right = 0, int((K ** 0.5) // 2) + 1
    
    while left <= right:
        mid = (left + right) // 2
        total_area = 0
        
        for size in sizes:
            frame_size = size + 2 * mid
            total_area += frame_size * frame_size
            
            if total_area > K:
                break
        
        if total_area <= K:
            left = mid + 1
        else:
            right = mid - 1
    
    return right

N, K = map(int, input().split())
sizes = list(map(int, input().split()))

print(solve(N, K, sizes))