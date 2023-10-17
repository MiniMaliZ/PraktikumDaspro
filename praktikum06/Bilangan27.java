import java.util.Scanner;

public class Bilangan27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan1, bilangan2, bilangan3, max, middle, min;
        max = 0;
        middle = 0;
        min = 0;

        System.out.print("Masukkan Bilangan 1 : ");
        bilangan1 = sc.nextInt();
        System.out.print("Masukkan Bilangan 2 : ");
        bilangan2 = sc.nextInt();
        System.out.print("Masukkan Bilangan 3 : ");
        bilangan3 = sc.nextInt();

        if (bilangan1 > bilangan2) {
            if(bilangan1 > bilangan3){
                max = bilangan1;
                if (bilangan2 > bilangan3) {
                    middle = bilangan2;
                    min = bilangan3;
                } else {
                    middle = bilangan3;
                    min = bilangan2;
                }
            } else {
                max = bilangan3;
                if (bilangan1 > bilangan2) {
                    middle = bilangan1;
                    min = bilangan2;
                } else {
                    middle = bilangan2;
                    min = bilangan1;
                }
            }
        } else {
            if(bilangan2 > bilangan3){
                max = bilangan2;
                if(bilangan1 > bilangan3){
                    middle = bilangan1;
                    min = bilangan3;
                } else {
                    middle = bilangan3;
                    min = bilangan1;
                }
            } else {
                max = bilangan3;
                if(bilangan1 > bilangan2){
                    middle = bilangan1;
                    min = bilangan2;
                } else {
                    middle = bilangan2;
                    min = bilangan1;
                }
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Middle : " + middle);
        System.out.println("Min : " + min);
    }
}