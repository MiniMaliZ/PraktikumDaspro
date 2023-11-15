import java.util.Scanner;
public class TugasIndividu2_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        
        while (true) {
            System.out.print("Masukkan Angka Ganjil : ");
            a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Angka tersebut angka genap, Masukkan Lagi! : ");
            } else{
                break;
            }
        }

        int array[][] = new int[a][a];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i == (array[i].length - 1)) {
                    System.out.print(a);
                    System.out.print(" ");
                } else if (j > 0 || j < array.length) {
                    if (j == 0 || j == (array[j].length - 1)) {
                        System.out.print(a);
                        System.out.print(" ");
                    } else if (j > 0 || j < array[j].length) {
                        System.out.print(" ");
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}