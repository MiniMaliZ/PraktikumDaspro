import java.util.Scanner;

public class PemilihanHariDenganIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayType;
        int dayNumber;

        System.out.print("Input Number : ");
        dayNumber = sc.nextInt();

        if (dayNumber <= 5) {
            dayType = "weekday";
        } else if (dayNumber >5 && dayNumber <= 7){
            dayType = "weekend";
        } else {
            dayType = "invalid number";
        }

        System.out.println(dayNumber + " is a " + dayType);
    }
}
