public class Matriks {

    public static void main(String[] args) {
        
        int matriks1[][] = new int[3][3];
        matriks1[0][0] = 4;
        matriks1[0][1] = 3;
        matriks1[0][2] = 3;
        matriks1[1][0] = 5;
        matriks1[1][1] = 2;
        matriks1[1][2] = 3;
        matriks1[2][0] = 8;
        matriks1[2][1] = 8;
        matriks1[2][2] = 3;

        int matriks2[][] = new int[3][3];
        matriks2[0][0] = 1;
        matriks2[0][1] = 3;
        matriks2[0][2] = 3;
        matriks2[1][0] = 2;
        matriks2[1][1] = 5;
        matriks2[1][2] = 3;
        matriks2[2][0] = 1;
        matriks2[2][1] = 8;
        matriks2[2][2] = 3;

        System.out.println("Matriks1:");
        for(int i=0; i<matriks1.length; i++) {
            for (int j=0; j<matriks1[0].length; j++) {
                System.out.print(matriks1[i][j] + " ");
            }
        
        System.out.println();
        
        }

        System.out.println();
        System.out.println("Matriks2:");
        for(int i=0; i<matriks2.length; i++) {
            for (int j=0; j<matriks2[0].length; j++) {
                System.out.print(matriks2[i][j] + " ");
            }
        
        System.out.println();
        
        }

        System.out.println();
        System.out.println("Hasil penjumlahan:");
        for(int i=0; i<matriks1.length; i++) {
            for (int j=0; j<matriks1[0].length; j++) {
                int result = matriks1[i][j] + matriks2[i][j];
                System.out.print(result + " ");
            }
        
        System.out.println();
        
        }
    }
}