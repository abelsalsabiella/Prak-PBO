public class Pengguna {
    private static Pengguna instance;
    public String username;
    public String nama;
    public String email;

    // constructor private
    private Pengguna(String username, String nama, String email) {
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    // method untuk ambil objek
    public static Pengguna getInstance(String username, String nama, String email) {
        if (instance == null) {
            instance = new Pengguna(username, nama, email);
        }
        return instance;
    }
}