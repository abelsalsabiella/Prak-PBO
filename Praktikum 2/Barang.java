public class Barang {
    public String kode; // baris 2-5 deklarasi variabel
    public String nama;
    public double hargaKotor;
    public double diskon;

    public double getHargaBersih() { // baris 7-9 pembuatan method getHargaBersih
        return hargaKotor - diskon * hargaKotor; // Rumus mencari harga bersih
    }

    public void displayInfo() { // baris 11-17 pembuatan method displayInfo
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("Harga Kotor  : " + hargaKotor);
        System.out.println("Diskon       : " + diskon);
        System.out.println("Harga Bersih : " + getHargaBersih());
    }
}
