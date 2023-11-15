import java.util.Scanner;
public class NestedLoop27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rataRata = 0;
        int kota;

        System.out.print("Masukkan Jumlah Kota : ");
        kota = sc.nextInt();

        double temps[][]= new double[kota][4];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("KOTA KE-" + (i+1) + ": ");
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Suhu ke-" + (j+1) + ": ");
                temps[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("KOTA KE-" + (i+1) + ": ");
            for (double temp : temps[i]) {
                System.out.println(temp);
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Rata-Rata Suhu di Kota KE-" + (i+1) + " adalah : ");
            double total = 0;
            for (int j = 0; j < temps[i].length; j++) {
                total = total + temps[i][j];
            }
            rataRata = total / temps[i].length;
            System.out.println(rataRata);
        }
        sc.close();
    }
}
