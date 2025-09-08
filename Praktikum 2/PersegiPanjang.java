public class PersegiPanjang { // pembuatan class PersegiPanjang
    public int panjang, lebar; // deklarasi atribut panjang dan lebar

    public PersegiPanjang() {
    }

    public PersegiPanjang(int panjang, int lebar) { // pembuatan constructor PersegiPanjang
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public void displayInfo() { // baris 4-7 pembuatan method displayInfo seperti panjang dan lebar
        System.out.println("-------------------------------");
        System.out.println("Persegi Panjang");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar : " + lebar);
        System.out.println("-------------------------------");
    }

    public int getLuas() { // pembuatan method getLuas untuk mencari luas persegi panjang
        return panjang * lebar;
    } 

    public int getKeliling() { // pembuatan method getKeliling untuk mencari keliling persegi panjang
        return 2 * (panjang + lebar);
    }
}
