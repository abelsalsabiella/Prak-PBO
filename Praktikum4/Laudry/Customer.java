import java.util.ArrayList;

public class Customer {
    private String idCustomer;
    private String nama;
    private String alamat;
    private String noTelp;
    private ArrayList<LaundryOrder> orders;

    public Customer(String idCustomer, String nama, String alamat, String noTelp) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.orders = new ArrayList<>();
    }
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }   
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void buatOrder(LaundryOrder order) {
        orders.add(order);
    }

    public void lihatOrder() {
        if (orders.isEmpty()) {
            System.out.println("Belum ada order.");
        } else {
            for (LaundryOrder order : orders) {
                System.out.println(order.getInfo());
            }
        }
    }

    public void hapusOrder(String idOrder) {
        orders.removeIf(order -> order.getIdOrder().equals(idOrder));
        System.out.println("Order dengan ID " + idOrder + " dihapus (beserta item di dalamnya).");
    }


    public String getInfo() {
        String info = "";
        info += "ID Customer: " + idCustomer + "\n";
        info += "Nama       : " + nama + "\n";
        info += "Alamat     : " + alamat + "\n";
        info += "No. Telp   : " + noTelp + "\n";

        if (orders.isEmpty()) {
            info += "Belum ada order laundry\n";
        } else {
            info += "Riwayat Order Laundry:\n";
            for (LaundryOrder order : orders) {
                info += order.getInfo();
            }
        }
        info += "\n";
        return info;
    }
}
