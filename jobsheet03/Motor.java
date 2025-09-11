
public class Motor {

    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("=========================");
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public boolean getIsMesinOn() {
        return isMesinOn;
    }

    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif, diset ke 0");
            this.kecepatan = 0;
        } else if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal adalah 100, kecepatan diset ke 100");
            this.kecepatan = 100;
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public int getKecepatan() {
        return kecepatan;
    }
}
