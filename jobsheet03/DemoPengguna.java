public class DemoPengguna {
    public static void main(String[] args) {
        Pengguna Pengguna1 = Pengguna.getInstance("annisa.nadya", "Annisa Nadya", "annisa.nadya@gmail.com");
        Pengguna Pengguna2 = Pengguna.getInstance("budi", "Budi", "budi@gmail.com");

        // Kedua objek ini sebenarnya sama, tidak dibuat ulang
        System.out.println(Pengguna1 == Pengguna2);
    }
}
