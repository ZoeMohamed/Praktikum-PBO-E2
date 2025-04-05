public abstract class Ruang {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;
    
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }
    
    // Getters and Setters
    public String getKode() {
        return kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public int getKapasitas() {
        return kapasitas;
    }
    
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
    // Method to calculate area
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    // Method to calculate volume
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
    // Abstract methods to be implemented by subclasses
    public abstract void tampilkanInfoRuang();
    public abstract double hitungBiayaKebersihan();
} 