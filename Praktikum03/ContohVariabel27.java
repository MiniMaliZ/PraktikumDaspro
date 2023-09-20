public class ContohVariabel27{
    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Bermain petak umpet";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 18;
        double ipk = 3.4, 
               tinggi = 173;

        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah Pandai?" + isPandai);
        System.out.println("Jenis Kelamin:" + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %S", umurSayaSekarang, tinggi));
    }
}