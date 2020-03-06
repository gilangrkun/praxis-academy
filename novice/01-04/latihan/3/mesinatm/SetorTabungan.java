package mesinatm;

public class SetorTabungan extends MesinATM {

    static double tabungan;
    
    public void tabunganAwal(double d) {
     tabungan = d;
    }

    public static double tabunganAkhir() {
        return tabungan;
    }
}