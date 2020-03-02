import java.util.Scanner;

public class loopIfAndSwitch {

    public static void main(String[] args) {
        // deklarasi variabel dan tipe data
        int a;

        // ini statement for loop
        for(a = 1; a <= 10; a++) {

            // ini statement conditional yang dibuat di dalam for loop
            if(a <= 5) {
                System.out.println("Angka ini => " + a + ", lebih KECIL dari atau sama dengan 5");
            } else {
                System.out.println("Angka ini => " + a + ", lebih BESAR dari 5");
            }
        }

        System.out.println("\n\n");

        // ini statement while loop
        int i = 1;
        while(i <= 10) {

            // ini statement conditional yg berada di dalam while loop
            if(i <= 5) {
                System.out.println("di samping pasti tertulis angka antara 1 sampai 5 => " + i);
            } else {
                System.out.println("di samping pasti tertulis angka antara 6 sampai 10 => " + i);
            }
        
            i++;
        }

        System.out.println("\n\n");

        // ini statement switch
        Scanner in = new Scanner(System.in);
        System.out.print("input angka 1-7, untuk merepresentasikan hari dalam seminggu: ");
        int day = in.nextInt();
        
        System.out.println("\n");

        switch(day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }

        System.out.println("\n");
    }
}