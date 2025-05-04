/* Nama File : BangunDatarGeneric.java
 * Deskripsi : kelas generic untuk bangun datar
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 01/05/2025
 */

public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;
    
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    
    public T get(){
        return bangunDatar;
    }
    
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}