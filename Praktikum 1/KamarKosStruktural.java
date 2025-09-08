public class KamarKosStruktural {
    public static void main(String[] args) {
        int hargaSewa, nomorKamar;
        String status;        
        int hargaSewa2, nomorKamar2;
        String status2;
        int hargaSewa3, nomorKamar3;
        String status3;
        int hargaSewa4, nomorKamar4;
        String status4;
        int hargaSewa5, nomorKamar5;
        String status5;
        int hargaSewa6, nomorKamar6;
        String status6;
        int hargaSewa7, nomorKamar7;
        String status7;
        int hargaSewa8, nomorKamar8;
        String status8;
        int hargaSewa9, nomorKamar9;
        String status9;
        int hargaSewa10, nomorKamar10;
        String status10;

        nomorKamar = 1; hargaSewa = 600000; status = "terisi"; 
        nomorKamar2 = 2; hargaSewa2 = 600000; status2 = "kosong";
        nomorKamar3 = 3; hargaSewa3 = 750000; status3 = "kosong";
        nomorKamar4 = 4; hargaSewa4 = 750000; status4 = "terisi";
        nomorKamar5 = 5; hargaSewa5 = 800000; status5 = "terisi";
        nomorKamar6 = 6; hargaSewa6 = 800000; status6 = "terisi";
        nomorKamar7 = 7; hargaSewa7 = 850000; status7 = "terisi";
        nomorKamar8 = 8; hargaSewa8 = 850000; status8 = "kosong";
        nomorKamar9 = 9; hargaSewa9 = 900000; status9 = "terisi";
        nomorKamar10 = 10; hargaSewa10 = 900000; status10 = "terisi";

        hargaSewa2 = ubahHargaSewa(550000);
        status6 = ubahStatus("kosong");

        System.out.println("---------------------");
        System.out.println("Kamar Kos Struktural");
        System.out.println("---------------------");
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Harga Sewa : " + hargaSewa);
        System.out.println("Status : " + status);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar2);
        System.out.println("Harga Sewa : " + hargaSewa2);
        System.out.println("Status : " + status2);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar3);
        System.out.println("Harga Sewa : " + hargaSewa3);
        System.out.println("Status : " + status3);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar4);
        System.out.println("Harga Sewa : " + hargaSewa4);
        System.out.println("Status : " + status4);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar5);
        System.out.println("Harga Sewa : " + hargaSewa5);
        System.out.println("Status : " + status5);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar6);
        System.out.println("Harga Sewa : " + hargaSewa6);
        System.out.println("Status : " + status6);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar7);
        System.out.println("Harga Sewa : " + hargaSewa7);
        System.out.println("Status : " + status7);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar8);
        System.out.println("Harga Sewa : " + hargaSewa8);
        System.out.println("Status : " + status8);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar9);
        System.out.println("Harga Sewa : " + hargaSewa9);
        System.out.println("Status : " + status9);
        System.out.println("___________________________");
        System.out.println("Nomor Kamar : " + nomorKamar10);
        System.out.println("Harga Sewa : " + hargaSewa10);
        System.out.println("Status : " + status10);

        System.out.println("-------------------------------------");
        System.out.println("Kamar Kos Struktural Setelah diubah");
        System.out.println("-------------------------------------");
        // method mengubah harga sewa
        System.out.println("Harga Sewa Kamar No. 2: " + hargaSewa2);
        // mengubah status
        System.out.println("Status Kamar Nomor 6: " + status6);
    }
    
    public static int ubahHargaSewa(int hargaSewa) {
        return hargaSewa;
    }

    public static String ubahStatus(String status) {
        return status;
    }
    
    public static int tambahKamar(int nomorKamar, int increment) {
        nomorKamar += increment;

        return nomorKamar;
    }
}