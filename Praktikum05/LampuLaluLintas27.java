import java.util.Scanner;
public class LampuLaluLintas27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String warnaLampu, rambu;

        System.out.println("Rambu Lalu Lintas : merah, kuning, hijau");
        System.out.print("Masukkan Warna Lampu Lalu Lintas : ");
        warnaLampu = sc.nextLine();

        switch (warnaLampu.toLowerCase()) {
            case "hijau":
                rambu = "Boleh Melintas";
                break;
            case "kuning":
                rambu = "Hati-Hati";
                break;
            case "merah":
                rambu = "Berhenti";
                break;
            default:
                rambu = "Warna Rambu Tidak Sesuai atau Tidak ada";
                break;
        }

        System.out.println("Rambu = " + rambu);
    }
}
