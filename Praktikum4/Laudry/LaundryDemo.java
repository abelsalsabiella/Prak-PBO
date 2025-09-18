
import java.time.LocalDate;

public class LaundryDemo {

    public static void main(String[] args) {
        Customer c1 = new Customer("C001", "Budi", "Jl. Mawar No.10", "08123456789");
        Customer c2 = new Customer("C002", "Sinta", "Jl. Melati No.5", "08198765432");

        LaundryOrder o1 = new LaundryOrder("O001", LocalDate.of(2025, 9, 18));
        o1.tambahItem(new Item("Kemeja", 1.5, "express"));
        o1.tambahItem(new Item("Sprei", 2.0, "dry clean"));

        c1.buatOrder(o1);

        // Tampilkan customer dengan order
        System.out.println(c1.getInfo());
        System.out.println();

        // Tampilkan customer tanpa order
        System.out.println(c2.getInfo());
    }
}
