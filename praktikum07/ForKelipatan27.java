import java.util.Scanner;
public class ForKelipatan27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rataRata;
        int bilangan, counter, total;
        total = 0;
        counter = 0;

        System.out.print("Masukkan bilangan 1-9 : ");
        bilangan =  sc.nextInt();

        for (int i = 0; i < 50; ++i) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
            }
        }

        rataRata = (double) total / counter;

        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
        System.out.println("");
        System.out.println("Rata - rata : " + rataRata);
    }
}