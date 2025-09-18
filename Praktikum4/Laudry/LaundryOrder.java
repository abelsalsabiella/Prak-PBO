import java.time.LocalDate;
import java.util.ArrayList;

public class LaundryOrder {
    private String idOrder;
    private LocalDate tanggal;
    private String status;
    private ArrayList<Item> items;

    public LaundryOrder(String idOrder, LocalDate tanggal) {
        this.idOrder = idOrder;
        this.tanggal = tanggal;
        this.status = "Diproses";
        this.items = new ArrayList<Item>();
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void tambahItem(Item item) {
        items.add(item);
    }

    public double hitungTotalBerat() {
        double total = 0;
        for (Item i : items) {
            total += i.getBerat();
        }
        return total;
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Item i : items) {
            total += i.getHarga();
        }
        return total;
    }

    public void updateStatus(String statusBaru) {
        this.status = statusBaru;
    }

    public void lihatItem() {
        if (items.isEmpty()) {
            System.out.println("Belum ada item di order ini.");
        } else {
            for (Item i : items) {
                System.out.println(i.getInfo());
            }
        }
    }

    public String getInfo() {
        String info = "";
        info += "\tID Order   : " + this.idOrder + "\n";
        info += "\tTanggal    : " + this.tanggal + "\n";
        info += "\tStatus     : " + this.status + "\n";

        if (items.isEmpty()) {
            info += "\tBelum ada item di order ini";
        } else {
            info += "\tDaftar Item :\n";
            for (Item item : items) {
                info += item.getInfo();
            }
            info += "\tTotal Berat: " + hitungTotalBerat() + " kg\n";
            info += "\tTotal Harga: Rp" + hitungTotalHarga();
        }
        info += "\n";
        return info;
    }
}
