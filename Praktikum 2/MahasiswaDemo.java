public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // baris 3-7 instansiasi objek m1
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata(); // pemanggilan method displayInfo

        Mahasiswa m2 = new Mahasiswa(); // baris 10-14 instansiasi objek m2
        m2.nim = "023352";
        m2.nama = "Amanda Dealova";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2b";
        m2.displayBiodata(); // pemanggilan method displayInfo

        Mahasiswa m3 = new Mahasiswa(); // baris 17-21 instansiasi objek m3
        m3.nim = "023838";
        m3.nama = "Rafael Sinar Baskoro";
        m3.alamat = "Tuban, Jawa Timur";
        m3.kelas = "2E";
        m3.displayBiodata(); // pemanggilan method displayInfo
    }
}
