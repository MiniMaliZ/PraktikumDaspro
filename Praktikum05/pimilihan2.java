import java.util.Scanner;
public class pimilihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int bilangan1, bilangan2, bilangan3;
        // String hasil;

        // System.out.print("Masukkan Bilangan 1 : ");
        // bilangan1 = sc.nextInt();
        // System.out.print("Masukkan Bilangan 2 : ");
        // bilangan2 = sc.nextInt();
        // System.out.print("Masukkan Bilangan 3 : ");
        // bilangan3 = sc.nextInt();

        // if (bilangan1 > bilangan2) {
        //     if(bilangan1 > bilangan3){
        //         hasil = "Bilangan 1 lebih besar dari 2 dan 3";
        //     } else {
        //         hasil = "Bilangan 3 lebih besar dari 1 dan 2";
        //     }
        // } else {
        //     if(bilangan2 > bilangan3){
        //         hasil = "Bilangan 2 lebih besar dari 1 dan 3";
        //     } else {
        //         hasil = "Bilangan 3 lebih besar dari 1 dan 2";
        //     }
        // }
        // System.out.println("Bilangan yang terbesar adalah : " + hasil);

        String jenisBuku, diskon;
        int jumlahBuku;
        
        System.out.println("Jenis Buku : kamus, novel, dll");
        System.out.print("Masukkan Jenis Buku yang ingin dibeli : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku yang ingin dibeli : ");
        jumlahBuku = sc.nextInt();

        if(jenisBuku.toLowerCase().equals("kamus")){
            if(jumlahBuku > 2){
                diskon = "12%";
            } else {
                diskon = "10%";
            }
        } else if(jenisBuku.toLowerCase().equals("novel")){
            if(jumlahBuku > 3){
                diskon = "9%";
            } else {
                diskon = "8%";
            }
        } else {
            if(jumlahBuku > 3){
                diskon = "5%";
            } else {
                diskon = "0%";
            }
        }
        System.out.println("Diskon yang anda dapatkan sebesar " + diskon);
    }
}
