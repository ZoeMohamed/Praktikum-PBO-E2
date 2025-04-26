/* Nama File : Person.java
 * Deskripsi : Kelas dasar Person untuk mendemonstrasikan Polimorfisme Universal (Inclusion) pada Java
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 26/04/2025
 */
package Manusia;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public boolean isAsleep(int hr) {
        return hr > 22 || hr < 7;
    }

    public String toString() {
        return name;
    }

    public void status(int hr) {
        if (this.isAsleep(hr)) {
            System.out.println("Now offline " + this);
        } else {
            System.out.println("Now Online " + this);
        }
    }
}