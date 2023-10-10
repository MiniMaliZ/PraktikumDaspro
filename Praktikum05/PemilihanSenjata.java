import java.util.Scanner;
public class PemilihanSenjata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jarak;
        String senjata;

        System.out.print("Masukkan Jarak : ");
        jarak = sc.nextDouble();

        if (jarak <= 5) {
            senjata = "Melee Weapon";
        } else {
            senjata = "Ranged Weapon";
        }

        System.out.println("Senjata termasuk : " + senjata);
    }
}
