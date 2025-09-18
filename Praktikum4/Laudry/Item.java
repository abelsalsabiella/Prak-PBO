public class Item {
    private String namaItem;
    private double berat;
    private String jenis;

    public Item(String namaItem, double berat, String jenis) {
        this.namaItem = namaItem;
        this.berat = berat;
        this.jenis = jenis;
    }

    public double getHarga() {
        double hargaPerKg;
        switch (jenis.toLowerCase()) {
            case "express":
                hargaPerKg = 10000;
                break;
            case "dry clean":
                hargaPerKg = 15000;
                break;
            default:
                hargaPerKg = 7000;
        }
        return hargaPerKg * berat;
    }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }
    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getInfo() {
        String info ="";
        info += "\t\tItem: " + namaItem;
        info += ", Berat: " + berat + "kg";
        info += ", Jenis: " + jenis;
        info += ", Harga: Rp " + getHarga();
        info += "\n";   
        return info;
    }
}
