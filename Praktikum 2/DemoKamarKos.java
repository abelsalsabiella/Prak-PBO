
import java.util.Scanner;

public class DemoKamarKos {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        // menggunakan parameter
        System.out.print("Masukkan nomor kamar ke-1 : "); // masukkan nomor kamar dan harga sewa dan status
        int no1 = input01.nextInt();
        System.out.print("Masukkan harga sewa kamar ke-1: ");
        int harga1 = input01.nextInt();
        System.out.print("Masukkan status kamar ke-1 (Kosong, Terisi): ");
        String status1 = input01.next();
        KamarKos kamar1 = new KamarKos(harga1, no1, status1); // instansiasi menggunakan parameter
        kamar1.displayInfo();

        // tanpa parameter
        System.out.print("Masukkan nomor kamar ke-2: "); // masukkan nomor kamar dan harga sewa dan status
        int no2 = input01.nextInt();
        System.out.print("Masukkan harga sewa kamar ke-2: ");
        int harga2 = input01.nextInt();
        System.out.print("Masukkan status kamar ke-2 (Kosong, Terisi): ");
        String status2 = input01.next();
        KamarKos kamar2 = new KamarKos(); // pembuatan objek kamar2
        kamar2.nomorKamar = no2; // baris 27-29 inisialisasi nomor kamar, harga sewa dan status
        kamar2.hargaSewa = harga2;
        kamar2.status = status2;
        System.out.println("Nomor Kamar : " + kamar2.nomorKamar);
        System.out.println("Harga Sewa : " + kamar2.hargaSewa);
        
        System.out.print("Masukkan nomor kamar ke-3: "); // masukkan nomor kamar dan harga sewa dan status
        int no3 = input01.nextInt();
        System.out.print("Masukkan harga sewa kamar ke-3: ");
        int harga3 = input01.nextInt();
        System.out.print("Masukkan status kamar ke-3 (Kosong, Terisi): ");
        String status3 = input01.next();
        KamarKos kamar3 = new KamarKos();
        kamar3.nomorKamar = no3; // baris 40-42 inisialisasi nomor kamar, harga sewa dan status
        kamar3.hargaSewa = harga3;
        kamar3.status = status3;
        System.out.println("Nomor Kamar : " + kamar3.nomorKamar);
        System.out.println("Harga Sewa : " + kamar3.hargaSewa);

        // memanggil method ubahHargaSewa dan ubahStatus
        System.out.println("\nUbah harga sewa dan status kamar");
        System.out.print("Masukkan harga sewa baru kamar ke-1: ");
        int hargaBaru1 = input01.nextInt();
        System.out.print("Masukkan status baru kamar ke-1 (Kosong, Terisi): ");
        String statusBaru1 = input01.next();
        kamar1.ubahHargaSewa(hargaBaru1); // pemanggilan method ubahHargaSewa
        kamar1.ubahStatus(statusBaru1); // pemanggilan method ubahStatus
        kamar1.displayInfo();

        System.out.print("Masukkan harga sewa baru kamar ke-2: ");
        int hargaBaru2 = input01.nextInt();
        System.out.print("Masukkan status baru kamar ke-2 (Kosong, Terisi): ");
        String statusBaru2 = input01.next();
        kamar2.ubahHargaSewa(hargaBaru2); // pemanggilan method ubahHargaSewa
        kamar2.ubahStatus(statusBaru2); // pemanggilan method ubahStatus
        kamar2.displayInfo();

        System.out.print("Masukkan harga sewa baru kamar ke-3: ");
        int hargaBaru3 = input01.nextInt();
        System.out.print("Masukkan status baru kamar ke-3 (Kosong, Terisi): ");
        String statusBaru3 = input01.next();
        kamar3.ubahHargaSewa(hargaBaru3); // pemanggilan method ubahHargaSewa
        kamar3.ubahStatus(statusBaru3); // pemanggilan method ubahStatus
        kamar3.displayInfo();
        
    }
}
