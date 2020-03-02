public class loopIfAndSwitch {

    public static void main(String[] args) {
        // deklarasi variabel dan tipe data
        int a;

        // ini statement for loop
        for(a = 1; a <= 10; a++) {
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
            if(i <= 5) {
                System.out.println("di samping pasti tertulis angka antara 1 sampai 5 => " + i);
            } else {
                System.out.println("di samping pasti tertulis angka antara 6 sampai 10 => " + i);
            }
        
            i++;
        }

    }
}