import java.util.Scanner;
public class Bank27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tabunganAwal, TabunganAkhir, bunga, persentaseBunga;
        int lamaMenabung;

        persentaseBunga = 0.0002;

        System.out.print("Masukkan Jumlah tabungan awal: ");
        tabunganAwal = sc.nextDouble();
        System.out.print("Masukkan Lama Menabung: ");
        lamaMenabung = sc.nextInt();

        bunga = persentaseBunga * lamaMenabung * tabunganAwal;
        TabunganAkhir = tabunganAwal + bunga;

        System.out.println("Bunga: " + bunga);
        System.out.println("Tabungan Akhir: " + TabunganAkhir);
    }
}
