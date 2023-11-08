import java.util.Scanner;
public class array2dimensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int [][] arrayInt = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9},
        //   };
          
        //   int diagonal1 = arrayInt[0][0] + arrayInt[1][1] + arrayInt[2][2];
        //   System.out.println(diagonal1);
        //   int diagonal2 = arrayInt[0][2] + arrayInt[1][1] + arrayInt[2][0];
        //   System.out.println(diagonal2);
          
        //   int total = diagonal1 - diagonal2;
        //   System.out.println(total);

        double suhu [][] = new double[5][7];
        int kota, hari;
        double tempSuhu;

        for (int i = 0; i < suhu.length; i++) {
            kota = i;
            System.out.println("Kota " + (kota + 1));
            for (int j = 0; j < suhu[0].length; j++) {
                hari = j;
                System.out.print("Masukkan Temperatur Suhu Hari ke-" + (j + 1) + " :");
                tempSuhu = sc.nextDouble();
                suhu[kota][hari] = tempSuhu;
            }
        }

        System.out.print("Pilih Kota: ");
        kota = sc.nextInt();
        System.out.print("Pilih Hari: ");
        hari = sc.nextInt();

        System.out.println(suhu[kota-1][hari-1]);
    }
}
