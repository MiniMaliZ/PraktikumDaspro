import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int elemen, key, hasil = -1;

        System.out.print("Masukkan jumlah elemen array : ");
        elemen = sc.nextInt();

        int[] arrayInt = new int[elemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + (i) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada di posisi indeks ke-" + hasil);
            }
        }

        if (hasil == -1) {
            System.out.println("Key tidak ditemukan");
        }

        sc.close();
    }
}