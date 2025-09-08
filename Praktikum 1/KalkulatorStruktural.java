import java.util.Scanner;

public class KalkulatorStruktural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // menerima input angka1, operator, dan angka2 dan menampilkan hasilnya ke layar
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = input.next();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        if (operator.equals("+")) {
            System.out.println("Hasil: " + (angka1 + angka2));
        } else if (operator.equals("-")) {
            System.out.println("Hasil: " + (angka1 - angka2));
        } else if (operator.equals("*")) {
            System.out.println("Hasil: " + (angka1 * angka2));
        } else if (operator.equals("/")) {
            System.out.println("Hasil: " + (angka1 / angka2));
        }
        input.close();
    }
}