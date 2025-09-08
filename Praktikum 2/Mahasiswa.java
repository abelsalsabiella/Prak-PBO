public class Mahasiswa {
    public String nim; // baris 2-5 deklarasi atribut sperti nim, nama, alamat, kelas
    public String nama;
    public String alamat;
    public String kelas;

    public void displayBiodata(){ // baris 7-11 pembuatan method displayBiodata
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kelas : " + kelas);
    }
}
