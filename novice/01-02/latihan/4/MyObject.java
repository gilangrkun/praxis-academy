public class MyObject {

    String NIK_1 = "12949910";
    String NIK_2 = "19489892";
    String nama1 = "Iron Man";
    String nama2 = "Captain America";

    public static void main(String[] args) {
        
        // pembuatan object
        MyObject myObj1 = new MyObject(); // Object 1
        MyObject myObj2 = new MyObject(); // Object 2

        System.out.println("Nama: " + myObj1.nama1);
        System.out.println("Nomor NIK: " + myObj1.NIK_1);
        System.out.println();
        System.out.println("Nama: " + myObj2.nama2);
        System.out.println("Nomor NIK: " + myObj2.NIK_2);

    }
}