
/* Nama File : Person.java
 * Deskripsi : Kelas Person yang merepresentasikan data orang
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 15/05/2025
 */
import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}