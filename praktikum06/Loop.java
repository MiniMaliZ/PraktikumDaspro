import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // String nama, jenisKelamin;
        // int i = 1;

        // while (i <= 30) {
        //     System.out.print("Masukkan Nama Siswa : ");
        //     nama = sc.nextLine();
        //     System.out.println("Masukkan Jenis Kelamin : Laki-laki = 'l' Perempuan = 'p'");
        //     System.out.print("Masukkan Jenis Kelamin : ");
        //     jenisKelamin = sc.nextLine();

        //     i++;

        //     if(jenisKelamin.equalsIgnoreCase("l")){
        //         continue;
        //     }

        //     if(jenisKelamin.equalsIgnoreCase("l")){
        //         System.out.println(nama);
        //     } else if (jenisKelamin.equalsIgnoreCase("p")){
        //         System.out.println(nama);
        //     } else {
        //         System.out.println("Jenis Kelamin Tidak Ditemukan");
        //     }
        // }

        int jumlah = 0;

        for (int i = 25; i >=1 ; i--) {
            jumlah = jumlah + i;
        }
        System.out.println(jumlah);
    }
}