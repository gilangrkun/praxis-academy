public class varDanTipeData {

    public static void main(String[] args) {
        // deklarasi variabel dgn berbagai tipe data
        String nama;
        byte nomorSepatu;
        int x, y;
        double gravitasi;
        boolean namaDepan;
        
        // expression pada variabel yg sudah di deklarasi sesuai dgn tipe data
        nama = "gilangrkun";
        nomorSepatu = 42;

        // menanmpilkan hasil
        System.out.println("Nama saya: " + nama + "\nsaya memakai sepatu berukuran: " + nomorSepatu);

        x = 10;
        y = 20;
        
        // ini statement karena variabel tipe data dan expression dibuat secara komplit
        int result = x + y;

        System.out.println("\nhasil dari " + x + " + " + y + " adalah: " + result);

        gravitasi = 9.8;

        System.out.println("\nkecepatan gaya gravitasi bumi yaitu: " + gravitasi);

        if(namaDepan=true) {
            System.out.println("\nYappp.. betul!");
        } else {
            System.out.println("\nMaaf ada kesalahan!");
        }

    }
}