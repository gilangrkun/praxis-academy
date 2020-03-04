package my_interface;

interface Mobil {
    public void carBrand();
    public void carTipe();
}

interface Motor {
    public void motorBrand();
    public void motorTipe();
}

public class Interface implements Mobil, Motor {
    
    public void carBrand() {
        System.out.println("Mercedes-Benz");
    }

    public void carTipe() {
        System.out.println("s-class");
    }

    public void motorBrand() {
        System.out.println("Ducati");
    }

    public void motorTipe() {
        System.out.println("Pannigale");
    }

    public static void main(String[] args) {
        Interface kendaraan = new Interface();
        kendaraan.carBrand();
        kendaraan.carTipe();
        kendaraan.motorBrand();
        kendaraan.motorTipe();
    }

}