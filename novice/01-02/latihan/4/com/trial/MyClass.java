// nama package
package com.trial;

// pembuatan class untuk data mahasiswa
class Mahasiswa {
    String nama;
    String NPM;
    String fakultas;
    String jurusan;
    double IPK;
    int umur;
}

public class MyClass {

    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa(); // pembuatan object

        mahasiswa1.nama = "Iron Man";
        mahasiswa1.NPM = "28748287";
        mahasiswa1.fakultas = "Teknik";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 3.5;
        mahasiswa1.umur = 24;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NPM);
        System.out.println(mahasiswa1.fakultas);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);
    }
}