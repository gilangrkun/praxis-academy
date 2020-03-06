package mesinatm;

public class InfoSaldo extends MesinATM {

    static double saldo = 0;
    
    public void saldoAwal(double b) {
        saldo = b;
    }

    public static double saldoAkhir() {
        return saldo;
    }   
}
