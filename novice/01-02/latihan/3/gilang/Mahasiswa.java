// direktori package
package gilang;

// class Mahasiswa akan disimpan di package gilang
public class Mahasiswa {
    
    // variables
    String nama;
    String jurusan;
    double IPK;

    // contructor
    public Mahasiswa(String inputNama, String inputJurusan, double inputIPK) {
        nama = inputNama;
        jurusan = inputJurusan;
        IPK = inputIPK;

        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(IPK);
    }
}