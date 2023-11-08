import java.util.Scanner;

public class TugasKelompok9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jumlahBarang, hargaBarang, totalHarga, totalBayar, kembalian, hargaSetelahDiskon;
        String namaRoti, username, password;
        char member;

        hargaBarang = 0;

        // System.out.println("Masukkan Username");                                 
        // username = sc.nextLine();
        // System.out.println("Masukkan Password");                                 
        // password = sc.nextLine();

        // while (!username.equals("Sufyan") || !password.equals("Bagas"));
        // {
        //     System.out.println("input username");
        //     username = sc.nextLine();
        //     System.out.println("input pass");
        //     password = sc.nextLine();
        // }

        while (true) {
            System.out.print("Masukkan Username: ");
            username = sc.nextLine();
            System.out.print("Masukkan Password: ");
            password = sc.nextLine();

            if (username.equals("Sufyan") && password.equals("12345")) {
                break;
            }

            System.out.println("Username atau Password Salah");
        }
        
        System.out.println("Daftar Roti : Roti Abon, Roti Pizza, Roti Moy, Roti Sosis, Roti Milky Cheese");
        System.out.print("Masukkan Roti yang ingin di beli : ");
        namaRoti = sc.nextLine();

        if (namaRoti.toLowerCase().equals("roti abon")) {
            hargaBarang = 7500;
        } else if (namaRoti.toLowerCase().equals("roti pizza")) {
            hargaBarang = 6500;
        } else if (namaRoti.toLowerCase().equals("roti moy")) {
            hargaBarang = 7000;
        } else if (namaRoti.toLowerCase().equals("roti sosis")) {
            hargaBarang = 7000;
        } else if (namaRoti.toLowerCase().equals("roti milky cheese")) {
            hargaBarang = 6000;
        } else {
            System.out.println("Roti Tidak tersedia di daftar roti");
            return;
        }

        System.out.println("Harga Roti tersebut : " + hargaBarang);
        System.out.print("Masukkan Jumlah Roti : ");
        jumlahBarang = sc.nextInt();

        totalHarga = hargaBarang * jumlahBarang;
        System.out.println("Total Harga : " + totalHarga);

        while (true) {
            System.out.print("Apakah Punya Member (y/t) : ");
            member = sc.next().charAt(0);

            if (member == 'y') {
                if (totalHarga >= 50000 && totalHarga <= 100000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.10);
                    break;
                } else if (totalHarga > 100000 && totalHarga <= 150000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.20);
                    break;
                } else if (totalHarga > 150000){
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.30);
                    break;
                } else {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.00);
                    break;
                }
            } else if (member == 't') {
                if (totalHarga >= 50000 && totalHarga <= 100000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.5);
                    break;
                } else if (totalHarga > 100000 && totalHarga <= 150000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.15);
                    break;
                } else if (totalHarga > 150000){
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.25);
                    break;
                } else {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.00);
                    break;
                }
            } else {
                System.out.println("Member Tidak Diketahui");
            }
        }

        System.out.println("Total Harga Setelah Diskon : " + hargaSetelahDiskon);
        System.out.print("Masukkan Pembayaran : ");
        totalBayar = sc.nextInt();

        kembalian = totalBayar - hargaSetelahDiskon;
        System.out.println("Kembalian : " + kembalian);

    }
}