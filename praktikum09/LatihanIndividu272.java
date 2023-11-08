import java.util.Scanner;
public class LatihanIndividu272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrayInt [] = new int[10];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan Nilai di Indeks ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        for (int i = arrayInt.length; i > 0; i--) {
            System.out.println(arrayInt[i-1]);
        }
    }
}
