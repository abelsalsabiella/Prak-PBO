
import java.util.Scanner;

public class DemoPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menggunakan parameter
        System.out.print("Masukkan panjang pesergi1 : "); // masukkan panjang dan lebar persegi1
        int p1 = input.nextInt();
        System.out.print("Masukkan lebar persegi1 : ");
        int l1 = input.nextInt();
        PersegiPanjang persegi1 = new PersegiPanjang(p1, l1);
        System.out.println("Luas : " + persegi1.getLuas());
        System.out.println("Keliling : " + persegi1.getKeliling());

        System.out.print("Masukkan panjang persegi2 : "); // masukkan panjang dan lebar persegi2
        int p2 = input.nextInt();
        System.out.print("Masukkan lebar persegi2 : ");
        int l2 = input.nextInt();
        PersegiPanjang persegi2 = new PersegiPanjang(p2, l2);
        System.out.println("Luas : " + persegi2.getLuas());
        System.out.println("Keliling : " + persegi2.getKeliling());

        System.out.print("Masukkan panjang persegi3 : "); // masukkan panjang dan lebar persegi3
        int p3 = input.nextInt();
        System.out.print("Masukkan lebar persegi3 : ");
        int l3 = input.nextInt();
        PersegiPanjang persegi3 = new PersegiPanjang(p3, l3);
        System.out.println("Luas : " + persegi3.getLuas());
        System.out.println("Keliling : " + persegi3.getKeliling());

        // tanpa parameter
        PersegiPanjang persegi4 = new PersegiPanjang();
        System.out.print("Masukkan panjang persegi4 : "); // masukkan panjang dan lebar persegi4
        int p4 = input.nextInt();
        System.out.print("Masukkan lebar persegi4 : ");
        int l4 = input.nextInt();
        persegi4.panjang = p4;
        persegi4.lebar = l4;
        System.out.println("Luas : " + persegi4.getLuas());
        System.out.println("Keliling : " + persegi4.getKeliling());
    }
}
