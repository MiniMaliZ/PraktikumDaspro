import java.util.Scanner;
public class LatihanIndividu274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bulat[] = new double[8];
        double total = 0, rataRata;

        for (int i = 0; i < bulat.length; i++) {
            System.out.print("Masukkan Angka Bulat : ");
            bulat[i] = sc.nextDouble();

            total += bulat[i];
        }

        rataRata = total / bulat.length;
        System.out.println(rataRata);
    }
}
