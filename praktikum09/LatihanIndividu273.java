import java.util.Scanner;
public class LatihanIndividu273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        String namaBulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        while (true) {
            System.out.print("Masukkan Angka 1-12: ");
            angka = sc.nextInt();

            if (angka < 1 || angka > 12) {
                System.out.println("Angka tidak ditemukan, coba lagi");
            } else {
                break;
            }
        }
        System.out.println("Nama Bulan ke-" + angka + " adalah " + namaBulan[angka - 1]);
    }
}