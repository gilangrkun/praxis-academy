import java.util.Scanner;

public class MatriksInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahBaris, jumlahKolom;
       
        System.out.print("Masukkan jumlah baris: ");
        jumlahBaris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        jumlahKolom= input.nextInt();
        
        System.out.println();
        System.out.println("MATRIKS_1");
        int[][] arraySatu = new int[jumlahBaris][jumlahKolom];

        for(int i=0; i<jumlahBaris; i++) {
            for (int j=0; j<jumlahKolom; j++) {
                System.out.print("Masukkan isi indeks baris ke " + i + " kolom ke " + j + ": ");
                arraySatu[i][j] = input.nextInt();
            }
        
        }

        System.out.println();
        System.out.println("MATRIKS_2");
        int[][] arrayDua = new int[jumlahBaris][jumlahKolom];

        for(int i=0; i<jumlahBaris; i++) {
            for (int j=0; j<jumlahKolom; j++) {
                System.out.print("Masukkan isi indeks baris ke " + i + " kolom ke " + j + ": ");
                arrayDua[i][j] = input.nextInt();
            }
        
        }

        System.out.println();
        System.out.println("Bentuk MATRIKS_1:");
        for(int i=0; i<jumlahBaris; i++) {
            for (int j=0; j<jumlahKolom; j++) {
                System.out.print(arraySatu[i][j] + " ");
            }
        
        System.out.println();
        
        }

        System.out.println();
        System.out.println("Bentuk MATRIKS_2:");
        for(int i=0; i<jumlahBaris; i++) {
            for (int j=0; j<jumlahKolom; j++) {
                System.out.print(arrayDua[i][j] + " ");
            }
        
        System.out.println();
        
        }

        System.out.println();
        System.out.println("Hasil jumlah kedua matriks:");
        for(int i=0; i<jumlahBaris; i++) {
            for (int j=0; j<jumlahKolom; j++) {
                System.out.print(arraySatu[i][j] + arrayDua[i][j] + " ");
            }
        
        System.out.println();
        
        }
    }
}