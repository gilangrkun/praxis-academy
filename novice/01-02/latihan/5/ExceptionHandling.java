import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjutkanInput = true;

        do {
            try {
                System.out.println("Masukkan integer: ");
                int angka1 = input.nextInt();

                System.out.println("Angka yang anda masukkan adalah " + angka1);
                lanjutkanInput = false;
            }

            catch(InputMismatchException ex) {
                System.out.println("Coba lagi. (Input valid: Sebuah integer diperlukan.)");
                input.nextLine();
            }
        } while(lanjutkanInput);

        System.out.println();
        System.out.println("Data anda telah berhasil diinput!");
    
    }
}