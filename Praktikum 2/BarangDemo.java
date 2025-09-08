public class BarangDemo {
    public static void main(String[] args) {
        Barang barang1 = new Barang(); // Baris 3-7 pembuatan objek barang1
        barang1.kode = "ATK01";
        barang1.nama = "Bolpoin Pilot Hitam";
        barang1.hargaKotor = 3500;
        barang1.diskon = 0.1;
        barang1.displayInfo(); // Baris 8 pemanggilan method displayInfo
    }
}
