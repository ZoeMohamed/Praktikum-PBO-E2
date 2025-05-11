
/**
 * Nama File : MapTest.java
 * Deskripsi : program penggunaan Map dan HashMap
 * Pembuat : Zoe Mohamed // 24060123140182
 * Tanggal : 11/05/2025
 */
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<String, String> map = new HashMap<String, String>();
        // menempatkan elemen kunci dan nilai
        map.put("a", "Satu");
        map.put("b", "Dua");
        map.put("c", "Empat");
        map.put("d", "Lima");
        map.put("e", "Tiga");
        // Mengambil elemen pertama
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        // mengambil keseluruhan kunci sebagai objek collection set
        List<String> key = new ArrayList<>(map.keySet());
        for (String i : key) {
            System.out.println(i + " " + map.get(i));
        }
    }
}