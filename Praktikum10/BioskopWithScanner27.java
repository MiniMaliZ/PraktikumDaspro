import java.util.Scanner;
public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama : ");
            nama = sc.nextLine();
            System.out.print("Masukkan Baris : ");
            baris = sc.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = sc.nextInt();
            sc.nextLine();

            if(baris > penonton.length || kolom > penonton[0].length){
                System.out.println("Baris atau Kolom tidak tersedia, Silahkan Masukkan lagi");
                continue;
            }
            
            while (penonton[baris-1][kolom-1] != null) {
                System.out.println("Kursi Telah Terisi Silahkan Coba Lagi");
                System.out.print("Masukkan Baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan Kolom : ");
                kolom = sc.nextInt();
                sc.nextLine();
            }

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
