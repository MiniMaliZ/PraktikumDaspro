import java.util.Scanner;
public class ArrayNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        double max = 0, min = 100, total = 0, rataRata = 0, jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();

            if (nilaiAkhir[i] > max) {
                max = nilaiAkhir[i];
            } else if (nilaiAkhir[i] < min) {
                min = nilaiAkhir[i];
            }
            total += nilaiAkhir[i];
        }

        rataRata = total/nilaiAkhir.length;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus");
                jumlahLulus ++;
            } else {
                System.out.println("Mahasiswa ke-" + (i+1) + " Tidak lulus");
                jumlahTidakLulus ++;
            }
        }

        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah : " + min);
        System.out.println("Nilai rata-rata : " + rataRata);
        System.out.println("Jumlah Lulus : " + jumlahLulus);
        System.out.println("Jumlah Tidak Lulus : " + jumlahTidakLulus);

    }
}