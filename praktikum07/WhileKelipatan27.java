import java.util.Scanner;
public class WhileKelipatan27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rataRata;
        int bilangan, counter, total, i;
        total = 0;
        counter = 0;
        i = 0;

        System.out.print("Masukkan bilangan 1-9 : ");
        bilangan =  sc.nextInt();

        while (i < 50) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
            }
            i++;
        }

        rataRata = (double) total / counter;

        System.out.printf("Pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
        System.out.println("");
        System.out.println("Rata - rata : " + rataRata);
    }
}
