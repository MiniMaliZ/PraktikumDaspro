public class CobaArgs27 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hai, Selamat Datang");
        }
        if (args.length > 0) {
            System.out.println("Hai " + args[0]);
            System.out.println("Selamat Datang di " + args[1]);
        }

        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
    }
}
