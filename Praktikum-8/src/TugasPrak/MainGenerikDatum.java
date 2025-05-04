/* Nama File : MainGenerikDatum.java
 * Deskripsi : Main Program untuk mendemonstrasikan penggunaan kelas generik Datum
 * Pembuat   : Zoe Mohamed // 24060123140182
 * Tanggal   : 04/05/2025
 */

public class MainGenerikDatum {
    public static void main(String[] args) {
        Anjing anjing = new Anjing("Maxxy");
        Kucing kucing = new Kucing("Garfield");
        Burung burung = new Burung("Meraki");

        Datum<Anabul> datum = new Datum<>();

        System.out.println("\n--- Perilaku Anjing ---");
        datum.setIsi(anjing);
        datum.getIsi().Gerak();
        datum.getIsi().Bersuara();
        datum.getIsi().PerilakuKhas();

        System.out.println("\n--- Perilaku Kucing ---");
        datum.setIsi(kucing);
        datum.getIsi().Gerak();
        datum.getIsi().Bersuara();
        datum.getIsi().PerilakuKhas();

        System.out.println("\n--- Perilaku Burung ---");
        datum.setIsi(burung);
        datum.getIsi().Gerak();
        datum.getIsi().Bersuara();
        datum.getIsi().PerilakuKhas();

        Datum<Anabul> datumAnjing = new Datum<>(anjing);
        Datum<Anabul> datumKucing = new Datum<>(kucing);
        Datum<Anabul> datumBurung = new Datum<>(burung);

        datumAnjing.getIsi().PerilakuKhas();
        datumKucing.getIsi().PerilakuKhas();
        datumBurung.getIsi().PerilakuKhas();
    }
}
