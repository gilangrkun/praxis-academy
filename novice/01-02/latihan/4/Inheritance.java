package com.trial;

// class
class Mahasiswa {
    String dataString = "Iron Man";
    int dataInteger = 0;
}

public class Inheritance {
    public static void main(String[] args) {
        
        Mahasiswa myObj = new Mahasiswa();

        System.out.println(myObj.dataString);
        System.out.println(myObj.dataInteger);
    }
}