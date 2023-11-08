import java.util.Scanner;
public class Lingkaran27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;
        double keliling, phi,  luas ;

        phi = 3.14;
        
        System.out.print("Masukkan Jari-jari Lingkaran: ");
        r = sc.nextInt();

        keliling = 2 * phi * r;
        luas = phi * r * r;

        System.out.println("Keliling: " + keliling + "cm");
        System.out.println("Luas: " + luas + "cm");
    }
}