// mengambilfile class Mahasiswa yang sudah dibuat dari package gilang
import gilang.Mahasiswa;

// ini merupakan kelas utama
public class Main {
    
    // kelas utama harus memiliki method main
    public static void main(String[] args) {
        
        // ini merupakan object
        Mahasiswa mahasiswa1 = new Mahasiswa("Mas Kuntiarso", "Perikanan", 3.9);

        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa("Mas Gilgil", "Kelautan", 3.5);

        System.out.println();

        Mahasiswa mahasiswa3 = new Mahasiswa("Mas Bambang", "Teknik Kapal", 3.3);

    }
}