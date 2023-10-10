import java.util.Scanner;
public class Autentikasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password, hasil;

        System.out.print("Masukkan Username : ");
        username = sc.nextLine();
        System.out.print("Masukkan Password : ");
        password = sc.nextLine();

        if (username.equals("Sufyan Dwi") && password.equals("Bagaskara") ) {
            hasil = "Anda berhasil masuk sistem";
        } else {
            hasil = "Username atau Password anda salah";
        }
        System.out.println(hasil);
    }
}
