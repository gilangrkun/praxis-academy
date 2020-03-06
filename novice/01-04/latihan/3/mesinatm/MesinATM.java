package mesinatm;

import java.util.Scanner;
import java.io.*;
public class MesinATM {  
     
    public static void cekSaldo() {
        System.out.println("\tSaldo anda saat ini adalah " + InfoSaldo.saldoAkhir());
    }
   
    public static void penarikanUang() {
        
        if(InfoSaldo.saldo==0) {
            System.out.println("\tSaldo anda saat ini adalah 0.");
            System.out.println("\tAnda tidak dapat menarik uang!");
            System.out.println("\tAnda perlu menabung terlebih dahulu.");
        }

        else if(InfoSaldo.saldo<=50000) {
            System.out.println("\tSaldo anda tidak cukup untuk dilakukan penarikan.");
            System.out.println("\tCek saldo anda untuk mengetahui jumlah tabungan anda.");
        }

        else if(TarikUang.penarikan > InfoSaldo.saldo) {
            System.out.println("\tJumlah penarikan anda melebihi saldo anda!");
            System.out.println("\tPerhatikan jumlah penarikan anda.");
        }
        
        else {
            InfoSaldo.saldo = InfoSaldo.saldo - TarikUang.penarikan;
            System.out.println("\n\tAnda menarik uang sebesar " + TarikUang.penarikan);
        }
    }
                   
    public static void menabung() {
        System.out.println("\tAnda menabung sebesar " + SetorTabungan.tabunganAkhir());
    }
   
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int select = 0;
        int choice = 0;
       
        System.out.println("====================================================");
        System.out.println("\tSelamat datang di MesinATM");
        System.out.println("====================================================");
        System.out.println();
       
        do {
            try {    
                do {
               
                    System.out.println("\tPilih menu transaksi: ");
                    System.out.println("\tPress [1] Setor Tabungan");
                    System.out.println("\tPress [2] Tarik Uang");
                    System.out.println("\tPress [3] Informasi Saldo");
                    System.out.println("\tPress [4] Keluar");
               
                    System.out.print("\n\tPilihan anda: ");
                    select = read.nextInt();
   
                        if(select>4) {
                            System.out.println("\n\tHarap memilih menu transaksi dengan benar.");
                        }
                        
                        else {
                            switch (select) {
                            case 1:
                                System.out.print("\n\tMasukkan jumlah uang yang ingin ditabung: ");
                                SetorTabungan.tabungan = read.nextDouble();
                                InfoSaldo.saldo = SetorTabungan.tabungan + InfoSaldo.saldo;
                                menabung();
                                break;
                               
                            case 2:
                               
                                System.out.print("\n\tUntuk menarik uang, pastikan saldo anda cukup.");
                                System.out.println();
                                System.out.print("\tMasukkan jumlah saldo yang ingin ditarik: ");
                                TarikUang.penarikan = read.nextDouble();
                                penarikanUang();
                                break;
                               
                            case 3:
                                cekSaldo();
                                break;
                           
                            default:
                                System.out.print("\n\tTransaksi selesai.");
                                break;
                               
                            }
                        }               
      
                } while(select>4);
           
                do {
                    try {
                        System.out.println("\n\tLanjutkan transaksi lain?");
                        System.out.println("\n\tTekan [1] Ya \n\tTekan [2] Tidak");
                        System.out.print("\tPilihan anda: ");
                        choice = read.nextInt();
                
                            if(choice>2) {
                                System.out.print("\n\tHarap memilih pilihan dengan sesuai.");
                            }
                    }
                    
                    catch(Exception e) {
                            System.out.println("\tSalah ketik! Harap masukkan angka!");
                            read = new Scanner(System.in);
                            System.out.println("\tPilihan anda:");
                            choice = read.nextInt();
                    }
                    
                } while(choice>2);
            }

            catch(Exception e) {
                    System.out.println("\tSalah ketik! Harap masukkan angka!");
                    read = new Scanner(System.in);
                    System.out.println("\tPilihan anda:");
                    select = read.nextInt();
            }
               
        } while(choice<=1);
       
        System.out.println("\n\tTerima kasih telah bertransaksi di MesinATM.");
    }
}
