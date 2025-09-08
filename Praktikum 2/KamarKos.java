public class KamarKos {
    public int hargaSewa, nomorKamar; // baris 2-3 deklarasi atribut kamar kos
    public String status; 

    public KamarKos() {
    }

    public KamarKos(int hargaSewa, int nomorKamar, String status) { // pembuatan constructor berparameter
        this.hargaSewa = hargaSewa;
        this.nomorKamar = nomorKamar;
        this.status = status;
    }
    
    public void displayInfo() { // pembuatan method displayInfo
        System.out.println("-------------------------------");
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Harga Sewa : " + hargaSewa);
        System.out.println("Status : " + status);
        System.out.println("-------------------------------");
    }

    public int ubahHargaSewa(int hargaSewa) { // pembuatan method ubahHargaSewa
        return hargaSewa;
    }

    public String ubahStatus(String status) { // pembuatan method ubahStatus
        return status;
    }

}
