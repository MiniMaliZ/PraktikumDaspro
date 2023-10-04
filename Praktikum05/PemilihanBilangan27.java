import java.util.Scanner;
public class PemilihanBilangan27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan Angka : ");
        angka = sc.nextInt();

        // if(angka % 2 == 0){
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");
        // } else {
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        String result = (angka % 2 == 0) ? ("Angka " + angka + " termasuk bilangan genap"):("Angka " + angka + " termasuk bilangan ganjil");
        System.out.println(result);
    }
}