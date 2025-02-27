/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat   : Zoe Mohamed
 * Tanggal   : 27/02/2025
 */

public class Titik {
    /* atribut */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* method */
    // Konstruktor untuk membuat titik (0,0)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik (0,0)
    Titik() {
        this(0, 0);
    }

    // Mengembalikan nilai counter titik
    static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak kordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    // Mencetak kuadran titik
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return -1;
        }
    }

    // Mencetak Jarak titik dengan titik pusat
    public double getJarakPusat() {
        return Math.sqrt((absis - 0.0) * (absis - 0.0) + (ordinat - 0.0) * (ordinat - 0.0));

    }

    // Mencetak Jarak titik dengan titik lainnya
    public double getJarak(Titik T) {
        return Math.sqrt((absis - T.absis) * (absis - T.absis) + (ordinat - T.ordinat) * (ordinat - T.ordinat));

    }

    // Mengeset Titik refleksi terhadap xumbu x
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // Mengeset Titik refleksi terhadap sumbu y
    public void refleksiY() {
        absis = -absis;
    }

    // Mencetak Refleksi terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);

    }

    // Mencetak Refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);

    }
    // end class titik

}