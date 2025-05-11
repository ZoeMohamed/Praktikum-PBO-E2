
/**
 * Nama File : Koleksi.java
 * Deskripsi : Generic collection class implementasi
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 11/05/2025
 */
import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    // Konstruktor
    public Koleksi() {
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

    // Method
    // Fungsi
    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        }
        return null;
    }

    public void setIsi(int index, T e) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, e);
        }
    }

    public void setSize(int size) {
        if (size >= 0) {
            // If new size is smaller, remove excess elements
            while (nbelm > size) {
                wadah.remove(nbelm - 1);
                nbelm--;
            }
            // If new size is larger, add null elements
            while (nbelm < size) {
                wadah.add(null);
                nbelm++;
            }
        }
    }

    public void add(T e) {
        wadah.add(e);
        nbelm++;
    }

    public int getNbelm() {
        return nbelm;
    }

    public T delete() {
        if (nbelm > 0) {
            T e = wadah.remove(nbelm - 1);
            nbelm--;
            return e;
        }
        return null;
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ":" + wadah.get(i));
        }
    }
}