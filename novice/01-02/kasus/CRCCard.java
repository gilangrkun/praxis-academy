import java.util.Scanner;

class Makanan {
    // Data Makanan
    String nama;
    int harga;
    boolean stok = true;

    // contructor
    Makanan(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // method
    void show() {
        System.out.print(this.nama + ": ");
        System.out.println("Rp" + this.harga);
    }

    void ubahNama(String nama) {
        this.nama = nama;
    }

    void ubahHarga(int harga) {
        this.harga = harga;
    }

    void ubahStok(boolean stok) {
        this.stok = false;
    }
}

// class Menu {
//     String[] listMenu;

//     void listMenu() {

//     }
// }

// class Pesanan {
//     String[] listMakanan;
//     int jumlahHarga;
// }


public class CRCCard {
    public static void main(String[] args) {
        Makanan food1 = new Makanan("Rendang", 13000);
        Makanan food2 = new Makanan("Ayam Goreng", 8500);
        Makanan food3 = new Makanan("Ayam Bakar", 12000);
        Makanan food4 = new Makanan("Sate Padang", 15000);
        Makanan food5 = new Makanan("Mango Sticky Rice", 19000);
        Makanan food6 = new Makanan("Cheese Toast", 17900);
        Makanan food7 = new Makanan("Es Teh Manis", 4900);
        Makanan food8 = new Makanan("Coffee Latte", 11500);

        food1.show();
        food1.ubahNama("Ikan Bakar");
        food1.ubahHarga(16000);
        food1.show();

        food2.show();
        food3.show();
        food4.show();
        food5.show();
        food6.show();
        food7.show();
        food8.show();

        
    }
}