import java.util.Scanner;

public class Individu27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minggu, jumlahSiswa;

        System.out.print("Minggu: ");
        minggu = sc.nextInt();
        System.out.print("Jumlah Siswa: ");
        jumlahSiswa = sc.nextInt();

        System.out.println();

        int nilaiMahasiswa[][] = new int[minggu][jumlahSiswa];

        input(nilaiMahasiswa);
        tampilNilai(nilaiMahasiswa);
        nilaiTertinggi(nilaiMahasiswa);
    }

    static void input(int[][] arr){
        for (int j = 0; j < arr.length; j++) {
            System.out.println("Minggu " + (j + 1) + " :");
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print("Nilai Mahasiswa " + (k + 1) + " : ");
                Scanner sc = new Scanner(System.in);
                arr[j][k] = sc.nextInt();
                // System.out.println();
            }
        }
    }

    static void tampilNilai(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Minggu " + (i + 1) + " :");
            // System.out.println();
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Nama " + (j + 1) + " : " + arr[i][j]);
                // System.out.println();
            }
        }
    }

    static void nilaiTertinggi(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int tertinggi = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (tertinggi < arr[i][j]) {
                    tertinggi = arr[i][j];
                }
            }
            System.out.println("Nilai Tertinggi Minggu ke-" + (i+1) + " adalah: " + tertinggi);
        }
    }
}
