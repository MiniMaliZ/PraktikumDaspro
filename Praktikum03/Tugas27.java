import java.util.Scanner;
public class Tugas27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaBarang, jumlahBarang, totalHarga, totalBayar, kembalian;

        hargaBarang = 7000;

        System.out.println("Harga Barang: " + hargaBarang);
        System.out.print("Masukkan Jumlah Barang yang akan di beli: ");
        jumlahBarang = sc.nextInt();

        totalHarga = hargaBarang * jumlahBarang;

        System.out.println("Total Harga: " + totalHarga);
        System.out.print("Masukkan Total Pembayaran anda: ");
        totalBayar = sc.nextInt();

        kembalian = totalBayar - totalHarga;

        System.out.println("Kembalian: " + kembalian);
    }
}
