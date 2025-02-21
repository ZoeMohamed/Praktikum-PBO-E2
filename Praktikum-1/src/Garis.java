public class Garis {
    Titik T1;
    Titik T2;
    static int counterGaris = 0;

    Garis(double x1, double y1, double x2, double y2) {
        this.T1 = new Titik();
        this.T2 = new Titik();

        this.T1.absis = x1;
        this.T1.ordinat = y1;

        this.T2.absis = x2;
        this.T2.ordinat = y2;

    }

    Garis() {
        this(0, 0, 1, 1);
    }

    double getT1Absis() {
        return T1.absis;
    }

    double getT2Absis() {
        return T2.absis;
    }

    double getT1Ordinat() {
        return T1.ordinat;
    }

    double getT2Ordinat() {
        return T2.ordinat;
    }

    void setT1Absis(double absis) {
        T1.absis = absis;
    }

    void setT2Absis(double absis) {
        T2.absis = absis;
    }

    void setT1Ordinat(double ordinat) {
        T1.ordinat = ordinat;
    }

    void setT2Ordinat(double ordinat) {
        T2.ordinat = ordinat;
    }

    double panjangGaris() {
        return Math.sqrt(Math.pow(T2.absis - T1.absis, 2) + Math.pow(T2.ordinat - T1.ordinat, 2));
    }

    double getGradient() {
        return (T2.ordinat - T1.ordinat) / (T2.absis - T1.absis);
    }

    Titik getTitikTengah() {
        return new Titik((T1.absis + T2.absis) / 2, (T1.ordinat + T2.ordinat) / 2);
    }

}