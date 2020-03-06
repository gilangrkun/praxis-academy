package mesinatm;

public class TarikUang extends MesinATM {

    static double penarikan = 0;   
    
    public void jmlPenarikan(double w) {
        penarikan = w;
    }

    public static double hasilPenarikan() {
        return penarikan;
    }
}