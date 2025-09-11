public class Anggota {
    // atribut nomor KTP, nama, limit peminjaman, dan jumlah pinjaman
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    // konstruktor
    public Anggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    // method untuk menambahkan pinjaman dengan nama pinjam
    public void pinjam(int jumlah){
        if (jumlahPinjaman + jumlah > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah){
        if (jumlah < (0.1 * jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) {
                System.out.println("Angsuran anda melebihi sisa pinjaman. Kelebihan tidak dihitung.");
                jumlahPinjaman = 0;
            }
        }
    }

    public String getNama(){
        return this.nama;
    }

    public int getLimitPeminjaman(){
        return this.limitPeminjaman;
    }

    public int getJumlahPinjaman(){
        return this.jumlahPinjaman;
    }
}
